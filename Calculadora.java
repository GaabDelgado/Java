package aula_13_07;
                              //SOBRECARGA
	public class Calculadora {
	    public int calcular(int a, int b) {
	        return a + b;
	    }

	    public int calcular(int a, int b, int c) {
	        return a + b + c;
	    }

	    public int calcular(int a, int b, int c, int d) {
	        return a + b + c + d;
	    }

	    public static void main(String[] args) {
	        Calculadora calculadora = new Calculadora();

	        int resultado1 = calculadora.calcular(2, 3);
	        System.out.println("Resultado 1: " + resultado1);  // Saída: Resultado 1: 5

	        int resultado2 = calculadora.calcular(2, 3, 4);
	        System.out.println("Resultado 2: " + resultado2);  // Saída: Resultado 2: 9

	        int resultado3 = calculadora.calcular(2, 3, 4, 5);
	        System.out.println("Resultado 3: " + resultado3);  // Saída: Resultado 3: 14
	    }
	}


