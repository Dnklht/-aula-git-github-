package aplicacao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite um valor para ser dividido:");
            int a = input.nextInt();
            System.out.println("Digite um valor para ser o dividendo:");
            int b = input.nextInt();
            Exception met = new Exception();
            System.out.println(met.dividir(a, b));
        }
    }
}