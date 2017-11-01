import java.io.*;
public class D2 {

	//Cadena Genetica DNA
	//Ingenieria Informatica - Estructuras Discretas II
	//Doris V. Serruto Rodrigo
	//D2.java
	
	static int pvintIncidCA[] = new int[64];
	static int pvintIncidCB[] = new int[64];

	static void limpiar(int[] vector)
	{
		for (int i = 0; i< 64; i++)
		{
			vector[i] = 0;
		}
	}
	
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
	 return (1* valorNucleo(xvchTrio[0]))+(4*valorNucleo(xvchTrio[1]))+(16*valorNucleo(xvchTrio[2]));
	}

	//Divide la cadena en trio para contar sus incidencias
	static void dividirCadena(char xvchCadena[], int xvintInc[])
	{
	 char lvchTrio[] = new char[3];
	 
	 limpiar()
	 for (int i = 0; i< (xvchCadena.length) -2; i++)
	 {
	  lvchTrio[0] = xvchCadena[i]; 
	  lvchTrio[1] = xvchCadena[i + 1];
	  lvchTrio[2] = xvchCadena[i + 2];

	  xvintInc[obtenerPosicion(lvchTrio)]++;
	 }
	}

	//Calcular el valor D2
	static int calcularD2(char xvchCadena01[],char xvchCadena02[])
	{
	 int lintD2= 0;
	 
	 dividirCadena(xvchCadena01,pvintIncidCA);
	 dividirCadena(xvchCadena02,pvintIncidCB);

	 for (int i = 0; i< 64; i++)
	 {
	  lintD2 = lintD2 + ((pvintIncidCA[i] - pvintIncidCB[i])*(pvintIncidCA[i] - pvintIncidCB[i]));
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

	static char[] convertirString(String cadena)
	{
		char [] lvchCadena = new char[cadena.length()];
		for (int i = 0; i< cadena.length(); i++)
		{
			lvchCadena[i] = cadena.charAt(i);
		}
		return lvchCadena;
	}
	public static void main(String argv[]) throws IOException, FileNotFoundException
	{
		String path;
		path = null;
		path = argv[0];
		String pstrCadena = null;
		char[] pvchCadenaA = null;
		char[] pvchCadenaB = null;
	
		BufferedReader lbrLector = new BufferedReader(new InputStreamReader(new FileInputStream(path)));//path)));
		 //Obtener la primera cadena
		if ((pstrCadena = lbrLector.readLine())!= null)
		{
			pvchCadenaA = convertirString(pstrCadena);
			//Obtener la segunda cadena
			if ((pstrCadena = lbrLector.readLine())!= null)
			{
				pvchCadenaB = convertirString(pstrCadena);
			}
		}
		else
		{
			System.out.println("El archivo esta vacio");
		}
				 
		 //Imprimir primera cadena
		 System.out.println(pvchCadenaA);
	
		 //Imprimir segunda cadena
		 System.out.println(pvchCadenaB);
	
		 // Imprimir complemento inverso de la primera cadena
		 System.out.println(invertirCadena(pvchCadenaB));
		 
		 //	Imprimir D2 de las dos cadenas ingresadas
		 System.out.println(calcularD2(pvchCadenaA, pvchCadenaB));
	
		 // Imprimir D2 de la primera cadena y su complemento inverso
		 System.out.println(calcularD2(pvchCadenaA, invertirCadena(pvchCadenaB)));
	}
}

