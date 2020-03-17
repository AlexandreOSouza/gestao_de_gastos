package br.com.alexandre.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/api", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
public class Gatway {

	@RequestMapping(value = "listar_gastos", method = RequestMethod.GET)
	public ResponseEntity<String> listarGasto() {
		return new ResponseEntity<String>("Listando os gastos", HttpStatus.OK);
	}
}