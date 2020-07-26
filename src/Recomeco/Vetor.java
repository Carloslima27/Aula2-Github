package Recomeco;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vetor = new double [n];
		
		for(int i =0; i < vetor.length; i++) {
			vetor[i] = sc.nextDouble();
		}
		double media = 0;
		for (int i = 0;i < vetor.length; i++) {
			 media += vetor[i]/ vetor.length;
		}
		System.out.printf("Media de altura: %.2f", media);
		
		
		
		
		
		
		
		sc.close();
	}

}
