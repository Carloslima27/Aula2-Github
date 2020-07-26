package entidades;

public class Retangulo {
	public double largura;
	public double altura;
	
	
	public Retangulo(double largura, double altura) {
		setLargura(largura);
		setAltura(altura);
	}
	public double area() {
		return getLargura() * getAltura();
	}
	public double perimetro() {
		return (getLargura() + getAltura()) * 2;
	}
	public double diagonal() {
		return Math.sqrt(getLargura()*getLargura() + getAltura()*getAltura());
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String toString() {
		return String.format("Area: %.2f%n", area())
		+String.format("Perimetro: %.2f%n", perimetro())
		+String.format("Diagonal: %.2f", diagonal());
	}
	
}
