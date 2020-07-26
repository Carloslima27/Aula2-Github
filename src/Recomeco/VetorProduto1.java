package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos1;

public class VetorProduto1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Produtos1[] vetor = new Produtos1 [n];
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produtos1(nome, preco);
		}
		double media = 0;
		for(int i = 0; i < vetor.length; i++) {
			media += vetor[i].getPreco()/vetor.length;
		}
		System.out.printf("Media dos preços: %.2f", media);
		
		
		
		
		sc.close();
		

	}

}
