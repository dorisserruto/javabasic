import java.io.*;
public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int numv;
		System.out.println("Ingrese dimensiones del grafo ");
		numv=Integer.parseInt(Global.b.readLine());
		Grafo g=new Grafo(numv);
		g.read();
		}
	}

