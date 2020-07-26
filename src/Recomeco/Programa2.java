package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Dollar;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quanto é o preço do dolar?: ");
		double preco = sc.nextDouble();
		System.out.print("Quanto dolar quer comprar?: ");
		double comprar = sc.nextDouble();
		System.out.printf("Valor a pagar em reais pelo dolar: %.2f",Dollar.converte(preco, comprar));
		
		
		
		
		
		sc.close();

	}

}
