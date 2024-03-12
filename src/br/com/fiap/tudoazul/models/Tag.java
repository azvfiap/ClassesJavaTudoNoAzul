package br.com.fiap.tudoazul.models;

import java.io.Serializable;

public class Tag extends EntidadeComId implements Serializable {
	private static final long serialVersionUID = -4542978666131682003L;
	private String nome;
	private Usuario usuario;
	
	public Tag() {
		
	}
	
	public Tag(String nome, Usuario usuario) {
		this.setNome(nome);
		this.setUsuario(usuario);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
