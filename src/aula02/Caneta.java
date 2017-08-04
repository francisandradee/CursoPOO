package aula02;

/**
 * Classe responsável pela representação de caneta.
 * 
 * @author Francis Andrade
 *
 */

public class Caneta {
	public String modelo, cor;
	public float ponta;
	protected int carga;
	private boolean tampada;

	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("está tampada? " + this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rasbicar");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

}
