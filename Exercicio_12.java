package Fundamentos;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numero = new Scanner(System.in);
		System.out.println("DIgite o primeiro número");
		int numero1= numero.nextInt();
		
		System.out.println("DIgite o segundo número");
		int numero2= numero.nextInt();
		
		System.out.println("Digite o terceito número");
		int numero3= numero.nextInt();
		
		int menorNumero = numero1;
		
		if (numero2 < menorNumero) {
			menorNumero = numero2;
		}
		if (numero3 < menorNumero) {
			menorNumero = numero3;
		}
System.out.println("O menor numero é:" + menorNumero);
	}


}
