package entidades;

public class ProdutoImportado extends Produto1{
	private Double alfandega;

	public ProdutoImportado(String nome, Double preco, Double alfandega) {
		super(nome, preco);
		this.alfandega = alfandega;
	}
	
	public Double getAlfandega() {
		return alfandega;
	}

	public void setAlfandega(Double alfandega) {
		this.alfandega = alfandega;
	}
	@Override
	public String precoTag() {
		return String.format("%.2f",precoTotal())+" (Alfandega: "+getAlfandega()+")";
	}

	public Double precoTotal() {
		return getPreco() + alfandega;
	}
	
	
	
}
