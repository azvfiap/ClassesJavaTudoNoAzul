package br.com.fiap.tudoazul.models;

/**
 * Classe que representa uma tipo de movimentação de Crédito do usuário
 * 
 * @author Gustavo Azevedo
 * @version 1.0
 */
public class TipoMovimentacaoCredito extends TipoMovimentacao {

	private static final long serialVersionUID = -6231133292164261675L;

	public TipoMovimentacaoCredito() {
		super("CRÉDITO", null);
	}

	public TipoMovimentacaoCredito(Movimentacao[] movimentacoes) {
		super("CRÉDITO", movimentacoes);
	}

	/**
	 * Exibe somente as movimentacoes de crédito
	 */
	@Override
	public void exibirTodos() {
		if (this.movimentacoes != null) {
			System.out.println("EXIBINDO APENAS CRÉDITOS");
		}
	}
}
