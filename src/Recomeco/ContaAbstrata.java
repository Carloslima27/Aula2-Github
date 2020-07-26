package Recomeco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class ContaAbstrata {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Conta> c = new ArrayList<>();
		ContaPoupanca p = new ContaPoupanca(1005, "Joao", 1000.00, 1.1);
		c.add(p);
		c.add(new ContaEmpresa(1004, "Maria", 1500.00, 1000.00));
		Double soma = 0.0;
		//p.atualizarSaldo();
		
		for(Conta x: c){
			x.deposito(10.00);
			soma += x.getSaldo();
			System.out.println(x.getSaldo());
			
		}
		
		System.out.print("Saldo totas da contas: $ "+soma);
	}

}
