package aula_13_07;

	public class TesteRetangulo {
	    public static void main(String[] args) {
	  
	        Retângulo retangulo = new Retângulo(5.0, 3.0);

	  
	        double area = retangulo.getBase() * retangulo.getAltura();
	        System.out.println("Área do retângulo: " + area);

	          double perimetro = 2 * (retangulo.getBase() + retangulo.getAltura());
	        System.out.println("Perímetro do retângulo: " + perimetro);
	    }
	}


