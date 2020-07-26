package Recomeco;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entidades.Lutador;

public class ProgramaBox {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Lutador [] lutador = new Lutador[3];
		
		
		lutador[0] = new Lutador("Pé de Chinelo", 100.0, 5.0);
		lutador[1] = new Lutador("Jecá Tatu", 90.0, 4.0);
		lutador[2] = new Lutador("Jubiléu", 100.0 , 6.0);
		
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		while(lutador[n].getVida()> 0 && lutador[n1].getVida() > 0) {
			System.out.println("[1]Soco [2]Chute [3]Especial");
			int acao = sc.nextInt();
			Random random = new Random();
			int ale = random.nextInt(3);
			double critico = 0.0;
			String criticomen = "";
			if(ale == 0) {
				critico = 10/100;
				criticomen = "Critico 10%!";
			}else if(ale == 1) {
				critico = 30/100;
				criticomen = "Critico 30%!";
			}
			double soco = lutador[n].getForca()+ critico;
			double chute = lutador[n].getForca()+ critico;
			double especial = lutador[n].getForca()*critico;
			System.out.println("Lutador1: "+lutador[n].getNome());
			switch(acao) {
			case 1:
				System.out.println("Soco!");
				System.out.println(criticomen);
				lutador[n1].setVida(lutador[n1].getVida()-(soco+2));
			break;
			case 2:
				System.out.println("Chute!");
				System.out.println(criticomen);
				lutador[n1].setVida(lutador[n1].getVida()-(chute+4));
				break;
			case 3:
				System.out.println("Especial!");
				System.out.println(criticomen);
				lutador[n1].setVida(lutador[n1].getVida()-(especial+6));
				break;
			}
			System.out.println(lutador[n1].getNome());
			System.out.println("HP: "+lutador[n1].getVida());
			System.out.println();
			System.out.println("Lutador2: "+lutador[n1].getNome());
			 int ale1 = random.nextInt(3);
			 if(ale1 == 0) {
					critico = 10/100;
					criticomen = "Critico 10%!";
				}else if(ale1 == 1) {
					critico = 30/100;
					criticomen = "Critico 30%!";
				}
			 soco = lutador[n1].getForca()+ critico;
			 chute = lutador[n1].getForca()+ critico;
			 especial = lutador[n1].getForca()*critico;
			
			switch(ale1) {
			case 0:
				System.out.println("Soco!");
				System.out.println(criticomen);
				lutador[n].setVida(lutador[n].getVida()-(soco+2));
			break;
			case 1:
				System.out.println("Chute!");
				System.out.println(criticomen);
				lutador[n].setVida(lutador[n].getVida()-(chute+4));
				break;
			case 2:
				System.out.println("Especial!");
				System.out.println(criticomen);
				lutador[n].setVida(lutador[n].getVida()-(especial+6));
				break;
			}
			System.out.println(lutador[n].getNome());
			System.out.println("HP: "+lutador[n].getVida());
		}
		
		
		
		sc.close();
		}

}
