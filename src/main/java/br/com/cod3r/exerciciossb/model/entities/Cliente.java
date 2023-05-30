package br.com.cod3r.exerciciossb.model.entities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	public Cliente(int id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria","987.654.321-09");
	}
	
	@GetMapping()
	public Cliente obterClientePorId2(@RequestParam (name = "id") int id) {
		return new Cliente(id, "João","111.654.321-09");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
