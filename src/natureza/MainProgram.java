package natureza;

public class MainProgram {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		m.setPeso(35.2f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();
		r.locomover();
		
		c.locomover();
		k.emitirSom();
		
	}

}
