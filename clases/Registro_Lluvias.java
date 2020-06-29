import java.util.*;
public class Registro_Lluvias {

	public static void main(String []args) {
		
		int lluvias[][], totales[],totalMes[],i,j,mayor=0;
		String municipios[], nombreMes[];
		Scanner input = new Scanner(System.in);
		
		lluvias = new int[5][12];
		totales = new int[5];
		municipios = new String[5];
		totalMes = new int[12];
		nombreMes=new String[12];
		
		municipios[0]= "Saltillo";
		municipios[1]="Ramos Arizpe";
		municipios[2]="Gral. Cepeda";
		municipios[3]="Arteaga\t";
		municipios[4]="Parras\t";
		
		nombreMes[0]="Enero";
		nombreMes[1]="Febrero";
		nombreMes[2]="Marzo";
		nombreMes[3]="Abril";
		nombreMes[4]="Mayo";
		nombreMes[5]="Junio";
		nombreMes[6]="Julio";
		nombreMes[7]="Agosto";
		nombreMes[8]="Septiembre";
		nombreMes[9]="Octubre";
		nombreMes[10]="Noviembre";
		nombreMes[11]="Diciembre";
		
		//Para recorrer una matriz se necesitan ciclos anidados
		
		for(i=0; i<5;i++) {
			for(j=0;j<12;j++) {
				System.out.println("Lluvia de "+ municipios[i]+ " en "+ nombreMes[j]);
				lluvias[i][j]=input.nextInt();
			}
			
		}
		System.out.println("Municipio\t E\t F\t M\t A\t MAY\t JUN\t JUL\t A\t S\t O\t N\t D\t TOTAL/MES");
		for(i=0;i<5;i++) {
			System.out.print(municipios[i]+"\t");
			totales[i]=0;
			
			for(j=0;j<12;j++) {
				System.out.print(lluvias[i][j]+"\t");
				totales[i]=totales[i]+lluvias[i][j];
				
			}

			System.out.println(totales[i]);
		}
		for(i=0;i<5;i++) {
			if(totales[i]>totales[mayor]) {
				mayor=i;
			}
			
		}
		System.out.println("\nEl municipio en que llovió más fue: "+ municipios[mayor]);
		System.out.println("\nEl registro de lluvia fue: "+totales[mayor]);
		System.out.print("\nTotal de lluvia por mes en todos los municipios:\n\n");
		
		//Aquí inicia la suma por columna
		for(j=0;j<12;j++) {
			totalMes[j]=0;
				for(i=0;i<5;i++) {
					totalMes[j]=totalMes[j]+lluvias[i][j];
				}
				System.out.println("Mes: "+ nombreMes[j]+ "\n"+totalMes[j]);
		}
	}
}
