package entidades;

public class ContaPoupanca extends Conta{
	private Double taxaJuros;

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		this.saldo += saldo * taxaJuros;
	}
	@Override
	public void saque(Double saque) {
		saldo -= saque;
	}
}
