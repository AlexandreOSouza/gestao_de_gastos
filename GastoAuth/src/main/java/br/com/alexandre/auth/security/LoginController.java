package br.com.alexandre.auth.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;

@RestController
@RequestMapping(value= "/authorization", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
public class LoginController {

	
	/**
	 * End-point para fazer o login, retorna um novo token 
	 * de acordo com o login e a senha
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public LoginResponseDTO efetuarLogin(@RequestBody CredenciaisDTO credenciais) {
		Usuario usuario = findUsuarioByCredenciais(credenciais);
	    String token = createToken(usuario);
		return new LoginResponseDTO(token);
	}

	private String createToken(Usuario usuario) {
		Map<String, Object> claims = new HashMap<String, Object>();
		claims.put("usuarioSistema", usuario);
		return TokenUtils.createToken(Jwts.claims(claims));
	}
	
	/**
	 * Para teste, retorna um usuario fixo
	 */
	private Usuario findUsuarioByCredenciais(CredenciaisDTO credenciais) {
		return new Usuario(1L, "admin");
	}
}