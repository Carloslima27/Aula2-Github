package Recomeco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Departamento;
import entidades.Trabalhador1;
import entidades.enums.NivelDoTrabalhador;

public class ProgramaWorker {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		 System.out.print("Nome do Departamento: ");
		String departamento = sc.nextLine();
		System.out.println();
		System.out.println("Dados do Funcionario: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("Salario: ");
		double salarioBase = sc.nextDouble();
		Trabalhador1 t = new Trabalhador1(nome, NivelDoTrabalhador.valueOf(status),salarioBase, new Departamento(departamento));
		System.out.println();
		System.out.print("Quantos contratos deste trabalhador: ");
		int n = sc.nextInt();
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do contrato #"+(i+1));
			System.out.print("Data (DD/MM/YYY): ");
			Date data = d.parse(sc.next());
			System.out.print("Valor por hora: ");
			Double valor = sc.nextDouble();
			System.out.print("Horas de trabalho: ");
			Integer horas = sc.nextInt();
			t.addContrato(new Contrato(data, valor, horas));
		}
		System.out.println();
		System.out.println("Entre com mês e ano para calcular renda (MM/YYYY):");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		t.renda(mes, ano);
		System.out.println(t);
		System.out.println("Renda para "+mesAno+": "+String.format("%.2f", t.renda(mes, ano)));
		sc.close();
	}

}
