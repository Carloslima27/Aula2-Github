package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto1{
	private Date fabricacao;
	SimpleDateFormat d = new SimpleDateFormat("dd//MM/yyyy");

	public ProdutoUsado(String nome, Double preco, Date fabricacao) {
		super(nome, preco);
		this.fabricacao = fabricacao;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	@Override
	public String precoTag() {
		return "(Usado) "+super.precoTag()+" (Data de Fabric: "+d.format(getFabricacao())+")";
	}
			
	
	

}
