import java.util.*;
public class ReemplazarColumna {
	public static void main(String[]args) {
		int mat[][],i,j,n,m,p;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Número de renglones?");
		n= entrada.nextInt();
		
		System.out.println("¿Número de columnas?");
		m=entrada.nextInt();
		
		mat = new int[n][m];
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.println(mat[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("¿Qué columna va a reemplazar?");
		p = entrada.nextInt();
		
		for(i=0;i<n;i++) {
			System.out.println("Valor"+i+","+p);
			mat[i][p]=entrada.nextInt();
		}
		
		System.out.println("Matriz nueva:");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.println(mat[i][j]+"\t");
			}
		}
		System.out.println();
		
	}
	
}
