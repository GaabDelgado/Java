package Construtores;

public class Honda extends Carro {
	private String motor;
	
	/*CONSTRUTOR PADRÃO*/
	public Honda() {	
	}
	/*CONSTRUTOR COM PARÂMETROS*/
	public Honda(String motor, String modelo, double preco) {
	super(modelo, preco);
	this.motor = motor;
	}
}
