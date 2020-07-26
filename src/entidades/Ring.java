package entidades;

public class Ring {
	private Lutador1 lutador1;
	private Lutador1 lutador2;
	
	
	public Ring(Lutador1 lutador1, Lutador1 lutador2) {
		
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
	}
	
	public Lutador1 getLutador1() {
		return lutador1;
	}

	public void setLutador1(Lutador1 lutador1) {
		this.lutador1 = lutador1;
	}

	public Lutador1 getLutador2() {
		return lutador2;
	}

	public void setLutador2(Lutador1 lutador2) {
		this.lutador2 = lutador2;
	}

	public void acao1 (int acao1) {
		switch(acao1) {
		case 1:
			System.out.println(lutador1.getNome()+" deu um Soco!");
			lutador2.setVida(lutador2.getVida()-(lutador1.getForca()+2));
			System.out.println("HP "+lutador2.getNome()+" "+Math.abs(lutador2.getVida()));
			break;
		case 2: 
			System.out.println(lutador1.getNome()+" deu um Chute!");
			lutador2.setVida(lutador2.getVida()-(lutador1.getForca()+4));
			System.out.println("HP "+lutador2.getNome()+" "+Math.abs(lutador2.getVida()));
			break;
		case 3:
			System.out.println(lutador1.getNome()+" deu uma Voadora de dois pés!");
			lutador2.setVida(lutador2.getVida()-(lutador1.getForca()+50));
			System.out.println("HP "+lutador2.getNome()+" "+Math.abs(lutador2.getVida()));
			break;
			
		}
	}
	public void acao2 (int acao2) {
		switch(acao2) {
		case 1:
			System.out.println(lutador2.getNome()+" deu um Soco!");
			lutador1.setVida(lutador1.getVida()-(lutador2.getForca()+2));
			System.out.println("HP "+lutador1.getNome()+" "+lutador1.getVida());
			break;
		case 2: 
			System.out.println(lutador2.getNome()+" deu um Chute!");
			lutador1.setVida(lutador1.getVida()-(lutador2.getForca()+4));
			System.out.println("HP "+lutador1.getNome()+" "+lutador1.getVida());
			break;
		case 3:
			System.out.println(lutador2.getNome()+" deu um Voadora de dois pés!");
			lutador1.setVida(lutador1.getVida()-(lutador2.getForca()+50));
			System.out.println("HP "+lutador1.getNome()+" "+lutador1.getVida());
			break;
			
		}
	}
	public String vitoria() {
		String aux = "";
		if(lutador2.getVida() <= 0) {
			aux = lutador1.getNome()+" VENCEU!!!";
		}else if(lutador1.getVida() <=0) {
			aux = lutador1.getNome()+" VENCEU!!!";
		}
		return aux;
	}
	
	
	
}
