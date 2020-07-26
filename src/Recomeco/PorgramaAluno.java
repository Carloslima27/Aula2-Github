package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class PorgramaAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Nota1: ");
		double nota1 = sc.nextDouble();
		System.out.println("Nota2: ");
		double nota2 = sc.nextDouble();
		System.out.println("Nota3: ");
		double nota3 = sc.nextDouble();
		Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
		System.out.println(aluno);
		
		
		
		
		sc.close();

	}

}
