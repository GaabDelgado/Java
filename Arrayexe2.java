package fundamentos;

import java.util.Scanner;

public class Arrayexe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner alunos = new Scanner(System.in);
		
		double media=0;
		double[] notaAlunos =new double[5];
		
		for(int i=0; i < notaAlunos.length; i++) {
			System.out.println("Digite o valor da nota: ");
			notaAlunos[i] = alunos.nextDouble();
			media = notaAlunos[i] / notaAlunos.length;
		}
		System.out.println(media);
	}

}
