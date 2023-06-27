package Fundamentos;

import java.util.Scanner;

public class exercicio6_1 {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int numero = scanner.nextInt();
		
		System.out.println("Números Pares: ");
		int i=1;
		while (i <= numero) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("Números impares: ");
		i = 1;
		while(i<=numero) {
			if (i%2 != 0) {
				System.out.println(i);
			}
			i++; 
		}
	}
}
