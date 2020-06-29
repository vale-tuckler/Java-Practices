
public class Cliente {
protected int numero;
protected String nombre;

public Cliente(int num, String nom) {
	
	numero = num;
	nombre = nom;
}

public void setNombre(String nom) {
	nombre = nom;
}

public void setNumero(int num) {
	numero = num;
}

public String getNombre() {
	return nombre;
}

public int getNumero() {
	return numero;
}




}
