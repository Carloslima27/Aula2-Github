package entidades;

public class Lutador {
	private String nome;
	private double vida;
	private double forca;
	public Lutador(String nome, double vida, double forca) {
		this.nome = nome;
		this.vida = vida;
		this.forca = forca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVida() {
		return vida;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	public double getForca() {
		return forca;
	}
	public void setForca(double forca) {
		this.forca = forca;
	}
	
	
	
	
}
