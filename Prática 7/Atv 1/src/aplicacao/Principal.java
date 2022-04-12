package aplicacao;

public class Principal {

	public static void main(String[] args) {
		int soma = 0, num = 7;
		
		for (int i = 7; i <= 20; i++) {
			soma = num + i;
			num = soma;
			System.out.println("Soma: " +soma);
		}

	}

}
