package br.com.cadastro.model;

import javax.validation.constraints.Size;

public class Personagem {
	private Long id;
	@Size(min=1 , message="Preencher Campo")
	private String nome;
	@Size(min=1 , message="Preencher Campo")
	private String raca;
	@Size(min=1 , message="Preencher Campo")
	private String classe;
	@Size(min=1 , message="Preencher Campo")
	private String habilidades;
	@Size(min=1 , message="Preencher Campo")
	private String fotosCaminho;
	
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getRaca() {
		return raca;
	}
	public String getClasse() {
		return classe;
	}
	public String getHabilidade() {
		return habilidades;
	}
	public String getFotosCaminho() {
		return fotosCaminho;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public void setHabilidade(String habilidades) {
		this.habilidades = habilidades;
	}
	public void setFotosCaminho(String foto) {
		fotosCaminho = foto;
	}
}
