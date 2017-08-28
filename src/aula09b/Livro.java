package aula09b;

/**
 * Classe que representa um livro.
 * 
 * @author francis
 *
 */
public class Livro implements Publicacao {
	private String titulo, autor;
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livro \ntitulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + ", pagAtual="
				+ pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + ", idade=" + leitor.getIdade()
				+ ", sexo=" + leitor.getSexo();
	}

	/**
	 * @param titulo
	 * @param autor
	 * @param totPaginas
	 * @param leitor
	 */
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor
	 *            the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the totPaginas
	 */
	public int getTotPaginas() {
		return totPaginas;
	}

	/**
	 * @param totPaginas
	 *            the totPaginas to set
	 */
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	/**
	 * @return the pagAtual
	 */
	public int getPagAtual() {
		return pagAtual;
	}

	/**
	 * @param pagAtual
	 *            the pagAtual to set
	 */
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	/**
	 * @return the aberto
	 */
	public boolean isAberto() {
		return aberto;
	}

	/**
	 * @param aberto
	 *            the aberto to set
	 */
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	/**
	 * @return the leitor
	 */
	public Pessoa getLeitor() {
		return leitor;
	}

	/**
	 * @param leitor
	 *            the leitor to set
	 */
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int p) {
		if (p > this.getTotPaginas() || p < 0) {
			this.setPagAtual(0);
		} else {
			this.setPagAtual(p);
		}

	}

	@Override
	public void avancarPag() {
		this.setPagAtual(getPagAtual() + 1);
	}

	@Override
	public void voltarPag() {
		this.setPagAtual(getPagAtual() - 1);

	}
}
