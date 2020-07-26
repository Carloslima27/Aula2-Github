package entidades;

public class PessoaFisica extends Contribuintes{
	private Double gastoSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	@Override
	public Double imposto() {
		Double aux = 0.0;
		if(getRendaAnual() < 20000.00) {
			aux = getRendaAnual()*15/100;
		}else {
			aux = getRendaAnual()*25/100;
		}
		if(getGastoSaude() > 0) {
			aux -= (getGastoSaude()*50/100); 
		}
		return aux;
	}
	
	
	
	
}
