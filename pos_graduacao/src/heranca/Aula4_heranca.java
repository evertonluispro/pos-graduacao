package heranca;

public class Aula4_heranca {

	public static void main(String[] args) {
		
		cachorro c = new cachorro();
		c.setNome("Bidu");
		
		Gato g = new Gato();
		g.setNome("Lola");
		
		c.mostrar();
		g.mostrar();

	}

}
