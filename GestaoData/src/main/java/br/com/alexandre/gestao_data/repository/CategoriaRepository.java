package br.com.alexandre.gestao_data.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alexandre.gestao_data.model.Categoria;

/**
 * CategoriaRepository
 */
public interface CategoriaRepository extends CrudRepository<Categoria, String> {

    
}