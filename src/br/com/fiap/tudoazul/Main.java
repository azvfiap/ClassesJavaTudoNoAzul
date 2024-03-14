package br.com.fiap.tudoazul;

import br.com.fiap.tudoazul.models.BancoUsuario;
import br.com.fiap.tudoazul.models.CalculadoraMovimentacao;
import br.com.fiap.tudoazul.models.Carteira;
import br.com.fiap.tudoazul.models.Movimentacao;
import br.com.fiap.tudoazul.models.TipoMovimentacaoCredito;
import br.com.fiap.tudoazul.models.TipoMovimentacaoDebito;
import br.com.fiap.tudoazul.models.Usuario;

public class Main {

	public static void main(String[] args) {

		Usuario user = Main.criaUsuario();
		BancoUsuario banco = Main.criaBanco(user);
		Carteira carteira = new Carteira(50.03, user, null);
		carteira.setBanco(banco);

		Movimentacao depositoSalario = new Movimentacao(5000, "Deposito mensal salário", user,
				new TipoMovimentacaoCredito(), carteira);
		depositoSalario.setRecorrente(true);
		depositoSalario.setDiaRecorrencia(28);

		Movimentacao pixRecebido = new Movimentacao(60, "PIX FULANO", user, new TipoMovimentacaoCredito(), carteira);
		depositoSalario.inserir();
		pixRecebido.inserir();

		Movimentacao assinaturaSpotify = new Movimentacao(24.90, "Pagamento Spotify", user,
				new TipoMovimentacaoDebito(), carteira);
		assinaturaSpotify.setRecorrente(true);
		assinaturaSpotify.inserir();
		
		CalculadoraMovimentacao calculadora = new CalculadoraMovimentacao(new Movimentacao[] {depositoSalario, pixRecebido, assinaturaSpotify});
		
		double saldo = calculadora.calculaSaldo();
		System.out.println("FINALIZADO..." + saldo);
	}

	public static Usuario criaUsuario() {
		return new Usuario("email@fiap.com.br", "USUARIO!", "558128");
	}
	
	public static BancoUsuario criaBanco(Usuario user) {
		return new BancoUsuario("1009", "9917210-9", "BANCO MASSA", "1669", user);		
	}

}
