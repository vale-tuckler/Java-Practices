
public class NewCuenta {

	private int numero;
	private Cliente titular;
	private double saldo;
	
	public NewCuenta(int num, Cliente cte, double sal) {
		numero = num;
		titular= cte;
		saldo = sal;
	}
	
	public void setNumero(int num) {
		numero = num;
	}
	public void setCliente(Cliente cte) {
		titular = cte;
	}
	
	public void setSaldo(double sal) {
		saldo = sal;
	}
	
	public int getNumero() {
		return numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double cant) {
		saldo = saldo + cant;
	}
	
	public void retirar(double cant) {
		if(cant<=saldo)
		saldo = saldo - cant;
		else
			System.out.println("Saldo insuficiente...");
	}
	
	
	
}
