package entidades;

public class Aluno1 {
	private Double nota1;
	private Double nota2;
	public Aluno1(Double nota1, Double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public double passaDireto() {
		
		return  (getNota1() + getNota2())/2;
		
	}
	public void testeFinal(Double nota3){
		double maiorNota ;
			
		if(getNota1()> getNota2()) {
			maiorNota = getNota1();
		}else {
			maiorNota = getNota2();
		}
		double media = (nota3 + maiorNota) /2;
		if(media >=5.0) {
		 System.out.println("Media: "+media+"\nAprovado!");
		}else {
			System.out.println("Media: "+media+"\nReprovado!");
		}
		
	
	}
	
	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}
	
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	public String toString() {
		if(passaDireto() >=5.0 && getNota1() > 3.0 && getNota2() > 3.0) {
			 return "Media: "+passaDireto()+"\nAprovado";
		}else {
			return "Media: "+passaDireto()+"\nReprovado!Fazer um teste final";
				
	}
			
	
}
}
