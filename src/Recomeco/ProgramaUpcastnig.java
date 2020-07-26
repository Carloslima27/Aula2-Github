package Recomeco;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class ProgramaUpcastnig {

	public static void main(String[] args) {
		Conta c = new Conta(125, "Rafael", 1000.00);
		ContaEmpresa b = new ContaEmpresa(246, "André", 4000.00, 1000.00);
		//UP casting
		Conta c1 = b;
		Conta c2 = new ContaEmpresa(1335, "Amilton", 8000.00, 1000.00);
		Conta c3 = new ContaPoupanca(8065, "Francisco", 6000.00, 0.1);
		System.out.println(c1.getSaldo());
		ContaEmpresa c4 = (ContaEmpresa)c2;
		c4.emprestimo(200.00);
		if(c3 instanceof ContaEmpresa) {
			ContaEmpresa c5 = (ContaEmpresa)c3;
			c5.emprestimo(900.00);
		}
		if(c3 instanceof ContaPoupanca) {
			ContaPoupanca c5 = (ContaPoupanca)c3;
			
			System.out.println("Atualizado!");
		}
	
	}

}
