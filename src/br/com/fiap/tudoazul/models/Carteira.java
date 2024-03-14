package br.com.fiap.tudoazul.models;

import java.io.Serializable;

/**
 * Classe que representa a carteira do usuario
 * 
 * @author Gustavo Azevedo
 * @version 1.0
 */
public class Carteira extends EntidadeInserivel implements Serializable {

	private static final long serialVersionUID = 4332486842058868667L;

	/**
	 * Saldo da carteira
	 */
	private double saldo;
	
	/**
	 * Usuario a qual a carteira pertence
	 */
	private Usuario usuario;
	
	/**
	 * Possível banco que a carteira pode pertencer
	 */
	private BancoUsuario banco = null;

	public Carteira() {

	}

	public Carteira(double saldo, Usuario usuario, BancoUsuario banco) {
		this.saldo = saldo;
		this.usuario = usuario;
		this.banco = banco;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public BancoUsuario getBanco() {
		return banco;
	}

	public void setBanco(BancoUsuario banco) {
		this.banco = banco;
	}
}
