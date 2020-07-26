package Recomeco;

import java.util.Scanner;

public class JogoDaVelha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] n = new String[3][3];
		System.out.println("| 1 | 2 | 3 |");
		System.out.println("| 4 | 5 | 6 |");
		System.out.println("| 7 | 8 | 9 |");
		
		while(jogo(n)) {
		
		String a;
		
		Integer i = sc.nextInt();
			a = "i";
		posicao(i, n, a);
		    a = "j";
		    
		    
		Integer j = sc.nextInt();
		    
		
		posicao(j, n, a);
		    
		    
		}
		sc.close();

	}

	static void posicao(int i, String[][] n, String a) {
		int p1 = 0, p2 = 0;
		switch (i) {
		case 1:
			p1 = 0;
			p2 = p1;
			break;
		case 2:
			p1 = 0;
			p2 = 1;
			break;
		case 3:
			p1 = 0;
			p2 = 2;
			break;
		case 4:
			p1 = 1;
			p2 = 0;
			break;
		case 5:
			p1 = 1;
			p2 = p1;
			break;
		case 6:
			p1 = 1;
			p2 = 2;
			break;
		case 7:
			p1 = 2;
			p2 = 0;
			break;
		case 8:
			p1 = 2;
			p2 = 1;
			break;
		case 9:
			p1 = 2;
			p2 = p1;
			break;
		}
		if(a == "i") {
		tela1(p1, p2, n, a);
		}else {
		tela1(p1, p2, n, a);
		}
	}

	static void tela1(int a, int b, String[][] n, String qt) {
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				if(n[i][j] == null) {
				n[i][j] = " ";
				}
			}
		}
		if(qt == "i") {
		n[a][b] = "X";
		}else {
		n[a][b] = "O";
		}
		
			
		
		System.out.println("| " + n[0][0] + " | " + n[0][1] + " | " + n[0][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + n[1][0] + " | " + n[1][1] + " | " + n[1][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + n[2][0] + " | " + n[2][1] + " | " + n[2][2] + " |");
		System.out.println("================");
		
		

	}
	static boolean jogo(String[][] n) {
		boolean vitoria = false;
		if(n[0][0] == "X" && n[0][1] == "X" && n[0][2] == "X") {
			System.out.println("O vencedo é o Jogador X");
		}else if(n[0][0] == "O" && n[0][1] == "O" && n[0][2] == "O") {
			System.out.println("O vencedo é o Jogador O");
		}else if(n[1][0] == "X" && n[1][1] == "X" && n[1][2] == "X") {
			System.out.println("O vencedo é o Jogador X");
		}else if(n[1][0] == "O" && n[1][1] == "O" && n[1][2] == "O") {
			System.out.println("O vencedo é o Jogador O");
		}else if(n[2][0] == "X" && n[2][1] == "X" && n[2][2] == "X") {
			System.out.println("O vencedo é o Jogador X");
		}else if(n[2][0] == "O" && n[2][1] == "O" && n[2][2] == "O") {
			System.out.println("O vencedo é o Jogador O");
		}else if(n[0][0] == "X" && n[1][0] == "X" && n[2][0] == "X") {
			System.out.println("O vencedo é o Jogador X");
		}else if(n[0][0] == "O" && n[1][0] == "O" && n[2][0] == "O") {
			System.out.println("O vencedo é o Jogador O");
		}else if(n[0][1] == "X" && n[1][1] == "X" && n[2][1] == "X") {
			System.out.println("O vencedo é o Jogador X");
		}else if(n[0][1] == "O" && n[1][1] == "O" && n[2][1] == "O") {
			System.out.println("O vencedo é o Jogador O");
		}else if(n[0][2] == "X" && n[1][2] == "X" && n[2][2] == "X") {
			System.out.println("O vencedo é o Jogador X");
		}else if(n[0][2] == "O" && n[1][2] == "O" && n[2][2] == "O") {
			System.out.println("O vencedo é o Jogador O");
		}else if(n[0][0] == "X" && n[1][1] == "X" && n[2][2] == "X") {
			System.out.println("O vencedo é o Jogador X");
		}else if(n[0][0] == "O" && n[1][1] == "O" && n[2][2] == "O") {
			System.out.println("O vencedo é o Jogador O");
		}else if(n[2][0] == "X" && n[1][1] == "X" && n[0][2] == "X") {
			System.out.println("O vencedo é o Jogador X");
		}else if(n[2][0] == "O" && n[1][1] == "O" && n[0][2] == "O"){
			System.out.println("O vencedo é o Jogador O");
	    }else {
		 vitoria = true;
	   }  
		int cont = 0;
		for(int i = 0; i < n.length;i++) {
			for(int j = 0; j < n.length; j++) {
				if(n[i][j] == "X" || n[i][j] == "O") {
					cont ++;
				}
			}
		}
		if(cont == 9 && vitoria == true) {
			System.out.println("Empate!");
		}
		
	return vitoria;


	}
}
