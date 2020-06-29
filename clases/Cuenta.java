
public class Cuenta {

	protected int numero;
	protected String titular;
	protected double saldo;
	
	public Cuenta(int num, String t, double s) {
		
		numero = num;
		titular = t;
		saldo = s;
	}
	
	public void setnumero(int n) {
		
		numero = n;
	}
	
	public void setitular(String t) {
		titular = t;
	}
	
	public int getnumero() {
		return numero;
	}
	
	public String getitular() {
		return titular;
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	public void depositar(double cant) {
		saldo = saldo + cant;
	}
	
	public void retirar(double cant) {
		if (cant<=saldo) {
			saldo = saldo - cant;
		}
		else {
			System.out.println("Saldo Insuficiente..." + saldo);
		}
	}
	
	public String toString() {
		String r="";
		
		r ="Número de cuenta: " + numero;
		r +="\nTitular de la cuenta: " + titular;
		r += "\nSaldo de la cuenta: "+saldo+"\n";
		return r;
	}
}
