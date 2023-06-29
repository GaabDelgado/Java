package fundamentos;

import java.util.Scanner;

public class Arrayexe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numero = new Scanner(System.in);
		
		int[] arrayA = new int [3];
		
		int[] arrayB = new int [3];
		
		int[] arrayC = new int [3];
		
		int[] arrayD = new int [3];
		
		for(int i = 0; i < arrayA.length;i++) {
			System.out.println("Digite pra primeira array:");
			arrayA[0] = numero.nextInt();
		}
		for(int j = 0; j < arrayB.length;j++) {
				System.out.println("Digite pra segunda array:");
			arrayB[0] = numero.nextInt();
		}
		for(int k = 0; k < arrayC.length;k++) {
				System.out.println("Digite pra terceira array:");
			arrayC[0] = numero.nextInt();
		}	
		for(int l = 0; l < arrayD.length;l++) {
				System.out.println("Digite pra quarta array:");
			arrayD[0] = numero.nextInt();
		}
		for(int n : arrayA) {
			System.out.print(n + ", ");
		}
		for(int m : arrayB) {
			System.out.print(m + ", ");
		}
		for(int o : arrayC) {
			System.out.print(o + ", " );
		}
		for(int p : arrayD) {
			System.out.print(p + ", ");
		}
		
	}	
}