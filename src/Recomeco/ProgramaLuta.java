package Recomeco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Lutador1;
import entidades.Ring;
import entidades.TipoLutador;

public class ProgramaLuta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Lutador1> tl = new ArrayList<>();
		tl.add(new TipoLutador("Pimbão", 5, 100.0));
		tl.add(new TipoLutador("Sansão", 6, 100.0));
		tl.add(new TipoLutador("Neymar", 4, 90.0));
		System.out.println("Selecione o lutador: ");
		System.out.printf("[1]%s| [2]%s| [3]%s%n", tl.get(0).getNome(), tl.get(1).getNome(), tl.get(2).getNome());
		System.out.printf("Força:%d  | Força:%d  | Força:%d%n", tl.get(0).getForca(), tl.get(1).getForca(),
				tl.get(2).getForca());
		System.out.printf("Vida:%.0f | Vida%.0f  | Vida:%.0f%n", tl.get(0).getVida(), tl.get(1).getVida(),
				tl.get(2).getVida());
		System.out.println("===========");
		System.out.print("Jogador1: ");
		int l1 = sc.nextInt();
		System.out.print("Jogador2: ");
		int l2 = sc.nextInt();
		Ring r = new Ring(tl.get(l1), tl.get(l2));
		while (tl.get(l1).getVida() > 0 && tl.get(l2).getVida() > 0) {
			System.out.println("===========");
			System.out.println("      "+tl.get(l1).getNome()+" X "+tl.get(l2).getNome());
		System.out.println("[1]Soco [2]Chute [3]Especial: ");
		System.out.print(tl.get(l1).getNome()+":");
		if(tl.get(l1).getVida() < 50) {
			tl.get(l1).setForca(tl.get(l1).getForca() + 10);
			}
		int opc1 = sc.nextInt();
		r.acao1(opc1);
		
		System.out.println("==========");
		if(tl.get(l2).getVida() < 50) {
			tl.get(l2).setForca(tl.get(l2).getForca() + 10);
			}
		if(tl.get(l2).getVida() > 0) {		
		System.out.print(tl.get(l2).getNome()+":");
		int opc2 = sc.nextInt();
		r.acao2(opc2);
		}
		}
		System.out.println("===========");
		System.out.println(r.vitoria());

		sc.close();

	}

}
