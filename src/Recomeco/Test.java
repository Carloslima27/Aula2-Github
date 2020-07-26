package Recomeco;

public class Test {

	public static void main(String[] args) {
		String real = "2000.00 Reais";
		double valor = Double.parseDouble(real.substring(0, 4));
		System.out.println(valor);
	}

}
