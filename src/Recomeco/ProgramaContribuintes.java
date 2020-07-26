package Recomeco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuintes;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class ProgramaContribuintes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuintes> c = new ArrayList<>();
		System.out.print("Entre com o numero de pagadores: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do pagador #"+(i+1));
			System.out.print("Individual ou Campania (i, c): ");
			char opcao = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			Double renda = sc.nextDouble();
			if(opcao == 'i') {
				System.out.print("Gatos de saúde: ");
			Double gastoSaude = sc.nextDouble();
			c.add(new PessoaFisica(nome, renda, gastoSaude));
			}else {
				System.out.print("Numero de funcionarios: ");
				Integer quantidade = sc.nextInt();
				c.add(new PessoaJuridica(nome, renda, quantidade));
			}
		}
		double totalImposto = 0.0;
		System.out.println("Impostos pagos: ");
		for(Contribuintes x: c) {
			totalImposto += x.imposto();
			System.out.println(x);
		}
		System.out.printf("Taxa total: %.2f", totalImposto);
			
			
		
		
		
		sc.close();
	}

}
