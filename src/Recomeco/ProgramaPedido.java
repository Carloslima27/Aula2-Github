package Recomeco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente1;
import entidades.Pedido1;
import entidades.PedidoItem;
import entidades.Produto;
import entidades.enums.StatusDoPedido1;

public class ProgramaPedido {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Entre com o dado do clente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date data = d.parse(sc.next());
		
		System.out.print("Entre com dados do pedido: ");
		sc.nextLine();
		String status = sc.nextLine();
		Pedido1 p = new Pedido1(new Date(),StatusDoPedido1.valueOf(status),new Cliente1(nome, email, data)); 
		System.out.print("Quantos itens para este pedido: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Entre com o #"+(i+1)+" dado do item: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Preço do produto: ");
			Double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();
			p.addItem(new PedidoItem(quantidade, preco, new Produto(nome, preco)));
		}
		System.out.println(p);
		
		sc.close();
		}

}
