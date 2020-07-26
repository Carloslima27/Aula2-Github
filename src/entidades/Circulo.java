package entidades;

import entidades.enums.Cor;

public class Circulo extends Forma {
	private Double raio;
	
	
	
	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}



	public Double getRaio() {
		return raio;
	}



	public void setRaio(Double raio) {
		this.raio = raio;
	}


@Override
	public Double area(){
		return Math.PI * Math.pow(getRaio(), 2);
	}



	
	@Override
	public String toString() {
		return String.format("%.2f", area());
	}

}
