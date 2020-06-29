import java.util.*;
import javax.swing.*;
public class ContarVocales {

	
	public static void main(String[]args) {
		
		String frase;
		int i, cont=0;
		char c[] = {0,0,0,0,0};
		
		Scanner input = new Scanner(System.in);
		
		frase = input.nextLine();
		frase = frase.toLowerCase();
		
		for(i=0;i<frase.length();i++) {
			
				switch (frase.charAt(i)) {
				case 'a': 
				case 'e':
				case 'i':
				case 'o':
				case 'u': cont++;
			}
		}
				
				System.out.println(frase+" tiene "+cont+" vocales.");
		
	}
}
