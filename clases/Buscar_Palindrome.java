import java.util.*;
public class Buscar_Palindrome {

	public static void main(String[]args) {
		String s;
		int i,j;
		boolean flag=true;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame un String: ");
		s = entrada.next();
		
		
		for(i=0, j=s.length()-1;i<s.length()/2;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=false;
			}
			
		}
		
		if(flag) {
			System.out.println(s+" Es palíndrome");
		}
		else {
			System.out.println(s+" No es palíndrome");
		}
	}
}
