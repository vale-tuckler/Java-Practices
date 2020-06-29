
public class vendedor {

	private int numero;
	private String nombre;
	private double ventas;
	
	public vendedor(int num, String nom, double v) {
		numero = num;
		nombre = nom;
		ventas = v;
	}
	
	public void setNumero(int num) {
		numero = num;
	}
	
	public void setNombre(String nom) {
		nombre = nom;
	}
	public void setVentas(double ven) {
		ventas = ven;
}
	public int getNumero() {
		
		return numero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public double getVentas() {
		return ventas;
	}
	public String toString() {
		String a="";
		a= "Nombre: "+nombre;
		a+="\nNúmero: "+ numero;
		a+="\nVentas: "+ ventas;
		return a;
		
	}

}
