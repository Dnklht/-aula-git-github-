package aplicacao;

public class ContaCorrente {

	private int numero, agencia;
	private double saldo;

	public void inicializarContaCorrente(int n, int ag) {
		numero = n;
		agencia = ag;
		saldo = 0;

	}

	public void sacar(double valor) {
		if (valor < this.saldo) {
		saldo = saldo - valor;}
		else {
			System.out.println("Impossível fazer o saque!");
		}
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public double consultarSaldo() {
		return (saldo);
	}

	public String exibe() {

		String retorno = null;
		retorno = "Agência: " + this.agencia + "\n";
		retorno += "Numero: " + this.numero + "\n";
		retorno += "Saldo: " + this.saldo + "\n";

		return retorno;

	}

}
