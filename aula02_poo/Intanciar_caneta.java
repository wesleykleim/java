package aula02_poo;

public class Intanciar_caneta {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();

		c1.cor = "Azul";
		c1.carga = 80;
		c1.modelo = "Bic";
		c1.ponta = 0.5f;
		c1.tampada = true;
		c1.valor = 1.5f;
		c1.status();
		c1.escrever();
		
	}

}
