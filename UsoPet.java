package aula_13_07;

public class UsoPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet pet = new Pet("Thor", "Gato", 3);
		
		System.out.println("Nome: " + pet.getNome());
		System.out.println("Animal: " + pet.getAnimal());
		System.out.println("Idade: " + pet.getIdade() + " anos");
	}

}
