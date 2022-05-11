package aplicacao;

public class Exception { 	

	public double dividir(int a, int b) throws ArithmeticException {
        if (a != 0) {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("valor errado");
            }
        } else {
            throw new ArithmeticException("valor errado, não é possivel realizar divisão por 0");
        }

    }
}



