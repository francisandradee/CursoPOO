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
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (aprovada) {
			System.out.println("### Desafiado ###");
			this.desafiado.apresentar();
			System.out.println("### Desafiante ###");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);

			System.out.println("==== RESULTADO DA LUTA ====");
			switch (vencedor) {
			case 0: // Empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: // Desafiado Vence
				System.out.println(desafiado.getNome() + " venceu");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // Desafiante Vence
				System.out.println(desafiante.getNome() + " venceu");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
			}
			System.out.println("===============================");

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
