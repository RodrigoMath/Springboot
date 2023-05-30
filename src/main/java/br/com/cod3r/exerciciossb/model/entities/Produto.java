package br.com.cod3r.exerciciossb.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String nome;
	
	@Min(value = 0)
	private Double preco;
	
	@Min(value = 0)
	@Max(value = 1)
	private Double desconto;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	

	public Produto(String nome, Double preço, Double desconto) {
		super();
		this.nome = nome;
		this.preco = preço;
		this.desconto = desconto;
	}



	public Double getPreço() {
		return preco;
	}



	public void setPreço(Double preço) {
		this.preco = preço;
	}



	public Double getDesconto() {
		return desconto;
	}



	public void setDesconto(Double desconto) {
		this.desconto = desconto;
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

}
