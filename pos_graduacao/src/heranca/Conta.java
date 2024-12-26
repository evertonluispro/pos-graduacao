package heranca;

abstract class Conta {
	private double saldo;
	
	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public abstract void imprimeExtrato();
}
