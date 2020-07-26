package Recomeco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto1;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class ProgramaFuncionario1 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto1> p = new ArrayList<>();
		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do produto #"+(i+1)+":");
			System.out.print("Nacional, Usado, Importado (n,u,i)?: ");
			char opcao = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			if(opcao == 'i') {
				System.out.print("Alfandega: ");
				Double alfandega = sc.nextDouble();
				p.add(new ProdutoImportado(nome, preco, alfandega));
			}else if(opcao == 'n') {
				p.add(new Produto1(nome, preco));
			}else {
				System.out.print("Data de fabricação: ");
				Date fabric = d.parse(sc.next());
				p.add(new ProdutoUsado(nome, preco, fabric));
			}
		}
		System.out.println();
		System.out.println("PrecoTag: ");
		for(Produto1 x: p) {
			System.out.println(x);
		}
		sc.close();
	}

}
