package aula12;

public class Ave extends Animal {
	private String corPena;

	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}

	/**
	 * @return the corPena
	 */
	public String getCorPena() {
		return corPena;
	}

	/**
	 * @param corPena
	 *            the corPena to set
	 */
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

}
