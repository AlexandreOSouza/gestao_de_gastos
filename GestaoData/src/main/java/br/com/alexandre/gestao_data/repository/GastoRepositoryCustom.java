package br.com.alexandre.gestao_data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alexandre.gestao_data.model.Gasto;

/**
 * GastoRepository
 */
@Repository
public interface GastoRepositoryCustom extends CrudRepository<Gasto, Long> {

    
}