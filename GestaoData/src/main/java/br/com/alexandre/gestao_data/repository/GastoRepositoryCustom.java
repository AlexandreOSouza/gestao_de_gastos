package br.com.alexandre.gestao_data.repository;

import java.time.LocalDateTime;
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

    /**
     * Notação do método responsavel por retornar
     * todos os gastos com o filtro de data
     * @param data
     * @return
     */
    public List<Gasto> findByData(LocalDateTime data);
    
}