package Recomeco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario2;

public class ProgramaLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionarios serão registrados: ");
		int n = sc.nextInt();
		List<Funcionario2> fun = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(fun, id)) {
				System.out.print("Id ja cadastrado digite outro: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			fun.add(new Funcionario2(id, nome, salario));
			System.out.println();
		}
		System.out.println();
		System.out.print("Id do funcionario para acrescimo de salario: ");
		int id = sc.nextInt();

		Funcionario2 result = fun.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (result != null) {
			System.out.print("Quantos pocento de acrescimo: ");
			double pocento = sc.nextDouble();
			result.acrescimo(pocento);
		} else {
			System.out.println("Este Id não existe!");
		}

		System.out.println();

		System.out.println("Lista de funcionarios: ");
		for (Funcionario2 x : fun) {
			System.out.printf("%d, %s, %.2f%n", x.getId(), x.getNome(), x.getSalario());
		}

		sc.close();

	}

	public static boolean hasId(List<Funcionario2> fun, int id) {
		Funcionario2 result = fun.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return result != null;
	}

}
