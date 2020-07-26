package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class ProgramaConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta c = new Conta(1001, "Jose", 2000.00);
		c.saque(200.00);
		System.out.println(c.getSaldo());
		
		Conta c1 =  new ContaPoupanca(4567, "Antônio", 2000.00, 0.01 );;
		c1.saque(200.00);
		System.out.println(c1.getSaldo());
		
		Conta c2 = new ContaEmpresa(2045, "Fabio", 2000.00, 500.00);
		c2.saque(200.00);
		System.out.println(c2.getSaldo());
	}

}
