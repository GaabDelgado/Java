package aula_13_07;
public class FaturaTeste {
	    public static void main(String[] args) {
	    	
	        // Criando uma instância de Fatura
	    	
	        Fatura fatura = new Fatura("001", "Vinho", 5, 10.99);

	        // Exibindo os valores iniciais da fatura
	        
	        System.out.println("Numero: " + fatura.getNumero());
	        System.out.println("Descricao: " + fatura.getDescricao());
	        System.out.println("Quantidade: " + fatura.getQuantidade());
	        System.out.println("Preco: " + fatura.getPreco());

	        // Calculando e exibindo o valor total da fatura
	        
	        System.out.println("Total da Fatura: " + fatura.getTotalFatura());

	        // Atualizando os valores da fatura
	        
	        fatura.setQuantidade(8);
	        fatura.setPreco(15.5);

	        // Exibindo os valores atualizados da fatura
	        
	        System.out.println("\nValores Atualizados:");
	        System.out.println("Quantidade: " + fatura.getQuantidade());
	        System.out.println("Preco: " + fatura.getPreco());

	        // Calculando e exibindo o novo valor total da fatura
	        
	        System.out.println("Novo total da fatura: " + fatura.getTotalFatura());
	    }
	}


