package entidades;

public class Pessoa {
	private String nome;
	private Integer idade;
	private Double altura;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public String separa() {
		String[] s = getNome().split(" ");
		return s[0];
	}
	
	public String toString() {
		return "Nome: "+getNome()+"\n"
				+"Idade: "+getIdade()+"\n"
				+"Altura: "+String.format("%.2f",getAltura());
	}
	
	
}
