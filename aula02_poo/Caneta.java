package aula02_poo;

public class Caneta {

	public String cor;
	public String modelo;
	protected boolean tampada;
	protected int carga;
	public float ponta;
	public float valor;
	
	void status() {
		System.out.println("Uma Caneta do modelo " + this.modelo);
		System.out.println("Na cor " + this.cor);
		System.out.println("De ponta " + this.ponta);
		System.out.println("Com carga " + this.carga + "%");
		System.out.println("Estou com Tampa? " + this.tampada);
		System.out.println("Custa R$" + this.valor );
		
	}
	protected void destampar() {
		this.tampada = false;
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	public void escrever() {
		if (this.tampada == false) {
			System.out.println("Estou escrevendo!");
		}else {
			System.out.println("Erro, estou tampada, não consigo escrever!");
		}
	
	}
}
