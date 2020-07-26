package Recomeco;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
				
		List<String> list = new ArrayList<>();
		
		list.add("João");
		list.add("José");
		list.add("Maria");
		list.add(1, "Naruto");
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
			
		}
		System.out.println("-----------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("------------------");
		System.out.println("Index of Naruto: "+list.indexOf("Naruto"));
		System.out.println("Index of Eric: "+list.indexOf("Eric"));
		System.out.println("------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) =='N').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
		
		
		
		
		
		
		
		
	}

}
