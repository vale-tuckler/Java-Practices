import java.util.*;
public class NumeroPerfecto {
	//Any number can be a Java Perfect Number,
	//If the sum of its positive divisors excluding the number itself is equal to that number.
	//private static Scanner input;
	
	public static void main(String []args) {
		
		int i, Number, Sum = 0,m=0;	
		String r="";
		Number = 1000;
		Object [] a;
		a= new Object[1000];
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				a[i]=i;
		    	m=(int)a[i];}
		    if(m+Sum<=1000) {
		    	Sum+=m;
			r+="El numero: "+m+" es perfecto.\n";
		}}
	 System.out.println(r);
	}
}	
	
	

