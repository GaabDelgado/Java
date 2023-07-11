package Pet;
public class appAnimal {
	public static void main(String[] args) {

		Gato cat = new Gato("Fumaca ","Preto","Peludo",5);
		
		Cachorro dog = new Cachorro("Cerberus ","Marrom","Curto",10);
		
		System.out.println("o nome do gato e: " + cat.nome);
		System.out.println("o gato pesa: " + cat.peso);
		System.out.println("a cor do gato e: " + cat.cor);
		System.out.println("o tipo de pelo do gato e: " + cat.TipoPelo);
		System.out.println(cat.nome + cat.comer());
		System.out.println(cat.nome + cat.som());
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("O nome do cachorro e: " + dog.nome);
		System.out.println("O cachorro pesa: " + dog.peso);
		System.out.println("A cor do cachorro e:" + dog.cor);
		System.out.println("O tipo de pelo do cachorro e: " + dog.TipoPelo);
		System.out.println(dog.nome + dog.comer());
		System.out.println(dog.nome + dog.som());
	}

}
