package br.com.alexandre.gestao_data.service;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alexandre.gestao_data.model.Gasto;

/**
 * GastoService
 */
public interface GastoService {

    /**
     * Notação do metodo responsável por salvar um novo gasto
     * @param novoGasto
     * @return
     */
    public Gasto salvar(Gasto novoGasto);

    /**
     * Notação do metodo responsável por listar todos os gastos por 
     * cliente
     * @param idCliente
     * @return
     */
    public List<Gasto> listarTodos(Long idCliente);

}