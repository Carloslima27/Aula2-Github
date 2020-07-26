package Recomeco;

import java.util.Locale;
import java.util.Scanner;

import entidades.Quarto;

public class ProgramaQuarto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quer alugar quantos quartos: ");
		int n = sc.nextInt();
		Quarto[] quarto = new Quarto [10];
		for(int i = 0; i < n; i++) {
			System.out.printf("Aluguel #%d:%n", i+1);
			System.out.printf("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			quarto[room] = new Quarto(nome, email, room);
		}
		for(int i = 0; i < quarto.length;i++) {
			if(quarto[i]!= null) {
			System.out.println(quarto[i].getQuarto()+": "+quarto[i].getNome()+", "+quarto[i].getEmail());
			}
		}
		
		
		
		
		sc.close();
	}

}
