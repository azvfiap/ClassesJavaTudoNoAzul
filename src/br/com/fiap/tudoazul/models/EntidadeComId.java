package br.com.fiap.tudoazul.models;

import java.util.Random;

/**
 * Classe que representa uma entidade no sistema que possui um ID
 */
public abstract class EntidadeComId {
	/**
	 * Identificador interno da entidade no sistema
	 */
	protected int id;
	
	/**
	 * Método que "cria" um registro
	 * @return O ID recém inserido
	 */
	public int inserir() {
		int idRecemCadastrado = new Random().nextInt();
		this.setId(idRecemCadastrado);
		return Math.abs(idRecemCadastrado);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
