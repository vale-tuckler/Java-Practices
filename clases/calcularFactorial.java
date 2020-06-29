import java.util.*;
public class calcularFactorial {

	static Scanner entrada = new Scanner(System.in);
	public static void main (String[]args) {
		
		int i, n, fact;
		fact = 1;
		
		System.out.println("Dame n:");
		n = entrada.nextInt();
		for(i = 1; i <=n; i++) {
			fact = fact * i;
		}
			
		System.out.println("Factorial: " + fact);
		
	}

}
