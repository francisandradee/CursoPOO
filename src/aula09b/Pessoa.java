package aula09b;

/**
 * Classe que representa pessoa, de forma bem abstrata.
 * 
 * @author francis
 *
 */

public class Pessoa {
	private String nome, sexo;
	private int idade;

	/**
	 * Método que incrementa o atributo idade de uma pessoa em 1.
	 */
	public void fazerAniver() {
		this.setIdade(getIdade() + 1);
	}

	/**
	 * Método construtor da classe Pessoa.
	 * 
	 * @param nome
	 * @param sexo
	 * @param idade
	 */
	public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
