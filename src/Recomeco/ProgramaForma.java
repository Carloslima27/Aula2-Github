package Recomeco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.RetanguloForma;
import entidades.enums.Cor;

public class ProgramaForma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> f = new ArrayList<>();
		System.out.print("Entre com numero de formas: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da forma #"+(i+1));
			System.out.print("Retangulo ou Circulo (r, c)?: ");
			char opcao = sc.next().charAt(0);
				System.out.print("Cor (BLACK/RED/BLUE): ");
				Cor cor = Cor.valueOf(sc.next());
				if(opcao == 'r') {
			
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				System.out.print("Largura: ");
				Double largura = sc.nextDouble();
				f.add(new RetanguloForma(cor, altura, largura));
			}else {
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();
				f.add(new Circulo(cor, raio));
				
			}
		}
		for(Forma x: f) {
			System.out.println(x);
		}
		
		
		
		
		
		sc.close();
	}

}
