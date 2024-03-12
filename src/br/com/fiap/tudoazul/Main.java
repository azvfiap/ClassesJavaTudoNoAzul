package br.com.fiap.tudoazul;

import br.com.fiap.tudoazul.models.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario user = new Usuario("email@fiap.com.br", "558128", "USUARIO!");
		
		user.exibirDados();
		
		int retorno = user.inserir();
		
		System.out.println(retorno);
		System.out.println(user.validaLogin());
	}
	
}
