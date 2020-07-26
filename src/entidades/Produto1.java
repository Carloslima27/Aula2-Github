package entidades;

public class Produto1 {
	private String nome;
	private Double preco;
	
	public Produto1(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String precoTag(){
		return "$ "+String.format("%.2f", getPreco());
	}
	public String toString() {
		return getNome()+" "+precoTag(); 
	}
}
