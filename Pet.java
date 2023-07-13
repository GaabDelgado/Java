package aula_13_07;

public class Pet {
	
	public String nome;
	public String animal;
	public int idade;
	
	public Pet (String nome, String animal, int idade) {
		this.nome = nome;
		this.animal = animal;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
