import javax.swing.*;
public class Examen_de_admisión {

	public static void main (String []args) {
		int ficha = 0; String nombre = "";
		double cal1 = 0, cal2 = 0;
		
		nombre = JOptionPane.showInputDialog( null, "Ingrese nombre:");
		
		ficha = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte la ficha de examen:"));
		
		cal1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Calificación Examen 1:"));
		
		cal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Calificación Examen 2:"));
		
		
		
		if (cal1 >= 70 && cal2 >= 70) {
			JOptionPane.showMessageDialog(null, "Alumno aceptado");
			
		}
		
		if (cal1 <= 70 && cal2 <= 70) {
			JOptionPane.showMessageDialog(null, "Alumno rechazado");
		}
		
		if (cal1 >= 70 && cal2 <= 70) {
			JOptionPane.showMessageDialog(null, "Alumno rechazado");
		}
		
		if (cal1 <= 70 && cal2 >= 70) {
			JOptionPane.showMessageDialog(null, "Alumno rechazado");
		}
		
	}
}
