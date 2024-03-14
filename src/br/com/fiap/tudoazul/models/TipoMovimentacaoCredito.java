package br.com.fiap.tudoazul.models;

public class TipoMovimentacaoCredito extends TipoMovimentacao {

	private static final long serialVersionUID = -6231133292164261675L;

	public TipoMovimentacaoCredito() {
		super("CRÉDITO", null);
	}

	public TipoMovimentacaoCredito(Movimentacao[] movimentacoes) {
		super("CRÉDITO", movimentacoes);
	}

	@Override
	public void exibirTodos() {
		if (this.movimentacoes != null) {
			System.out.println("EXIBINDO APENAS CRÉDITOS");
		}
	}
}
