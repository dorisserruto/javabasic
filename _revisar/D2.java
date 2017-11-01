import java.io.*;
public class D2 {

	//Cadena Genetica DNA
	//Ingenieria Informatica - Estructuras Discretas II
	//Doris V. Serruto Rodrigo
	//D2.java

	// Obtiene el valor numerico de cada letra
	static int valorNucleo(char xchNuc)
	{
	 int lintValor = 0;
	 switch (xchNuc)
	 {
	  case 'A': lintValor = 0; break;
	  case 'C': lintValor = 1; break; 
	  case 'T': lintValor = 2; break;
	  case 'G': lintValor = 3; break;
	 }
	 return lintValor;
	}

	//Obtiene la posicion correspondiente del trio
	static int obtenerPosicion(char xvchTrio[])
	{
	 return (1* xvchTrio[0])+(4*xvchTrio[1])+(16*xvchTrio[2]);
	}

	//Divide la cadena en trio para contar sus incidencias
	static void dividirCadena(char xvchCadena[], int xvintInc[])
	{
	 char lvchTrio[] = new char[3];
	 for (int i = 0; i< (xvchCadena.length -2); i++)
	 {
	  lvchTrio[0] = xvchCadena[i + 0]; 
	  lvchTrio[1] = xvchCadena[i + 1];
	  lvchTrio[2] = xvchCadena[i + 2];

	  xvintInc[obtenerPosicion(lvchTrio)]++;
	 }
	}

	//Calcular el valor D2
	static int calcularD2(char xvchCadena01[],char xvchCadena02[])
	{
	 int lintD2= 0;
	 int pvintIncidCA[] = new int[64];
	 int pvintIncidCB[] = new int[64];

	 dividirCadena(xvchCadena01,pvintIncidCA);
	 dividirCadena(xvchCadena02,pvintIncidCB);

	 for (int i = 0; i< 64; i++)
	 {
	  lintD2 = lintD2 + ((pvintIncidCA[i] - pvintIncidCB[i])^2);
	 }
	 return lintD2;
	}

	//Obtener valor inverso
	static char inversoNuc(char xchNuc)
	{
	 char lcharInv= 'O';
	 switch (xchNuc)
	 {
	  case 'A': lcharInv='T';break;
	  case 'T': lcharInv='A';break; 
	  case 'C': lcharInv='G';break;
	  case 'G': lcharInv='C';break;
	 }
	 return lcharInv;
	}

	//Invertir la cadena
	static char [] invertirCadena(char xvchCadena[])
	{
	 char lvchInverso[] = new char[xvchCadena.length];

	 for (int i= 0; i< (xvchCadena.length); i++)
	 {
	  lvchInverso[i] = inversoNuc(xvchCadena[i]);
	 }
	 return lvchInverso;
	}

	public static void main(String argv[]) throws IOException, FileNotFoundException
	{
		String path;
		path = argv[0];
		String pvchCadenaA;
		//String pvchCadenaB;
	
		
		 BufferedReader lbrLector = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		 //Obtener la primera cadena
		 while (lbrLector.readLine()!= null){
			 pvchCadenaA = lbrLector.readLine();
			 System.out.println(pvchCadenaA);
			 //System.out.println(j);
			}
/*
		 //Obtener la segunda cadena
		 
		 //Imprimir primera cadena
		 System.out.println(pvchCadenaA);
	
		 //Imprimir segunda cadena
		 System.out.println(pvchCadenaB);
	
		 //Imprimir D2 de las dos cadenas ingresadas
		 System.out.println(calcularD2(pvchCadenaA, pvchCadenaB));
	
		 // Imprimir complemento inverso de la primera cadena
		 System.out.println(invertirCadena(pvchCadenaA));
	
		 // Imprimir D2 de la primera cadena y su complemento inverso
		 System.out.println(calcularD2(pvchCadenaA, invertirCadena(pvchCadenaA)));
	}

*/
	}
}
