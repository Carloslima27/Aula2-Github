package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Reserva;

public class ProgramaReserva {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");	
		
		System.out.print("Numero do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de entrada: ");
		Date entrada = d.parse(sc.next());
		System.out.print("Data de saida: ");
		Date saida = d.parse(sc.next());
		if(!saida.after(entrada)) {
			System.out.println("Erro na reserva: data de saida deve ser depois de data de entrada!");
		}else {
			Reserva r = new Reserva(numero, entrada, saida);
			System.out.println(r);
			System.out.println();
			System.out.println("Entre com a data para atualizar reseva");
			System.out.print("Data de entrada: ");
			 entrada = d.parse(sc.next());
			System.out.print("Data de saida: ");
			 saida = d.parse(sc.next());
			 Date agora = new Date();
			 if(entrada.before(agora) || saida.before(agora)) {
				 System.out.println("Erro na reserva: As atualizações devem ser futuras!");
			 }else if(!saida.after(entrada)) {
				 System.out.println("Erro na atualização: data de saida deve ser depois de data de entrada!");
				
			 }else {
				  r.atualizarData(entrada, saida);
				 System.out.println(r);
			 }
		}
		
		
		sc.close();
	}

}
