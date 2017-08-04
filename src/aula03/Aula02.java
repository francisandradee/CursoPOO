package aula03;

/**
 * Classe main da aula2 do Curso POO em Java.
 * 
 * @author francis
 *
 */

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta(); //Cria um novo objeto caneta, com a referencia c1

		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.tampar();
		
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta(); //Cria um segundo objeto do tipo caneta, com referencia c2
		c2.modelo = "hostnet";
		c2.cor = "preta";
		c2.destampar();
		c2.rabiscar();
	}

}
