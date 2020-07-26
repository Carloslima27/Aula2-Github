package entidades;

public class Banco {
	private int numero;
	private String titular;
	private double deposito;
	
	public Banco(int numero, String titular, double depositoInicial) {
		
		this.numero = numero;
		this.titular = titular;
		addValor(depositoInicial);
	}

	public Banco(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	public void addValor(double deposito) {
		this.deposito = getDeposito()+ deposito;
	}
	public void retirarValor(double saque) {
		this.deposito= getDeposito()- (saque + 5);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getDeposito() {
		return deposito;
	}

	
	public String toString() {
		return String.format("Conta: %d, Titular: %s, Saldo: $ %.2f", getNumero(), getTitular(), getDeposito());
	}
	
	
}
