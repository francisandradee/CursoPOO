package aula06;

public class ControleRemoto implements Controller {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	/**
	 * @param volume
	 * @param ligado
	 * @param tocando
	 */
	public ControleRemoto() {
		this.ligado = false;
		this.tocando = false;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		this.setVolume(50);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		this.setVolume(0);
	}

	@Override
	public void abrirMenu() {
		if (this.isLigado()) {
			System.out.println("\n---------MENU---------");
			System.out.println("Está ligado? " + this.isLigado());
			System.out.println("Está tocando? " + this.isTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 0; i < this.getVolume(); i += 10) {
				System.out.print("[]");
			}
		} else {
			System.out.println("\nTV não está ligada");
		}

	}

	@Override
	public void fecharMenu() {
		System.out.println("fechando menu...");
	}

	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(getVolume() + 5);
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(getVolume() - 5);
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("\nNão consegui reproduzir");
		}
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("\nNão consegui pausar");
		}
	}

	/**
	 * @return the volume
	 */
	private int getVolume() {
		return volume;
	}

	/**
	 * @param volume
	 *            the volume to set
	 */
	private void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * @return the ligado
	 */
	private boolean isLigado() {
		return ligado;
	}

	/**
	 * @param ligado
	 *            the ligado to set
	 */
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	/**
	 * @return the tocando
	 */
	private boolean isTocando() {
		return tocando;
	}

	/**
	 * @param tocando
	 *            the tocando to set
	 */
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

}
