package aplicacao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite um valor para ser dividido:");
            int a = input.nextInt();
            System.out.println("Digite um valor para ser o dividendo:");
            int b = input.nextInt();
            if (dividir(a, b) > 0) {
                System.out.println("Resultado: " + dividir(a, b));
            }
        }
    }

    public static double dividir(int a, int b) {
        try {
            int divisao = a / b;
            return divisao;
        } catch (ArithmeticException ae) {
            System.out.println("Valor errado voc� est� fazendo uma divis�o por zero!");
            return 0;
        }

    }
}