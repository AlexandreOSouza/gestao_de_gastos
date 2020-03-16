package br.com.alexandre.gestao_data.service;

import br.com.alexandre.gestao_data.model.Gasto;

/**
 * GastoService
 */
public interface GastoService {

    public Gasto salvar(Gasto novoGasto);
    public Iterable<Gasto> listarTodos();
    public void excluir(Long id) throws IllegalArgumentException;
}