package Recomeco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario1;
import entidades.Tercerizado;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario1> f = new ArrayList<>();;
		System.out.print("Entre com o numero de funcionarios: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
		System.out.println("Dados do funcionario #"+(i+1));
		System.out.print("Tercerizado?: ");
		char r = sc.next().charAt(0);
		
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();
			System.out.print("Valor Por Hora: ");
			Double valor = sc.nextDouble();
			if(r =='n') {
			f.add(new Funcionario1(nome, horas, valor));
			}else {
				System.out.print("Valor Adicional: ");
				Double adicional = sc.nextDouble();
				f.add(new Tercerizado(nome, horas , valor , adicional));
		}
		
		}
		for(Funcionario1 x: f) {
		System.out.println(x);
		}
		sc.close();

	}

}
