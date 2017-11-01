//import java.io.*;

public class Arrays {
	
	static Console co = new Console();
	static void imprimir(int[] a){
		for (int i=0; i<a.length; i++){
			co.println(a[i]);
		}
	}
	
	static double[][] fillMatriz(double[][] a){
		int c=1;
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a.length;j++){
				a[i][j]=c++;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		//declaracion de un array de enteros de una dimensión
		int v[] = new int[5];
		//declaracion de una matriz
		double m[][] = new double[3][4];
		//llenado de un vector
		for (int i=0;i<v.length;i++){
			v[i]=i;
		}
		//envio del vector a un metodo
		//imprimirv(v);
		
		//envio matriz para su llenado
		//y retorno de la matriz para
		//ser imprimida
		m = fillMatriz(m);
		for (int i=0;i<v.length;i++){
			for (int j=0;j<v.length;j++){
				co.print(m[i][j]+" ");
			}
			co.println();
		}
	}

}
