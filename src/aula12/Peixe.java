package aula12;

public class Peixe extends Animal {
	private String corEscama;

	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substancias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}

	/**
	 * @return the corEscama
	 */
	public String getCorEscama() {
		return corEscama;
	}

	/**
	 * @param corEscama
	 *            the corEscama to set
	 */
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
