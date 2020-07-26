package entidades;

public class ContaEmpresa extends Conta{
	
	private Double limiteEmprestimo;
	
	public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
		
	}
	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	public void emprestimo(Double montante) {
		if(montante <= this.limiteEmprestimo) {
		saldo += montante - 10.0;
		}
	}
	@Override
	public void saque(Double saque) {
		super.saque(saque);
		saldo -= 2;
	}
}
