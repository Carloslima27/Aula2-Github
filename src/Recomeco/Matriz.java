package Recomeco;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		int negativo = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
				if(matriz[i][j] < 0) {
					negativo ++;
				}
			}
		}
		System.out.println("Diagonal principal:");
		for(int i = 0; i < matriz.length; i++) {
		System.out.print(matriz[i][i]+" ");
		}
		System.out.println();
		System.out.println("Negativos: "+negativo);
		
		
		
		sc.close();

	}

}
