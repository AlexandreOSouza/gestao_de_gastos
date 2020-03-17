package br.com.alexandre.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import br.com.alexandre.auth.security.SecurityFilter;


@SpringBootApplication
public class AuthApplication {
	
	/**
	 * Configuração do pattern dos endpoints que serão interceptados pelo @SecurityFilter
	 */
	private static final String URL_PATTERN = "/api/*";

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new SecurityFilter());
		registrationBean.addUrlPatterns(URL_PATTERN); 
		return registrationBean;
	}
}