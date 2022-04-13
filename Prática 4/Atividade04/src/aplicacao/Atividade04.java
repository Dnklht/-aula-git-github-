package aplicacao;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.println("Digite o seu peso: ");
		peso = sc.nextDouble();
	    System.out.println("Agora, digite a sua altura: ");
	    altura = sc.nextDouble();
	    
	    imc = peso / (altura * altura);
	    
	    if (imc < 20) {
	    	System.out.println("Abaixo do peso");
	    }
	    else if (imc >= 20 && imc <= 25) {
	    	System.out.println("Normal");
	    }
	    else if (imc >= 25 && imc <= 30) {
	    	System.out.println("Sobrepeso");
	    }
	    else {
	    	System.out.println("Obesidade");
	    }
	}

}
