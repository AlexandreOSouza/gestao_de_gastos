package br.com.alexandre.gestao_data.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alexandre.gestao_data.model.Gasto;

/**
 * GastoRepository
 */
public interface GastoRepository extends CrudRepository<Gasto, String> {

    
}