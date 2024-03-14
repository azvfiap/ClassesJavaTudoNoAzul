package br.com.fiap.tudoazul.models;

import java.io.Serializable;

public class CalculadoraMovimentacao implements Serializable {

	private static final long serialVersionUID = -5416087382614309328L;
	
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
	
	public double calculaSaldo() {
		System.out.println("CALCULANDO SALDO");
		return 5555;
		
	}
	
	public double calculaSaldo(TipoMovimentacao filtro) {
		System.out.println("CALCULANDO SALDO COM FILTRO");
		return 9999;
	}

}
