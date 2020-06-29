import java.util.*;
public class NewMovimientosCuenta {

	public static void main(String[]args) {
		Cliente cliente;
		NewCuenta cuenta;
		int numCliente=0, numCuenta, op;
		String nom;
		double saldo, cant;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombre del cliente: ");
		nom = entrada.nextLine(); 
		
		System.out.println("Número de cliente: ");
		numCliente=entrada.nextInt();
		
		cliente = new Cliente(numCliente,nom);
		
		
		System.out.println("Número de cuenta: ");
		numCuenta = entrada.nextInt();
		
		System.out.println("Saldo inicial: ");
		saldo=entrada.nextDouble();
		
		cuenta = new NewCuenta(numCuenta, cliente, saldo);
		
		
		System.out.println("0)Terminar\n1)Depositar\n2)Retirar\n3)Consultar saldo");
		
		op=entrada.nextInt();
		
		while(op!=0) {
			switch(op) {
			case 1:
				System.out.println("Cantidad: ");
				cant = entrada.nextDouble();
				cuenta.depositar(cant);
				break;
			case 2: 
				System.out.println("Cantidad: ");
				cant = entrada.nextInt();
				cuenta.retirar(cant); 
				break;
			case 3:
				System.out.println("Cuenta: "+cuenta.getNumero()+ "\n"+ "Nombre: "+ cliente.getNombre()+ "\n"+"Saldo: "+ cuenta.getSaldo());
			
			break;
			}
			
		}
		
		System.out.println("0)Terminar\n1)Depositar\n2)Retirar\n3)Consultar saldo");
		op = entrada.nextInt();
	}
}
