package aula_04_07;

import java.util.Arrays;

public class exe10 {

	public static void main(String[] args) {
	
		String[] texto = {"a", "vida", "é", "bela"};
		
		for(int i = 0; i < texto.length; i++) {
			System.out.print(texto[i].toUpperCase() + " ");
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = texto.length - 1; i>=0;i--) {
			if (i !=0) {
				stringBuilder.append(" ");
			
			}
		}
		String formattedString = stringBuilder.toString();
		
		System.out.println(formattedString);
	}
	
}
		
