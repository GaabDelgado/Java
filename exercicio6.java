package Fundamentos;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = Scanner.nextInt();
		
		System.out.println("Números Pares: ");
		for (int i = 1; i <=numero; i++) {
			if(i %2 ==0) {
				System.out.println(i);
				
			}
		}
		System.out.println("Números impares:");
		for(int i = 1; i <= numero; i++) {
			if (i%2 !=0) {
				System.out.println(i);
			}
		}

	}

}
