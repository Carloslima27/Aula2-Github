package entidades;

public class Funcionario1 {
	private String nome;
	private Integer hora;
	private Double valorHora;
	
	public Funcionario1(String nome, Integer hora, Double valorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorHora = valorHora;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double pagamento() {
		return valorHora * hora;
	}
	public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(getNome()+" - "+String.format("%.2f $ ",pagamento()));
			return sb.toString();
			
	}
	
	
}
