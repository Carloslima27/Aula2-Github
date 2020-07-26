package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a largura e altura do retangulo:");
		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		Retangulo retangulo = new Retangulo(largura, altura);
		System.out.println(retangulo);
		
		
		sc.close();
	}

}
