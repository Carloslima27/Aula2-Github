package entidades;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;

	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public double total() {
		return preco * quantidade;
	}

	public void addStock(int adcionar) {
		this.quantidade += adcionar;
	}

	public void removerStock(int remover) {
		this.quantidade -= remover;
	}

public String toString() {
	return this.nome +", $ "
			+String.format("%.2f", this.preco) +", "+
			this.quantidade +" unidades, Total: $"+ String.format("%.2f",total());
}

}
