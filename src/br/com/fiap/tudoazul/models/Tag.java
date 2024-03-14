package br.com.fiap.tudoazul.models;

import java.io.Serializable;

/**
 * Classe que representa uma tag de identificacao para as transações
 * 
 * @author Gustavo Azevedo
 * @version 1.0
 */
public class Tag extends EntidadeInserivel implements Serializable {
	private static final long serialVersionUID = -4542978666131682003L;
	
	/**
	 * Identificacao da tag
	 */
	private String nome;
	
	/**
	 * O usuario que criou a tag
	 */
	private Usuario usuario;

	public Tag() {

	}

	public Tag(String nome, Usuario usuario) {
		this.nome = nome;
		this.usuario = usuario;
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
