package aplicacao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int linhas = 2, colunas = 2;
		int[][] matriz = new int [linhas][colunas];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe um n�mero: ");
				matriz[i][j] = sc.nextInt();
		   }
			
		}
		System.out.print("Matriz:");
		imprime(matriz);
		System.out.print("Linha par e coluna �mpar:");
		linhaParColunaImpar(matriz);
		System.out.print("Matriz tranposta:");
		transposta(matriz);
	}

    	
	
	public static void imprime(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[j][i] + "]");

			}

		}

	System.out.println("\n\n\n\n");	
		
	}

	public static void linhaParColunaImpar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++)
				if (i % 2 == 0) {
					if (i % 2 == 1) {
						System.out.print("[" + matriz[i][j] + "]");
			}
		}
	
	System.out.println("\n\n\n\n");
		
	}
    
	public static void transposta (int[][] matriz) {
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++)
				if (i % 2 == 0) {
					if (i % 2 == 1) {
						
					}
				}
	}
}
