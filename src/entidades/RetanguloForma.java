package entidades;

import entidades.enums.Cor;

public  class RetanguloForma extends Forma {
	private Double altura;
	private Double Largura;
	
	public RetanguloForma(Cor cor, Double altura, Double largura) {
		super(cor);
		this.altura = altura;
		Largura = largura;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getLargura() {
		return Largura;
	}
	public void setLargura(Double largura) {
		Largura = largura;
	}
	@Override
	public Double area() {
		return getAltura() * getLargura();
	}
	@Override
	public String toString() {
		return String.format("%.2f",area());
	}
	

	
	
	
}
