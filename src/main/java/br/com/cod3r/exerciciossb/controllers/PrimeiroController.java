package br.com.cod3r.exerciciossb.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@RequestMapping(method = RequestMethod.GET, path = "ola")
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	
	

}
