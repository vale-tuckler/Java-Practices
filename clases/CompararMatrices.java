import java.util.*;
public class CompararMatrices {
	public static void main(String[]args) {
		
		int A[][],B[][],i,j,m,n;
		boolean flag=true;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Número de renglones?");
		n=entrada.nextInt();
		
		System.out.println("¿Número de columnas?");
		m=entrada.nextInt();
		
		A=new int[n][m];
		B=new int[n][m];
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.println("Dato de A "+i+","+j);
				A[i][j]=entrada.nextInt();
			}
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(A[i][j]<=B[i][j]) 
					flag = false;
				System.out.println(A[i][j]+"\t");
			}
		}
		
		System.out.println("\t");
		
		for(j=0;j<m;j++) {
			System.out.println(B[i][j]+"\t");
			
		}
		
		System.out.println();
		if(flag) 
		System.out.println("A es mayor que B");
		
		else
			System.out.println("A no es mayor a B");
	}

}
