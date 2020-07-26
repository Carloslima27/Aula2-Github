package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario f ;
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		double salario = sc.nextDouble();
		System.out.print("Taxa: ");
		double taxa = sc.nextDouble();
		f = new Funcionario(nome, salario, taxa);
		System.out.printf("Funcionario: %s, $ %.2f%n", f.getNome(), f.salarioLiquido());
		System.out.print("Pocentagem para aumentar salario: ");
		double pocento = sc.nextDouble();
		f.acresSalario(pocento);
		System.out.println("Dados atualizados: "+f);
		
		
		
		sc.close();
	}

}
