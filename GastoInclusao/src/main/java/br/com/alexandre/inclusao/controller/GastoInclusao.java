package br.com.alexandre.inclusao.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandre.gestao_data.model.Gasto;
import br.com.alexandre.gestao_data.service.GastoServiceImpl;

/**
 * GastoInclusao
 * End-point para a integração dos gastos
 */
@RestController
public class GastoInclusao {

    @Autowired
    private GastoServiceImpl service;

    @RequestMapping(value = "/gastos", method = RequestMethod.POST, 
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Gasto> salvar(@RequestBody Gasto novoGasto) {
        return ResponseEntity.ok(service.salvar(novoGasto));
    }
    
    @RequestMapping(value = "/gastos", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Gasto>> listarGastos(@RequestParam Long idUsuario) {
        return ResponseEntity.ok(service.listarTodos(idUsuario));
    }

}