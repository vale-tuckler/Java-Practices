import javax.swing.*;
public class Mayor {

	public static void main (String[]args) {
		int[] numeros;
		String r = "";
		int mayor, menor;
		
		
		numeros = new int [3];
		
		// Leyendo n números		
		for (int i = 0; i<numeros.length; i++) {
			
			numeros [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número " + i));
				
		
		
		//Encontrando el mayor
		mayor = numeros [0];
		menor = numeros [0];
		
		for (int j = 0; j < numeros.length; j++) {
			
		if (numeros[i] < menor) {
			menor = numeros[i];
		}
		
		else if(numeros[i] > mayor){
            mayor = numeros[i];
        }
		
		}
		
		r = "Número mayor: " + mayor;
		r += "\nNúmero menor: " + menor;
			
		}
		
		JOptionPane.showMessageDialog(null, r);
		
		
		
	}
}
