package aula12;

public class Main {

	public static void main(String[] args) {
		// Animal n = new Animal();

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();

		m.setPeso(85.3);
		m.setIdade(2);
		m.setMembros(4);
		m.locomover(); // Correndo
		m.alimentar(); // Mamando
		m.emitirSom(); // Som de mamifero

		System.out.println("\n");

		Canguro c = new Canguro(); // Nome errado, mas blz
		c.setPeso(55.30);
		c.setIdade(3);
		c.setMembros(4);
		c.locomover(); // Saltando
		c.alimentar(); // Mamando
		c.emitirSom(); // Som de mamifero
		c.usarBolsa(); // Usando bolsa

		System.out.println("\n");

		Cachorro k = new Cachorro();
		k.setPeso(3.94);
		k.setIdade(12);
		k.setMembros(4);
		k.locomover(); // Correndo
		k.alimentar(); // Mamando
		k.emitirSom(); // Som de Mamifero
		k.abanarRabo(); // abanando o rabo

		System.out.println("\n");

		p.setPeso(0.35);
		p.setIdade(1);
		p.setMembros(0);
		p.locomover(); // Nadando
		p.alimentar(); // Comendo substancia
		p.emitirSom(); // Peixe não faz som
		p.soltarBolha();

		System.out.println("\n");

		a.setPeso(0.89);
		a.setIdade(2);
		a.setMembros(2);
		a.locomover(); // Voando
		a.alimentar(); // Comendo frutas
		a.emitirSom(); // Som de ave
		a.fazerNinho();
	}

}
