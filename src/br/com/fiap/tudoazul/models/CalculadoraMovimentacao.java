package br.com.fiap.tudoazul.models;

import java.io.Serializable;

/**
 * Classe que calcula as movimentacoes de um usuario
 * 
 * @author Gustavo Azevedo
 * @version 1.0
 */
public class CalculadoraMovimentacao implements Serializable {

	private static final long serialVersionUID = -5416087382614309328L;
	
	/**
	 * Lista de movimentacoes que terao seus valores calculados
	 */
	private Movimentacao[] movimentacoes;

	public CalculadoraMovimentacao() {

	}

	public CalculadoraMovimentacao(Movimentacao[] movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	public Movimentacao[] getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(Movimentacao[] movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	
	/**
	 * Método que calcula o saldo de todas as movimentações	
	 * @return o valor monetario dos calculos entre as movimentacoes de dinheiro
	 */
	public double calculaSaldo() {
		System.out.println("CALCULANDO SALDO...");
		return 5555;
	}
	
	/**
	 * Método que calcula o saldo de todas as movimentações
	 * @param filtro Parametro que permite filtrar apenas um determinado tipo de movimentacao	
	 * @return o valor monetario dos calculos entre as movimentacoes de dinheiro
	 */	
	public double calculaSaldo(TipoMovimentacao filtro) {
		System.out.println("CALCULANDO SALDO COM FILTRO");
		return 9999;
	}

}
