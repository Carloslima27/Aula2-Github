package Recomeco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1]Pedra [2]Papel [3]Tesoura");
		
			
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print(nome+": ");
		int j1 = sc.nextInt();
		System.out.print("Jogador2: ");
		Random ale = new Random();
		 int j2 = ale.nextInt((3-1)+1)+1;
		System.out.println(j2);
		System.out.println("----------------");
		

		jogada(j1, j2, nome);
		

		sc.close();

	}

	static void jogada(int j1, int j2, String nome) {
		String tipo1;
		String tipo2;
		List<String> ppt = new ArrayList<>();
		ppt.add("Pedra");
		ppt.add("Papel");
		ppt.add("Tesoura");
		tipo1 = ppt.get(j1-1);
		tipo2 = ppt.get(j2-1);
		jogo(tipo1, tipo2, nome);
		
			
		
		

}
	static void jogo(String tipo1, String tipo2, String nome) {
		String mensagem;
		if(tipo1 == "Pedra" && tipo2 == "Tesoura") {
			mensagem = nome+": "+tipo1+"\nJogador2: "+tipo2+"\n----------------\n"+nome+" Venceu!";
		}else if(tipo2 == "Pedra" && tipo1 == "Tesoura") {
			mensagem = nome+": "+tipo1+"\nJogador2: "+tipo2+"\n----------------\nJogador2 Venceu!";
		}else if(tipo1 == "Papel" && tipo2 == "Pedra") {
			mensagem = nome+": "+tipo1+"\nJogador2: "+tipo2+"\n----------------\n"+nome+" Venceu!";
		}else if(tipo2 == "Papel" && tipo1 == "Pedra") {
			mensagem = nome+": "+tipo1+"\nJogador2: "+tipo2+"\n----------------\nJogador2 Venceu!";
		}else if(tipo1 == "Tesoura" && tipo2 == "Papel") {
			mensagem = nome+": "+tipo1+"\nJogador2: "+tipo2+"\n----------------\n"+nome+" Venceu!";
		}else if(tipo2 == "Tesoura" && tipo1 == "Papel"){
			mensagem = nome+": "+tipo1+"\nJogador2: "+tipo2+"\n----------------\nJogador2 Venceu!";
		}else {
			mensagem =  nome+": "+tipo1+"\nJogador2: "+tipo2+"\n----------------\nEmpate!";
		}
		System.out.println(mensagem);
	}
	
	
}
