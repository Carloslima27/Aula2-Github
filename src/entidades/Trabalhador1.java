package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.Departamento;
import entidades.enums.NivelDoTrabalhador;

public class Trabalhador1 {
	private String nome;
	private NivelDoTrabalhador status;
	private Double salarioBase;
	private Departamento departamento;
	private List<Contrato> contrato = new ArrayList<>();
	public Trabalhador1(String nome, NivelDoTrabalhador status, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.status = status;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public NivelDoTrabalhador getStatus() {
		return status;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public List<Contrato> getContrato() {
		return contrato;
	}
	public void setContrato(List<Contrato> contrato) {
		this.contrato = contrato;
	}
	public void addContrato(Contrato contrato) {
		this.contrato.add(contrato);
	}
	public void removeContrato(Contrato contrato) {
		this.contrato.remove(contrato);
	}
	public double renda(int mes, int ano) {
		Calendar c = Calendar.getInstance();
		double soma = 0;
		for(Contrato x: contrato) {
			c.setTime(x.getData());
			int mes1 = 1+ c.get(Calendar.MONTH);
			int ano1 = c.get(Calendar.YEAR);
			if(mes == mes1 && ano == ano1) {
				soma += x.valortotal();
			}
 		}
		return soma + getSalarioBase();
	}
	public	String toString() {
		return "Nome: "+getNome()+
				"\nDepartamento: "+departamento.getNome();
				
	}
	
	
}
