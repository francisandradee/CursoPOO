package aula11;

public class Main {
	public static void main(String[] args) {
		// Pessoa p1 = new Pessoa();
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();

		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");

		a1.setNome("Cláudio");
		a1.setIdade(16);
		a1.setCurso("Informática");
		a1.setSexo("M");

		a1.pagarMensalidade();

		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setMatricula(1231);

		b1.pagarMensalidade();

		System.out.println(v1.toString());
	}
}
