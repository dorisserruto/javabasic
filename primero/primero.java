
//import java.util.*;
import java.io.*;

public class primero {

	// Suma de dos numeros
	public static int suma (int x, int y) {
		return x + y;
	}
	
	// Mayor de 3 numeros
	public static int mayor (int x, int y, int z) {
		if ((x > y) && (x > z))
			return x;
		else
		{
			if ((y > x) && (y > z))
				return y;
			else
			{
				if ((z > x) && (z > y))
					return z;
				else
					return 0;
			}				
		}
	}
	
	// Ejercicio Nro. 2
	
	
	
	public static void main(String[] args) throws IOException {
		/*
		int a, b, c;
		int r;
		
		Console co = new Console();
	
		co.println("Ingrese primer numero :");
		a = co.readInt();
		
		co.println("Ingrese segundo numero :");
		b = co.readInt();
		
		co.println("Ingrese tercer numero :");
		c = co.readInt();
		
		//r = suma (a,b);
		//co.println("La suma es :" + r);
		
		r = mayor (a,b,c);
		co.println("El mayor de los tres es :" + r);
		
		//temp = b.readLine();
		//c = Integer.parseInt(temp);
		 
		 */
		/*
		int a, b, c, r;
		String temp;
		BufferedReader bu= new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println ("Ingresar primer numero");
		temp = bu.readLine();
		a = Integer.parseInt(temp);

		System.out.println ("Ingresar segundo numero");
		temp = bu.readLine();
		b = Integer.parseInt(temp);
		
		System.out.println ("Ingresar tercer numero");
		temp = bu.readLine();
		c = Integer.parseInt(temp);
		
		//r = suma (a,b);
		r = mayor (a,b,c);
		//System.out.println("El resultado es : "+ r);
		
		System.out.println("El mayor es : "+ r);
		
		*/
		/*
		// Suma de los 10
		int n;
		int r = 0;
		String temp;
		BufferedReader bu= new BufferedReader (new InputStreamReader (System.in));
		
		for (int i=0;i<10;i++)
		{
			System.out.println ("Ingresar numero");
			temp = bu.readLine();
			n = Integer.parseInt(temp);
			r = r + n;
		}
		System.out.println("La suma de los 10 es : "+ r);
		*/
		
		// Cadena de asteriscos
		/*
		int n;
		String r = "";
		String temp;
		BufferedReader bu= new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println ("Ingresar cantidad");
		temp = bu.readLine();
		n = Integer.parseInt(temp);
		
		for (int i=0;i<n;i++)
		{	
			r = r + "*";
			System.out.println(r);
		}
		*/
		
		// Leer numero -999
		/*
		int n = 0 ;
		String temp;
		BufferedReader bu= new BufferedReader (new InputStreamReader (System.in));
		
		while (n != -999) {
			System.out.println ("Ingresar numero : ");
			temp = bu.readLine();
			n = Integer.parseInt(temp);	
		}
		
		System.out.println("Programa Finalizado");
		*/
		
		// Numero mas pequeño
		/*
		int n = 9999999;
		int menor = 9999999 ;
		String temp;
		BufferedReader bu= new BufferedReader (new InputStreamReader (System.in));
		
		while (n != -999) {
			System.out.println ("Ingresar numero : ");
			temp = bu.readLine();
			n = Integer.parseInt(temp);
			if ((n < menor) && (n!= -999))
				menor = n;
		}
		
		System.out.println("El menor numero ingresado es "+ menor);
		*/
		
		// Promedio de numeros
		/*
		int n = 0;
		int cont = 0;
		int suma = 0 ;
		String temp;
		BufferedReader bu= new BufferedReader (new InputStreamReader (System.in));
		
		while (n != -999) {
			System.out.println ("Ingresar numero : ");
			temp = bu.readLine();
			n = Integer.parseInt(temp);
			if (n != -999 ){
				suma = suma + n;
				cont++;
			}
		}
		System.out.println("El promedio es "+ (suma/cont));
		*/
		
		// Cuantas veces el numero
		/*
		int n, m = 0;
		int cont = 0;
	
		String temp;
		BufferedReader bu= new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println ("Ingresar numero : ");
		temp = bu.readLine();
		n = Integer.parseInt(temp);
		
		while (m != -999) {
			System.out.println ("Ingresar secuencia : ");
			temp = bu.readLine();
			m = Integer.parseInt(temp);
			
			if (m == n ){
				cont ++;
			}
		}
		System.out.println("El numero "+ n + " se repite "+ cont + " veces.");
		*/
		
		// MENU
		int n;
		String temp;
		BufferedReader bu= new BufferedReader (new InputStreamReader (System.in));
		
		
		System.out.println ("	MENU     ");
		System.out.println ("1. Ingresar Nueva Orden");
		System.out.println ("2. Ver datos almacen");
		System.out.println ("3. Imprimir reportes");
		System.out.println ("4. Salir");
		System.out.println ("Opcion?");
		
		temp = bu.readLine();
		n = Integer.parseInt(temp);
		
		switch (n){
			case 1:	System.out.println ("Se selecciono la Opcion 1");
			case 2:	System.out.println ("Se selecciono la Opcion 2");
			case 3:	System.out.println ("Se selecciono la Opcion 3");
			case 4:	break;
		}
	}
}
