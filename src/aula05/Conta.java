package aula05;

/**
 * Classe que representa uma conta de banco.
 *
 * @author francis
 *
 */
public class Conta {
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	/**
	 * Construtor da classe conta. Cria uma conta fechada, com o saldo zero.
	 * 
	 * @param numConta
	 * @param tipo
	 * @param dono
	 * @param saldo
	 * @param status
	 */
	public Conta() {
		this.saldo = 0;
		this.status = false;
	}

	/**
	 * Retorna o estado atual da conta. mostrando todos os atributos.
	 */
	public void estadoAtual() {
		System.out.println("Conta " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
		System.out.println("-----------------------------");
	}

	/**
	 * Abre a conta mudando o status para "true". Se a conta for do tipo Conta
	 * Corrente (CC), o saldo recebe 50 reais. Se a conta for do tipo Conta
	 * Poupança (CP), o saldo recebe 150 reais.
	 */
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.setSaldo(150);
		}
	}

	/**
	 * Fecha a conta, se o saldo for igual a zero.
	 * 
	 */
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pôde ser fechada, pois ainda tem saldo.");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pôde ser fechada, pois ainda tem débito.");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	/**
	 * Se a conta estiver aberta, deposita o dinheiro passado.
	 * 
	 * @param quantia
	 */
	public void depositar(float valor) {
		if (this.isStatus()) {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Depósito de valor R$" + valor + " realizado com sucesso!");
		} else {
			System.out.println("Conta fechada. Inpossível depositar.");
		}
	}

	/**
	 * Recebe como parametro o valor a ser sacado da conta. A conta precisa está
	 * aberta e ter um saldo maior ou igual ao valor a ser sacado.
	 * 
	 * @param valor
	 */
	public void sacar(float valor) {
		if (this.isStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(getSaldo() - valor);
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Saldo Insuficiente para saque.");
			}
		} else {
			System.out.println("Conta fechada. Não há dinheiro para sacar ainda. Por favor, abra a sua conta.");
		}
	}

	/**
	 * Se a conta for CC, paga ao banco 12 reais. Se a conta for CP, paga ao
	 * banco 20 reais.
	 */
	public void pagarMensal() {
		int valor = 0;
		if (this.getTipo() == "CC") {
			valor = 12;
		} else if (this.getTipo() == "CP") {
			valor = 20;
		}
		if (this.isStatus()) {
			this.setSaldo(getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso!");
		} else {
			System.out.println("Impossível pagar com uma conta fechada.");
		}
	}

	// MÉTODOS ESPECIAIS
	/**
	 * @return the numConta
	 */
	public int getNumConta() {
		return numConta;
	}

	/**
	 * @param numConta
	 *            the numConta to set
	 */
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the dono
	 */
	public String getDono() {
		return dono;
	}

	/**
	 * @param dono
	 *            the dono to set
	 */
	public void setDono(String dono) {
		this.dono = dono;
	}

	/**
	 * @return the saldo
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

}
