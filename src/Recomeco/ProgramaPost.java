package Recomeco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidades.Comentario1;
import entidades.Post1;

public class ProgramaPost {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Post1 post1 , post2;
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		post1 = new Post1(d.parse("21/06/2018 13:05:44"),"Viajar para Nova Zeladia", "Eu vou visitar este pais maravilhoso",12);
		post1.addComentario(new Comentario1("Tenha uma otima viagem"));
		post1.addComentario(new Comentario1("Nossa isto é encrivel!"));
		
		post2 = new Post1(d.parse("22/07/2020 14:59:44"),"Boa noite cara","Vejo você amanhã",5);
		post2.addComentario(new Comentario1("Boa noite"));
		post2.addComentario(new Comentario1("Que a força esteja com você"));
		System.out.println(post1);
		System.out.println();
		System.out.println(post2);
		
		
		
		sc.close();

	}

}
