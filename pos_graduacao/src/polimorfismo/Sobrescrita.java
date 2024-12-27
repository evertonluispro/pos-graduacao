package polimorfismo;

class Linguagem{
	public void mostrarInformacao() {
		System.out.println("Lingua Portuguesa");
	}
}

class Java extends Linguagem {
	public void mostrarInformacao() {
		System.out.println("Linguagem Java");
	}
}

public class Sobrescrita {

	public static void main(String[] args) {
		//criar um obejto da linguagem java
		Java j1 = new Java();
		j1.mostrarInformacao();
		
		Linguagem l1 = new Linguagem();
		l1.mostrarInformacao();

	}

}
