package entidades;

public class Dollar {

	public static double converte(double preco, double compra) {
		return preco* compra+(preco * compra)*6/100; 
		
	}
}
