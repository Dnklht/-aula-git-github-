package aplicacao;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
        //Leia 10 n�meros reais a partir do teclado e os armazene em um vetor. O algoritmo deve
        //imprimir o vetor, o menor e o maior n�mero informado.
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior = 0, menor = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + i + "� numero:");
            int num = sc.nextInt();
            vetor[i] = num;            
            if(i == 0){
                maior = num;
                menor = num;
            }
            if(num > maior)
                maior = num;
            if(num < menor)
                menor = num;
        }
       System.out.println("Vetor: " + Arrays.toString(vetor));        
       System.out.println("O maior n�mero �: " + maior + " e o menor valor �: " + menor);
    }
}