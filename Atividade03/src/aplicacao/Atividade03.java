package aplicacao;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int not1, not2, not3, media;
				
		System.out.println("Digite a primeira nota que seja entra 0 e 10: ");
		not1 = sc.nextInt();
		System.out.println("Digite a segunda nota que seja entra 0 e 10: ");
		not2 = sc.nextInt();
		System.out.println("Digite a terceira nota que seja entra 0 e 10: ");
		not3 = sc.nextInt();
		
		media = (not1 + not2 + not3) / 3;
		
		if (media >= 0 && media < 3) {
			System.out.println("Reprovado");
						
		}
		else if (media >= 3 && media < 7) {
			System.out.println("Exame");
		}
		else {
			System.out.println("Aprovado");
		}
	}

}
