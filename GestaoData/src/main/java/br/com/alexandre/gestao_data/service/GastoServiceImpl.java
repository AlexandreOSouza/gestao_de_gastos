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
     * Salva um novo gasto
     * 
     * @param novoGasto
     * @return
     */

    @Override
    public Iterable<Gasto> listarTodos() {
        return gastoRepository.findAll();
    }

    @Override
    public void excluir(Long id) throws IllegalArgumentException{
        gastoRepository.deleteById(id);
    }

    @Override
    public Gasto salvar(Gasto novoGasto) {
        return gastoRepository.save(novoGasto);
    }

}