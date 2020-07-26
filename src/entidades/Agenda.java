package entidades;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Pessoa> p = new ArrayList<>();

	public List<Pessoa> getP() {
		return p;
	}

	public void addPessoa(Pessoa p) {
		this.p.add(p);
	}

	public void removePessoa(String nome) {

		Pessoa result = p.stream().filter(x -> x.getNome() == nome).findFirst().orElse(null);

		int posicao = p.indexOf(result);
		p.remove(posicao);

	}

	public List<Integer> buscarPessoa(String nome) {
		
		List<Integer>posicao = new ArrayList<>();
		 posicao.add( p.indexOf(p.stream().filter(a -> a.separa().equals(nome)).findAny().orElse(null)));
		 return posicao;
	}

	public void imprimirAgenda() {

		for (Pessoa x : p) {
			System.out.println("Nome: " + x.getNome());
			System.out.println("Idade: " + x.getIdade());
			System.out.println("Altura: " + String.format("%.2f", x.getAltura()));
			System.out.println();
		}

	}

	public void imprimirPessoa(List<Integer> posicao) {
		for(Integer x: posicao) {
		if (x != -1) {
			System.out.println(p.get(x));
		} else {
			System.out.println("Nome Invalido!");
		}
		}
	}
}
