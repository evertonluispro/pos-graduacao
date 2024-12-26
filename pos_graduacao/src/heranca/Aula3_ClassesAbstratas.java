package heranca;

public class Aula3_ClassesAbstratas {

	public static void main(String[] args) {
		
		Conta cp = new Poupanca();
		cp.setsaldo(5000);
		cp.imprimeExtrato();

	}

}
