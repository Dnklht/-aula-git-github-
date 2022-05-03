package aplicacao;

public class Retangulo {

	private float altura, largura;

	public Retangulo() {

		altura = 0;
		largura = 0;

	}

	public float getAltura() {
		return (altura);

	}

	public void setAltura(float alt) {

		altura = alt;

	}

	public float getLargura() {
		return (largura);

	}

	public void setLargura(float larg) {

		largura = larg;

	}

	public float calculaArea() {

		return altura * largura;

	}

	public float calculaPerimetro() {

		return 2 * altura + 2 * largura;

	}

	
	/** Esse método está printando os atributos na tela
	 *  @author Thiago Luan Pereira
	 *  @since  Desde que haja Gets no código 
	 *  @return <h3 style="color: purple">String que retorna os atributos na tela<h3>*/
	public String exibe() {

		String retorno = null;
		retorno = "Altura: " + getAltura() + "\n";
		retorno += "Largura: " + getLargura() + "\n";
		retorno += "Área: " + calculaArea() + "\n";
		retorno += "Perímetro: " + calculaPerimetro();

		return retorno;

	}
}
