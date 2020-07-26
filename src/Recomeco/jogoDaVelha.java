package Recomeco;

import java.util.Scanner;

public class jogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] n = new String[3][3];
		
		System.out.println("| 1 | 2 | 3 |");
		System.out.println("| 4 | 5 | 6 |");
		System.out.println("| 7 | 8 | 9 |");
		String a;
		
		Integer i = sc.nextInt();
			a = "i";
		posicao(i, n, a);
		    a = "j";
		Integer j = sc.nextInt();
		
		posicao(j, n, a);

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
		tela1(p1, p2, n);
		}else {
		tela2(p1, p2, n);
		}
	}

	static void tela1(int a, int b, String[][] n) {
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				n[i][j] = " ";
			}
		}
		
		n[a][b] = "X";
		
			
		
		System.out.println("| " + n[0][0] + " | " + n[0][1] + " | " + n[0][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + n[1][0] + " | " + n[1][1] + " | " + n[1][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + n[2][0] + " | " + n[2][1] + " | " + n[2][2] + " |");
		

	}
static void tela2(int a, int b, String[][] n) {
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				if(n[i][j] == null) {
				n[i][j] = " ";
				}
			}
		}
		
		n[a][b] = "O";
		
			
		
		System.out.println("| " + n[0][0] + " | " + n[0][1] + " | " + n[0][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + n[1][0] + " | " + n[1][1] + " | " + n[1][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + n[2][0] + " | " + n[2][1] + " | " + n[2][2] + " |");
		

	}
}
