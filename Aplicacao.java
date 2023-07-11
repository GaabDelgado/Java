package Construtores;

public class Aplicacao {

	public static void main(String[] args) {
		
		//*CONSTRUTOR SEM PARÂMETROS
		Carro prototipoDeCarro = new Carro();
		
		//CONSTRUTOR COM 2 PARÂMETROS
		Carro golfPreto = new Carro("New Golf", "181.000");
		
		//CONSTRUTOR COM E PARÂMETROS
		Carro civicPreto = new Carro("Preto", "Civic", "20.000");
	}
}
