package aplicacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valorDeposito, valorSaque;
		
		ContaCorrente cc = new ContaCorrente();
		cc.inicializarContaCorrente(10000, 1);
		
		System.out.println("Insira o valor do depósito: ");
		valorDeposito = sc.nextInt();
		cc.depositar(valorDeposito);
		System.out.println("Insira o valor do saque: ");
		valorSaque = sc.nextInt();
		cc.sacar(valorSaque);
        System.out.println("========================");
        System.out.println(cc.exibe());

	}

}
