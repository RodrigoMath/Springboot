package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping(path = "/clientes/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-90");
	}

}
