package aula_13_07;

public class Sobrescrita {

	class Animal {
	    public void fazerSom() {
	        System.out.println("O animal faz um som genérico.");
	    }
	}

	class Cachorro extends Animal {
	    @Override
	    public void fazerSom() {
	        System.out.println("O cachorro late: Au au!");
	    }
	}

	class Gato extends Animal {
	    @Override
	    public void fazerSom() {
	        System.out.println("O gato mia: Miau!");
	    }
	}

	public class ExemploPolimorfismoSobrescrita {
	    public static void main(String[] args) {
	        Animal animal = new Animal();
	        Cachorro cachorro = new Cachorro();
	        Gato gato = new Gato();

	        animal.fazerSom();      // Saída: O animal faz um som genérico.
	        cachorro.fazerSom();    // Saída: O cachorro late: Au au!
	        gato.fazerSom();        // Saída: O gato mia: Miau!

	        // Polimorfismo
	        Animal animalPolimorfico = new Cachorro();
	        animalPolimorfico.fazerSom();  // Saída: O cachorro late: Au au!
	        
	        animalPolimorfico = new Gato();
	        animalPolimorfico.fazerSom();  // Saída: O gato mia: Miau!
	    }
	}

}
