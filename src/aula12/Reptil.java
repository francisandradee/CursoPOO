package aula12;

public class Reptil extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
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
