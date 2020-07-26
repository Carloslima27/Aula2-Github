package Recomeco;

import java.util.Locale;

import entidades.Agenda;
import entidades.Pessoa;

public class teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Agenda a = new Agenda();
		
		a.addPessoa(new Pessoa("Maria Agelina", 15, 1.60));
		a.addPessoa(new Pessoa("Jose Henrique Frota", 20, 1.80));
		a.addPessoa(new Pessoa("Francisco de Assis Soares",45, 1.72));
		a.addPessoa(new Pessoa("Maria Hilda",83, 1.55));
		a.addPessoa(new Pessoa("Jose Sena", 60, 1.69));
		
		System.out.println("===============");
	a.imprimirPessoa(a.buscarPessoa("Maria"));
	}

}
