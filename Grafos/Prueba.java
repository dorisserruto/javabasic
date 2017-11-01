import java.io.*;
public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int numv;
		//Global.c.println("Ingrese dimensiones del grafo ");
		System.out.println("Ingrese dimensiones del grafo ");
		//numv=Global.c.readInt();
		numv=Integer.parseInt(Global.b.readLine());
		adj g=new adj(numv);
		g.read();
		g.mostrar_lados(1);
		}
	}