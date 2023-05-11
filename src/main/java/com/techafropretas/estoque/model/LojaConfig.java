package com.techafropretas.estoque.model;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LojaConfig {
	
	@Bean
	CommandLineRunner comandLineRunner(LojaRepository repository) {
		return args ->{
			Loja curva = new Loja("NOVO", "111111", "ajdoiasd@gmai.com", "ojado21");
		//	Loja reta = new Loja("lolajoja", "45646", "ajkkkkd@gmai.com", "oioioi1");
			repository.saveAll(List.of(curva));
		};
	}
	

}
