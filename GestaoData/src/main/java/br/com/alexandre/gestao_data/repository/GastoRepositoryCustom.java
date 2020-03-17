package br.com.alexandre.gestao_data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alexandre.gestao_data.model.Gasto;

/**
 * GastoRepository
 */
@Repository
public interface GastoRepositoryCustom extends CrudRepository<Gasto, Long> {

    /**
     * Notação do método responsável por retornar 
     * todos os gastos de um usuario
     * @param idUsuario
     * @return
     */
    public List<Gasto> findByCodigoUsuario(Long idUsuario);
    
}