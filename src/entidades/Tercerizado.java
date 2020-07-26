package entidades;

public class Tercerizado extends Funcionario1{
	private Double despesaAdicional;

	public Tercerizado(String nome, Integer hora, Double valorHora, Double despesaAdicional) {
		super(nome, hora, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	@Override
	public Double pagamento() {
		return super.pagamento() + despesaAdicional *110/100;
	}
	
	
	
}
