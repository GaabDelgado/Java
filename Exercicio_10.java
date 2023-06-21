package Fundamentos;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite um número:");
		int resp = numero.nextInt();
		System.out.println(resp >= 0 ? "Positivo" : resp == 0 ? "Neutro" : "Negativo");
		
		

	}

}
