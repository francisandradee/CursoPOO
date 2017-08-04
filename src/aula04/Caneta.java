package aula04;

public class Caneta {
	private String modelo, cor;
	private float ponta;
	private boolean tampada;

	/**
	 * Construtor da classe caneta, recebendo como paramentros modelo, cor, e
	 * ponta da caneta. A caneta sempre vai ser criada tampada.
	 * 
	 * @param modelo
	 * @param cor
	 * @param ponta
	 */
	public Caneta(String modelo, String cor, float ponta) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampada = true;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor
	 *            the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * @return the tampada
	 */
	public boolean isTampada() {
		return tampada;
	}

	/**
	 * @param tampada
	 *            the tampada to set
	 */
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo
	 *            the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the ponta
	 */
	public float getPonta() {
		return ponta;
	}

	/**
	 * @param ponta
	 *            the ponta to set
	 */
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}
	
	/**
	 * Retorna infos sobre a caneta, usando os métodos gets.
	 */
	public void status() {
		System.out.println("SOBRE a caneta:");
		System.out.println("modelo: " + this.getModelo());
		System.out.println("ponta: " + this.getPonta());
		System.out.println("cor: " + this.getCor());
		System.out.println("tampada: " + this.isTampada() + "\n");
	}
}
