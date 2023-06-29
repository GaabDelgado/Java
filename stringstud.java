package fundamentos;

public class stringstud {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		
		String resultado = str.replace("l", "w");
		System.out.println(resultado);		
		String resultado2 = str.substring(3, 8);
		System.out.println(resultado2);
		
		String resultado3 = str.toUpperCase();
		String resultado4 = str.toLowerCase();
		
		String resultado5 = str.trim();
		
	}
}
