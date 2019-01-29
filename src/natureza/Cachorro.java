package natureza;

public class Cachorro extends Mamifero {
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Toma comida") || frase.equals("Cheguei")) {
			System.out.println("Abanar e Latir");
		}
		else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int minuto) {
		if(hora<12) {
			System.out.println("Abanar");
		}
		else if(hora>=18) {
			System.out.println("Ignorar");
		}
		else {
			System.out.println("Abanar e latir");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar");
		}
		else {
			System.out.println("Rosnar e latir");
		}
	}
	
}
