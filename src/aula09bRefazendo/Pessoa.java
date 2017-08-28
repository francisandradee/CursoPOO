package aula09bRefazendo;

/**
 * Classe que representa uma pessoa.
 * 
 * @author francis
 *
 */
public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;

	/**
	 * Método construtor da classe Pessoa.
	 * 
	 * @param nome
	 * @param idade
	 * @param sexo
	 */
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	/**
	 * Método que incrementa a idade de uma pessoa, simulando um aniversário.
	 */
	public void fazerAniver() {
		this.setIdade(getIdade() + 1);
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

}
