package aula09b;

/**
 * Classe main de Projeto Livro.
 * 
 * @author francis
 *
 */

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2]; // Cria um vetor com 2 pessoas.
		Livro[] l = new Livro[3]; // Cria um vetor com 3 livros.

		p[0] = new Pessoa("Pedro", "M", 22);
		p[1] = new Pessoa("Maria", "F", 25);

		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro("POO Para Iniciantes", "Pedro Paulo", 500, p[1]);
		l[2] = new Livro("Java avançado", "Maria Candido", 800, p[0]);

		l[0].abrir();
		l[0].folhear(-1);
		l[0].avancarPag();
		System.out.println(l[0].toString());
		System.out.println(l[1].toString());
		System.out.println(l[2].toString());
	}

}
