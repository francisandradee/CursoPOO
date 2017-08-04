package aula05;

public class Main {

	public static void main(String[] args) {
		Conta p1 = new Conta();
		p1.setNumConta(11111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");

		Conta p2 = new Conta();
		p2.setNumConta(22222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");

		p1.estadoAtual();
		p2.estadoAtual();

		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);

		p1.sacar(150);
		p1.fecharConta();

		p1.estadoAtual();
		p2.estadoAtual();
	}

}
