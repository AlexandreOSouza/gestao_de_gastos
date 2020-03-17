package br.com.alexandre.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandre.auth.service.GatwayService;

@RestController
@RequestMapping(value= "/api", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
public class Gatway {

	// Classe que fará os request
	@Autowired
	private GatwayService service;

	/**
	 * End-point para listar os gastos dos ultimos 5 segundos de 
	 * um determinado usuario
	 * @param idUsuario
	 * @return
	 */
	@RequestMapping(value = "listar_gastos", method = RequestMethod.GET)
	public ResponseEntity<String> listarGasto(@RequestParam Long idUsuario) {
		return service.listarGastos(idUsuario);
	}

	/**
	 * End-point para salvar um novo gasto
	 * @param novoGasto
	 * @return
	 */
	@RequestMapping(value = "novo_gasto", method = RequestMethod.POST, 
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> salvar(@RequestBody String novoGasto) {
        return service.salvar(novoGasto);
    }
}