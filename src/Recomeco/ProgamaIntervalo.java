package Recomeco;

import java.util.Scanner;

import entidades.IntervaloTest;

public class ProgamaIntervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("[1]soma [2]Inteiro [3]Impar [4]ParOuImpar: ");
		int opcao = sc.nextInt();
		System.out.println();
		while(opcao > 4 || opcao < 1) {
			System.out.print("Operação Invalida escolha outra operação: ");
			opcao = sc.nextInt();
		}
		System.out.println();
		System.out.println("Digite os Intervalos para as fazer as operaçãoes: ");
		System.out.println();
		System.out.print("Inicio: ");
		int inicio = sc.nextInt();
		System.out.print("Fim: ");
		int fim = sc.nextInt();
		IntervaloTest i = new IntervaloTest(inicio, fim);
		i.mensagem(opcao);
		
		
		
		
		sc.close();
	}

}
