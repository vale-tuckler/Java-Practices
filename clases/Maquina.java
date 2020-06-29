
public class Maquina {
	private int numero;
	private String descripcion;
	private int horasTrabajadas;
	private int piezasXHora;
	
	public Maquina(int num, String desc, int hrs, int pzas) {
		numero = num;
		descripcion = desc;
		horasTrabajadas = hrs;
		piezasXHora = pzas;
	}
	
	public void setNumero(int num) {
		numero = num;
	}
	
	public void setDescripcion(String d) {
		descripcion = d;
	}
	public void sethorasTrabajadas(int h) {
		horasTrabajadas = h;
	}
	public void setpiezasXHora(int p) {
		piezasXHora = p;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public int getPiezasxHora() {
		return piezasXHora;
	}
	
	//Método que calcula la producción semanal
	
	public int calcularProducciónSemanal() {
		return horasTrabajadas * piezasXHora;
	}
	public String toString() {
		String datos="";
		datos= "Número: "+ numero;
		datos+="Descripción: "+descripcion;
		datos+="Horas trabajadas: "+horasTrabajadas;
		datos+="Piezas por hora: "+piezasXHora;
		return datos;
	}

}
