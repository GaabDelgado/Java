package Construtores;

public class Carro {

	private String cor;
	private double preco;
	private String modelo;
	
	/*CONSTRUTOR PADRÃO*/
	public Carro() {
		
	}
	/*CONSTRUTOR COM 2 PARÂMETROS*/
	public Carro(String modelo, double preco) {
		this.modelo = "Golf GTI";
		this.preco = 181.000;
	}
	/*CONSTRUTOR COM 3 PARÂMETROS*/
	public Carro(String cor, String modelo, double preco) {
		this.cor = "PRETO";
		this.modelo = "Gold GTI";
		this.preco = 181.000;
	}
}
