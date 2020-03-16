package br.com.alexandre.inclusao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "br.com.alexandre"})
public class InclusaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InclusaoApplication.class, args);
	}

}
