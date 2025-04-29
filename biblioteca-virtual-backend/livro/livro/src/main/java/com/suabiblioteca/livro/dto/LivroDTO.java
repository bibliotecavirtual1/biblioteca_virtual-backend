package com.suabiblioteca.livro.dto;

public class LivroDTO {
	private String titulo;
	private String autor;
	private String genero;
	private String descricao;
	
	public LivroDTO() {
	}
	public LivroDTO(String titulo, String autor, String genero, String descricao) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.descricao = descricao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}