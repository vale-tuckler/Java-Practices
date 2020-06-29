import java.util.*;
public class MovimientosCuenta {
	
	public static void main(String[]args) {
	//Esta aplicación abre una cuenta con la información necesaria; número, titular y saldo inicial. 
	//Posteriormente debe generar un menú con las siguientes opciones:
	// 0) Terminar
	// 1) Depositar
	// 2) Retirar
	// 3) Consulta de saldo
		
		Cuenta cta;
		int num = 0, op = 0;
		String titular = "";
		double saldo = 0, cant = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Número de cuenta: ");
		num = input.nextInt();
		
		System.out.println("Titular: ");
		titular = input.next();
		
		System.out.println("Saldo inicial: ");
		saldo = input.nextDouble();
		
		cta = new Cuenta(num, titular, saldo);
		
		System.out.println("0) Terminar\n 1) Depositar\n 2)Retirar\n 3) Saldo\n");
		op = input.nextInt();
		
		while (op >= 0 && op <=3) {
			switch(op) {
			case 1:
				System.out.println("Cantidad: ");
				cant = input.nextDouble();
				cta.depositar(cant); System.out.println("Transacción realizada con éxito");
				break;
			case 2:
				System.out.println("Cantidad: ");
				cant = input.nextDouble();
				cta.retirar(cant);
				break;
			case 3:
				System.out.println("Saldo: " + cta.getsaldo());
				break;
			
			}
			
			System.out.println("\n0) Terminar\n 1) Depositar\n 2) Retirar\n 3) Saldo");
		}
		
		
		
	}

}
