package br.com.alexandre.gestao_data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alexandre.gestao_data.model.Categoria;

/**
 * CategoriaRepository
 */
@Repository
public interface CategoriaRepositoryCustom extends CrudRepository<Categoria, Long> {

    
}