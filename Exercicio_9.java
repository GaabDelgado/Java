package Fundamentos;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//FAÇA UM PROGRAMA QUE PEÇA UM VALOR E MOSTRE NA TELA SE É POSITIVO OU NEGATIVO//

Scanner numero = new Scanner(System.in);
System.out.println("Digite um número:");
int resp = numero.nextInt();
if (resp > 0)
	System.out.println("Positivo");
else if(resp == 0)
	System.out.println("Neutro");
else
	System.out.println("Negativo");



	}

}
