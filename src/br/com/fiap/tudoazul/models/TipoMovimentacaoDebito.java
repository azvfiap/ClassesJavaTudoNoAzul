package br.com.fiap.tudoazul.models;

public class TipoMovimentacaoDebito extends TipoMovimentacao {

	private static final long serialVersionUID = -4156832961882028763L;
	
	public TipoMovimentacaoDebito() {
		super("DÉBITO", null);
	}
	
	public TipoMovimentacaoDebito(Movimentacao[] movimentacoes) {
		super("DÉBITO", movimentacoes);
	}
	
	@Override
	public void exibirTodos() {
		if (this.movimentacoes != null) {
			System.out.println("EXIBINDO APENAS DÉBITOS");
		}
	}
}
