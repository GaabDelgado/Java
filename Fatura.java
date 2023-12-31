package aula_13_07;
public class Fatura {

		    public String numero;
		    public String descricao;
		    public int quantidade;
		    public double preco;

		    public Fatura(String numero, String descricao, int quantidade, double preco) {
		        this.numero = numero;
		        this.descricao = descricao;
		        this.quantidade = quantidade;
		        this.preco = preco;
		    }

		    public String getNumero() {
		        return numero;
		    }

		    public void setNumero(String numero) {
		        this.numero = numero;
		    }

		    public String getDescricao() {
		        return descricao;
		    }

		    public void setDescricao(String descricao) {
		        this.descricao = descricao;
		    }

		    public int getQuantidade() {
		        return quantidade;
		    }

		    public void setQuantidade(int quantidade) {
		        this.quantidade = quantidade;
		    }

		    public double getPreco() {
		        return preco;
		    }

		    public void setPreco(double preco) {
		        this.preco = preco;
		    }

		    public double getTotalFatura() {
		        if (quantidade < 0) {
		            quantidade = 0;
		        }
		        if (preco < 0.0) {
		            preco = 0.0;
		        }
		        return quantidade * preco;
		    }
		

	}

