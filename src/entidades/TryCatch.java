package entidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		
		metodo1();
		
		System.out.println("Fim do programa!");
		
		
	}
	public static void metodo1() {
		System.out.println("*****Inicio do metodo1****");
		metodo2();
		System.out.println("****Fim do metodo1****");
	}
	public static void metodo2() {
			Scanner sc = new Scanner(System.in);
		System.out.println("****Inicio do metodo2****");
		try {
			String[] nome = sc.nextLine().split(" ");
			int n = sc.nextInt();
			System.out.println(nome[n]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição Invalida!");
			}catch(InputMismatchException e) {
				System.out.println("Input Error!");
			}
		System.out.println("****Fim do metodo2****");
		sc.close();
	}

}
