package entidades;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double taxa;
	public Funcionario(String nome, double salarioBruto, double taxa) {
		setNome(nome);
		setSalarioBruto(salarioBruto);
		setTaxa(taxa);
	}
	public double salarioLiquido() {
		return getSalarioBruto() - getTaxa();
	}
	public void acresSalario(double pocento) {
		setSalarioBruto( salarioLiquido() + (getSalarioBruto()* pocento/100));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public String toString() {
		return getNome()+String.format(", $ %.2f", getSalarioBruto());
	}
	
	
}
