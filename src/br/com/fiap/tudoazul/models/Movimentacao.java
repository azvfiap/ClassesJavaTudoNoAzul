package br.com.fiap.tudoazul.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe que representa uma movimentacao de dinheiro
 * 
 * @author Gustavo Azevedo
 * @version 1.0
 */
public class Movimentacao extends EntidadeInserivel implements Serializable {

	private static final long serialVersionUID = -2936699347394617992L;

	/**
	 * Valor da movimentacao
	 */
	private double valor;
	
	/**
	 * Identificação da movimentação
	 */
	private String nome;
	
	/**
	 * Indica se a movimentação é recorrente
	 */
	private boolean recorrente = false;
	
	/**
	 * Indica qual o dia da recorrencia dessa movimentacao
	 */
	private int diaRecorrencia;
	
	/**
	 * Guarda qual o dia que a movimentacao foi feita
	 */
	private Date dataMovimentacao = new Date();
	
	/**
	 * Indica em qual carteira a movimentacao foi feita
	 */
	private Carteira carteira;
	
	/**
	 * Indica qual o usuario realizou a movimentacao
	 */
	private Usuario usuario;
	
	/**
	 * Tipo de movimentação, ex.: Crédito ou Débito
	 */
	private TipoMovimentacao tipoMovimentacao;
	
	/**
	 * Tags customizadas de identificação da movimentacao
	 */
	private Tag[] tags;

	public Movimentacao() {

	}

	public Movimentacao(double valor, String nome, Usuario usuario, TipoMovimentacao tipoMovimentacao,
			Carteira carteira) {
		this.valor = valor;
		this.nome = nome;
		this.usuario = usuario;
		this.tipoMovimentacao = tipoMovimentacao;
		this.carteira = carteira;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiaRecorrencia() {
		return diaRecorrencia;
	}

	public void setDiaRecorrencia(int diaRecorrencia) {
		this.diaRecorrencia = diaRecorrencia;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public Tag[] getTags() {
		return tags;
	}

	public void setTags(Tag[] tags) {
		this.tags = tags;
	}

	public Carteira getCarteira() {
		return carteira;
	}

	public void setCarteira(Carteira carteira) {
		this.carteira = carteira;
	}

	public boolean isRecorrente() {
		return recorrente;
	}

	public void setRecorrente(boolean recorrente) {
		this.recorrente = recorrente;
	}
}
