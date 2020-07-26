package entidades;

public class IntervaloTest {
	private Integer inicio;
	private Integer fim;
	
	public IntervaloTest(Integer inicio, Integer fim) {
		
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
	public void  inteiro() {
		
		for(int i = getInicio(); i <= getFim(); i++) {
			System.out.print(", "+i);
		}
		
		
	}
	public void impar() {
		
		for(int i = getInicio(); i <= getFim(); i++) {
			if(i % 2 != 0) {
				System.out.print(", "+i+" = Impar");
			}
		}
		
	}
	public void parEImpar() {
		
		for(int i = getInicio(); i <= getFim();i++) {
			if(i % 2 == 0) {
				System.out.print(", "+i+" = Par");
			}else {
				System.out.print(", "+i+" = Impar");
			}
		}
		
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
			System.out.println("Soma dos numeros no intervalo ["+getInicio()+", "+getFim()+"]: "+soma());
			break;
		case 2:
			System.out.print("Numeros Inteiro no intervalo ["+getInicio()+", "+getFim()+"]: "); inteiro();
			break;
		case 3:
			System.out.print("Impar no Intervalo de ["+getInicio()+", "+getFim()+"]: ");impar();
			
			break;
		case 4:
			System.out.print("Numeros Pares e impares no Intervalo de ["+getInicio()+", "+getFim()+"]: ");parEImpar();
			
		}
	}
}
