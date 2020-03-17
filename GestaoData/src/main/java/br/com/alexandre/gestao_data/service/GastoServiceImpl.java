package br.com.alexandre.gestao_data.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.gestao_data.model.Gasto;
import br.com.alexandre.gestao_data.repository.GastoRepositoryCustom;

/**
 * GastoService
 */
@Service
public class GastoServiceImpl implements GastoService{

    @Autowired
    private GastoRepositoryCustom gastoRepository;

    /**
     * Metdodo responsavel por listar todos os gastos
     * por usuario / ultimos 5 segundos
     * @param novoGasto
     * @return
     */
    @Override
    public List<Gasto> listarTodos(Long idUsuario) {
        return gastoRepository.findByCodigoUsuario(idUsuario)
                .stream()
                .filter(gasto -> gasto
                    .getData()
                    .isAfter(LocalDateTime.now().minusSeconds(5))
                ).collect(Collectors.toList());
    }


    /**
     * Salva um novo gasto
     */
    @Override
    public Gasto salvar(Gasto novoGasto) {
        return gastoRepository.save(novoGasto);
    }

}