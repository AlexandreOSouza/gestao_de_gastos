package br.com.alexandre.inclusao.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandre.gestao_data.model.Gasto;
import br.com.alexandre.gestao_data.service.GastoServiceImpl;

/**
 * GastoInclusao
 */
@RestController
public class GastoInclusao {

    @Autowired
    private GastoServiceImpl service;

    @RequestMapping(value = "/gastos/novo_gasto", method = RequestMethod.POST)
    public ResponseEntity<Gasto> salvar(@RequestBody Gasto novoGasto) {
        return ResponseEntity.ok(service.salvar(novoGasto));
    }
    
    @RequestMapping(value = "/gastos", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Gasto>> getGastos() {
        return ResponseEntity.ok(service.listarTodos());
    }

}