package br.com.fiap.tudoazul.models;

import java.io.Serializable;

public class BancoUsuario extends EntidadeInserivel implements Serializable {

	private static final long serialVersionUID = -283285489607573933L;

	private String agencia;
	private String conta;
	private String nomeBanco;
	private String codigoBanco;
	private Usuario usuario;

	public BancoUsuario() {

	}

	public BancoUsuario(String agencia, String conta, String nomeBanco, String codigoBanco, Usuario usuario) {
		this.agencia = agencia;
		this.conta = conta;
		this.nomeBanco = nomeBanco;
		this.codigoBanco = codigoBanco;
		this.usuario = usuario;
	}

	public void mostraDadosBanco() {
		StringBuilder sb = new StringBuilder();
		sb.append("DADOS BANCARIOS\n-----\n");
		sb.append(this.getUsuario().getNomeUsuario());
		sb.append("\n");
		sb.append("Agência:" + this.getAgencia() + " Conta:" + this.getConta());
		sb.append("-----\n");
		System.out.println(sb.toString());
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(String codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
