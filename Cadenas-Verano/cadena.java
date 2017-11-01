import java.io.IOException;
import java.lang.*;
import java.util.Scanner;
import java.io.File;

public class cadena{
	
	//Declaracion de variables
	static String[] cad  = new String[6];
	
	// Lee el archivo
	static void leerArchivo(String ruta)
	{
		int counter=0;	
		
		try{
			Scanner scan=new Scanner(new File(ruta));
			while(scan.hasNextLine()){
				String linea = scan.nextLine();
				cad[counter]=linea;
				counter++;
			}
		}
		catch (IOException e){
			System.err.println(e);
		}
	}
	
	public static void main(String[] args)
	{		
		int tam=cad[0].length();
		int cont=0;
		adj matriz=new adj(5);
		
		// Obtener la palabras
		leerArchivo("palabras.txt");
		
		
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				cont=0;
				for(int pos=0;pos<cad[0].length();pos++)
					if(cad[i].substring(tam-pos-1,tam).compareTo(cad[j].substring(0,pos+1))==0)
						cont=pos+1;
				if(i==j)
					matriz.addEdge(i, j, 0);
				else
					matriz.addEdge(i, j, cont);
			}
		}
		
		System.out.println("");
		int max;
		int pos=0;
		
		System.out.print(cad[0]);
		for (int i=0,k=0;k<4;i++,k++)
		{
			max=0;
			for (int j=0;j<5;j++)
			{
				if(matriz.adjm[i][j]>max){
					max=matriz.adjm[i][j];
					pos=j;
				}
				
			}
			//String a=cad[pos].substring(matriz.adjm[i][pos]);
			System.out.print(cad[pos].substring(matriz.adjm[i][pos]));
			i=pos-1;
		}
		
	}
}