package aplicacao;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
        //Leia 10 n�meros reais a partir do teclado e os armazene em um vetor. O algoritmo deve
        //imprimir o vetor e as posi��es do vetor que armazenam n�meros negativos.
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + i + "� numero:");
            int num = sc.nextInt();
            vetor[i] = num;            
        }  
        System.out.println("==================================");
        System.out.println("Vetor: " + Arrays.toString(vetor));
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0)
                System.out.println("Posi��o: " + i + " valor: " + vetor[i]);
        }
        System.out.println("==================================");
    }
}
