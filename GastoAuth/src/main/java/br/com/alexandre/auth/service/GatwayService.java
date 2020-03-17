package br.com.alexandre.auth.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * GatwayService
 * Classe para fazer as chamadas no servico de gasto
 */
@Service
public class GatwayService {

    private static final String BASE_URL = "http://localhost:8080/";
    private RestTemplate template;

    /**
     * Lista todos os gastos de um cliente
     * nos ultimos 5 segundos
     * @param idUsuario
     * @return
     */
    public ResponseEntity<String> listarGastos(Long idUsuario) {
        String listarURL = "gastos?idUsuario=" + idUsuario;
        template = new RestTemplate();
        return template.getForEntity(
            BASE_URL.concat(listarURL),
            String.class);
    }

    /**
     * salva um novo gasto
     * @param novoGasto
     * @return
     */
    public ResponseEntity<String> salvar(String novoGasto) {
        String salvarURL = "gastos";
        template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(novoGasto, headers);
         return template.postForEntity(
            BASE_URL.concat(salvarURL), 
            entity, 
            String.class);
    }

}