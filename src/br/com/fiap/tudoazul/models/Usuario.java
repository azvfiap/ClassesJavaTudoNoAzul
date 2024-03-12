package br.com.fiap.tudoazul.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

/**
 * Classe que representa um usuário que executa diversas operacoes no sistema
 * @author Gustavo Azevedo
 * @version 1.0
 */
public class Usuario extends EntidadeComId implements Serializable {

	private static final long serialVersionUID = -8346452956495429009L;	
	
	/**
	 * Email do usuário
	 */
	private String email;
	
	/**
	 * CPF do usuário
	 */
	private String cpf;
	
	/**
	 * Data de nascimento do usuário
	 */
	private Date dataNascimento;
	
	/**
	 * Nome do usuário
	 */
	private String nomeUsuario;
	
	/**
	 * Data de cadastro do usuário no sistema
	 */
	private Date dataCadastro = new Date();
	
	/**
	 * Senha do usuário
	 */
	private String senha;

	public Usuario() {

	}

	public Usuario(String email, String senha, String nomeUsuario) {
		this.setEmail(email);
		this.setSenha(senha);
		this.setNomeUsuario(nomeUsuario);		
	}	

	/**
	 * Exibe alguns dados básicos do usuário
	 */
	public void exibirDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("-----\n");
		sb.append("NOME:" + this.getNomeUsuario() + "-----\n");
		sb.append("-----\n");
		sb.append("EMAIL:" + this.getEmail() + "-----\n");
		sb.append("-----\n");
		sb.append("DATA CADASTRO:" + this.getDataCadastro() + "-----\n");
		sb.append("-----\n");
		
		System.out.println(sb.toString());
	}
	
	/**
	 * Verifica se o login do usuário está válido
	 * @return Se o email e senha do usuario estão corretos
	 */
	public boolean validaLogin() {
		return this.getEmail() == "teste@fiap.com.br" && this.getSenha() == "881524";
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
