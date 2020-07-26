package entidades;

import java.util.ArrayList;
import java.util.List;

public class Intervalo {
	private Integer inicio;
	private Integer fim;
	
	public Intervalo(Integer inicio, Integer fim) {
		
		this.inicio = inicio;
		this.fim = fim;
	}
	public Integer soma() {
		int soma = 0;
		for(int i = getInicio(); i <= getFim(); i++) {
		 soma += i;
		}
		return soma;
	}
	public List<Integer> inteiro() {
		List<Integer> l = new ArrayList<>();
		for(int i = getInicio(); i <= getFim(); i++) {
			l.add(i);
		}
		return l;
		
	}
	public List<String> impar() {
		List<String> impar = new ArrayList<>();
		for(int i = getInicio(); i <= getFim(); i++) {
			if(i % 2 != 0) {
				impar.add(i+" = Impar");
			}
		}
		return impar;
	}
	public List<String> parEImpar() {
		List<String> aux = new ArrayList<>();
		for(int i = getInicio(); i <= getFim();i++) {
			if(i % 2 == 0) {
				aux.add( i+" = Par!");
			}else {
				aux.add(i+" = Impar"); 
			}
		}
		return aux;
	}

	public Integer getInicio() {
		return inicio;
	}

	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}

	public Integer getFim() {
		return fim;
	}

	public void setFim(Integer fim) {
		this.fim = fim;
	}
	public void  mensagem(int opcao) {
		switch(opcao) {
		case 1:
			System.out.println("Soma do Intervalo de ["+inicio+", "+fim+"]: "+soma());
			break;
		case 2:
			System.out.print("Interos no Intervalo de ["+inicio+", "+fim+"]: ");
			for(Integer x: inteiro()) {
			System.out.print(x+", ");
			}
			break;
		case 3:
			System.out.print("Impar no Intervalo de ["+inicio+", "+fim+"]: ");
			for(String y : impar()) {
				System.out.print(y+" ,");
			}
			break;
		case 4:
			System.out.print("Numeros Pares e impares no Intervalo de ["+inicio+", "+fim+"]: ");
			for(String x : parEImpar()) {
				System.out.print(x+" ,");
			}
		}
	}
	
	
}
