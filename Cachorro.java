package Pet;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, String cor, String TipoPelo, double peso) {
		super(nome, cor, TipoPelo, peso);
	}
	public String comer() {
		return "Esta comendo!";
		
	}
	public String som() {
		return "Esta latindo!";
	}
}
