package aula07;

import java.util.Random;

/**
 * Curso POO Java. Classe representando uma luta.
 * 
 * @author francis
 *
 */
public class Luta {
	// Atributos
	private Lutador desafiado, desafiante;
	private int rounds;
	private boolean aprovada;

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria()) && l1!=l2; {
			aprovada = true;
			desafiado = l1;
			desafiante = l2;
		} else {
			aprovada = false;
			desafiado = null;
			desafiante = null;
		}
	}

	public void lutar() {
		if (aprovada) {
			desafiado.apresentar();
			desafiante.apresentar();
			int vencedor = Random(0, 2);
			
			switch (vencedor)
			case 0:
				break;
				
			
		} else {
			System.out.println("Luta não pode acontecer!");
		}
	}

	/**
	 * @return the desafiado
	 */
	private Lutador getDesafiado() {
		return desafiado;
	}

	/**
	 * @param desafiado
	 *            the desafiado to set
	 */
	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	/**
	 * @return the desafiante
	 */
	private Lutador getDesafiante() {
		return desafiante;
	}

	/**
	 * @param desafiante
	 *            the desafiante to set
	 */
	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	/**
	 * @return the rounds
	 */
	private int getRounds() {
		return rounds;
	}

	/**
	 * @param rounds
	 *            the rounds to set
	 */
	private void setRounds(int rounds) {
		this.rounds = rounds;
	}

	/**
	 * @return the aprovada
	 */
	private boolean isAprovada() {
		return aprovada;
	}

	/**
	 * @param aprovada
	 *            the aprovada to set
	 */
	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
