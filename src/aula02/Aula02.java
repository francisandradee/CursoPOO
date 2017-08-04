package aula02;

/**
 * Classe main da aula2 do Curso POO em Java.
 * 
 * @author francis
 *
 */

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta(); // Cria um novo objeto caneta, com a
									// referencia c1
		c1.status();
		c1.modelo = "BIC Cristal";
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.carga = 80;
		c1.destampar();
		c1.rabiscar();
	}

}
