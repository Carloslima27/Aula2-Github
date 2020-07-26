package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Banco;

public class ProgramaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Quer fazer um deposito inicial [s/n]?: ");
		char r = sc.next().charAt(0);
		Banco banco;
		if(r == 's') {
			System.out.print("Deposito inicial: ");
			double deposito = sc.nextDouble();
			banco = new Banco(numero, titular, deposito);
		}else {
			banco = new Banco(numero, titular);
		}
		System.out.println("Dados da conta: ");
		System.out.println(banco);
		System.out.println();
		System.out.print("Valor de deposito: ");
		double deposito = sc.nextDouble();
		banco.addValor(deposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(banco);
		System.out.println();
		System.out.print("Valor para saque: ");
		double saque = sc.nextDouble();
		banco.retirarValor(saque);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(banco);
		
		
		sc.close();

	}

}
