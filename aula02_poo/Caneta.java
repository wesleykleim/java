package aula02_poo;

public class Caneta {

	String cor;
	String modelo;
	boolean tampada;
	int carga;
	float ponta;
	float valor;
	
	void status() {
		System.out.println("Uma Caneta do modelo " + this.modelo);
		System.out.println("Na cor " + this.cor);
		System.out.println("De ponta " + this.ponta);
		System.out.println("Com carga " + this.carga + "%");
		System.out.println("Estou com Tampa? " + this.tampada);
		System.out.println("Custa R$" + this.valor );
		
	}
	void destampar() {
		this.tampada = false;
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void escrever() {
		if (this.tampada == false) {
			System.out.println("Estou escrevendo!");
		}else {
			System.out.println("Erro, estou tampada, não consigo escrever!");
		}
	
	}
}
