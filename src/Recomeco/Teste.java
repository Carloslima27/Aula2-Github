package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Teste {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		Produtos produto;
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		produto = new Produtos(nome, preco, quantidade);
		System.out.println("Dados do produto: "+produto);
		System.out.print("Digite a quantidade de produtos para adicionar ao Stock: ");
		int adcionar = sc.nextInt();
		produto.addStock(adcionar);
		System.out.println("Dados atualizados: "+produto);
		System.out.print("Remover do Stock: ");
		int remover = sc.nextInt();
		produto.removerStock(remover);
		System.out.print("Dados atualizados: "+produto);
		
	
	sc.close();
		
	}
	
	
	
	
}
