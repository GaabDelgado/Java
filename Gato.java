package Pet;

public class Gato extends Animal {
	
	public Gato(String nome, String cor, String TipoPelo, double peso) {
		super(nome, cor, TipoPelo, peso);
	}
	public String comer() {
		return "Esta comendo!";
	}
	public String som() {
		return "Esta miando!";
	}
}


