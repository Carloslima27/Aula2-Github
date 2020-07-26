package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno1;

public class Nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();
		
		Aluno1 aluno = new Aluno1(nota1, nota2);
		System.out.println(aluno);
		if(aluno.passaDireto() < 5) {
		double nota3 = sc.nextDouble();
		aluno.testeFinal(nota3);
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
