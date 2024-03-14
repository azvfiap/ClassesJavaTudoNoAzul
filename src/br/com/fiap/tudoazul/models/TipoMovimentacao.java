package br.com.fiap.tudoazul.models;

import java.io.Serializable;

/**
 * Classe que representa um tipo de movimentacao monetaria de um usuario
 * 
 * @author Gustavo Azevedo
 * @version 1.0
 */
public class TipoMovimentacao extends EntidadeInserivel implements Serializable {

	private static final long serialVersionUID = 208564925489653310L;
	
	/**
	 * Nome do tipo da transação
	 */
	protected String nome;
	
	/**
	 * Lista das movimentações com esse tipo
	 */
	protected Movimentacao[] movimentacoes;

	public TipoMovimentacao() {

	}

	public TipoMovimentacao(String nome, Movimentacao[] movimentacoes) {
		this.nome = nome;
		this.movimentacoes = movimentacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Movimentacao[] getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(Movimentacao[] movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	
	/**
	 * Exibe todas as movimentacoes que pertencem ao tipo de movimentacao
	 */
	public void exibirTodos() {
		if (this.movimentacoes != null) {
			System.out.println("EXIBE TODAS MOVIMENTAÇÕES DE TODOS OS TIPOS");
		}
	}
}
