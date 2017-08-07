package aula07;

/**
 * Curso POO Java. Classe que representa um Lutador no Ultra Emoji Combat.
 * 
 * @author francis
 *
 */
public class Lutador {
	private String nome, nacionalidade, categoria;
	private int idade;
	private float altura, peso;
	private int vitorias, derrotas, empates;

	/**
	 * Construtor da classe Lutador.
	 * 
	 * @param nome
	 * @param nacionalidade
	 * @param idade
	 * @param altura
	 * @param peso
	 * @param categoria
	 * @param vitorias
	 * @param derrotas
	 * @param empates
	 */
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	/**
	 * Apresenta o lutador mostrando seus atributos. Representação de um locutor
	 * apresentando o lutador.
	 */
	public void apresentar() {
		System.out.println("---------------------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o Lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Com " + getIdade() + " anos e " + getAltura() + " m de altura");
		System.out.println("Pesando " + getPeso() + "Kg");
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
	}

	/**
	 * Uma apresentação mais light.
	 */
	public void status() {
		System.out.println("-------------------------------");
		System.out.println(getNome());
		System.out.println("É um peso: " + getCategoria());
		System.out.println(getVitorias() + " vitórias");
		System.out.println(getDerrotas() + " derrotas");
		System.out.println(getEmpates() + " empates");
	}

	/**
	 * Adiciona mais uma vitoria ao lutador.
	 */
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	/**
	 * Adiciona mais uma derrota ao lutador.
	 */
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	/**
	 * Adiciona mais um empate ao lutador.
	 */
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	/**
	 * @return the nome
	 */
	private String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nacionalidade
	 */
	private String getNacionalidade() {
		return nacionalidade;
	}

	/**
	 * @param nacionalidade
	 *            the nacionalidade to set
	 */
	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	/**
	 * @return the idade
	 */
	private int getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	private void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the altura
	 */
	private float getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	private void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * @return the peso
	 */
	private float getPeso() {
		return peso;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	private void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	/**
	 * @return the categoria
	 */
	private String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria
	 *            the categoria to set
	 */
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "invalido";
		}
	}

	/**
	 * @return the vitorias
	 */
	private int getVitorias() {
		return vitorias;
	}

	/**
	 * @param vitorias
	 *            the vitorias to set
	 */
	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	/**
	 * @return the derrotas
	 */
	private int getDerrotas() {
		return derrotas;
	}

	/**
	 * @param derrotas
	 *            the derrotas to set
	 */
	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	/**
	 * @return the empates
	 */
	private int getEmpates() {
		return empates;
	}

	/**
	 * @param empates
	 *            the empates to set
	 */
	private void setEmpates(int empates) {
		this.empates = empates;
	}

}
