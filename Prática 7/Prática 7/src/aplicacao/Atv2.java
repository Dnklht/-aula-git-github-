package aplicacao;

import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Informe o primeiro valor: ");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			for (int i = num2 + 1 ; i < num1; i++) {
				System.out.println(i);
			}
			
		}
		else if (num1 < num2) {
			for (int i = num1 + 1; i < num2; i++) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("O programa não está funcionando corretamente.");
		}

	}

}
