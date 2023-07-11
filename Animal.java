package Pet;

public class Animal {
	
public String nome;
public String cor;
public String TipoPelo;
public double peso;

public Animal(String nome, String cor, String TipoPelo, double peso) {
	this.nome = nome;
	this.cor = cor;
	this.TipoPelo = TipoPelo;
	this.peso = peso;
}
public String comer() {
	return "O animal comeu.";
}
public String som() {
	return "O animal fez som.";
}
}
