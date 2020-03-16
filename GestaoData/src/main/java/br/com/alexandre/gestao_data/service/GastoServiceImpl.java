package br.com.alexandre.gestao_data.service;

import java.util.List;

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
     * por usuario
     * @param novoGasto
     * @return
     */
    @Override
    public List<Gasto> listarTodos(Long idUsuaio) {
        return gastoRepository.findByIdUsuario(idUsuaio);
    }


    /**
     * Salva um novo gasto
     */
    @Override
    public Gasto salvar(Gasto novoGasto) {
        return gastoRepository.save(novoGasto);
    }

}