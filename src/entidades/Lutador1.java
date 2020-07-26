package entidades;

import java.util.ArrayList;
import java.util.List;

public class Lutador1 {
	private String nome;
	private Integer forca;
	private Double vida;
	 List<TipoLutador> tl = new ArrayList<>();
	
	public Lutador1(String nome, Integer forca, Double vida) {
		this.nome = nome;
		this.forca = forca;
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getForca() {
		return forca;
	}

	public void setForca(Integer forca) {
		this.forca = forca;
	}

	public Double getVida() {
		return vida;
	}

	public void setVida(Double vida) {
		this.vida = vida;
	}
	
	
	
	
	
}
