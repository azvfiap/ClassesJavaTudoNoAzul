package br.com.fiap.tudoazul.models;

/**
 * Classe que representa uma tipo de movimentação de Débito do usuário
 * 
 * @author Gustavo Azevedo
 * @version 1.0
 */
public class TipoMovimentacaoDebito extends TipoMovimentacao {

	private static final long serialVersionUID = -4156832961882028763L;
	
	public TipoMovimentacaoDebito() {
		super("DÉBITO", null);
	}
	
	public TipoMovimentacaoDebito(Movimentacao[] movimentacoes) {
		super("DÉBITO", movimentacoes);
	}
	
	/**
	 * Exibe somente as movimentacoes de débito
	 */
	@Override
	public void exibirTodos() {
		if (this.movimentacoes != null) {
			System.out.println("EXIBINDO APENAS DÉBITOS");
		}
	}
}
