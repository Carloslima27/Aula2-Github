package Recomeco;

import java.util.Locale;
import java.util.Scanner;

public class PosicaoMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i = 0;i < mat.length; i++) {
			for(int j = 0; j < mat[i].length;j++) {
			mat[i][j] = sc.nextInt();	
			}
		}
		n = sc.nextInt();
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == n) {
					System.out.println("Posição: "+i+", "+j);
					if(j > 0) {
						System.out.println("Esquerda: "+mat[i][j-1]);
					}if(j < mat.length) {
						System.out.println("Direita: "+mat[i][j+1]);
					}if(i > 0) {
						System.out.println("Encima: "+mat[i-1][j]);
					}if(i < mat[i].length) {
						System.out.println("Embaixo: "+mat[i+1][j]);
					}
					System.out.println();
				}
			}
		}
		sc.close();

	}

}
