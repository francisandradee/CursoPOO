package aula09bRefazendo;

/**
 * Classe main de projeto livro.
 * 
 * @author francis
 *
 */

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2]; // Cria um vetor com 2 pessoas.
		Livro[] l = new Livro[3]; // Cria um vetor com 3 livros.
		
		p[0] = new Pessoa("João", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		
		System.out.println();
	}

}
