import java.io.*;
public class Prueba {

	public static void main(String[] args) throws IOException{
	
		int numv;
		System.out.println("Ingrese dimensiones del grafo ");
		numv=Integer.parseInt(Global.b.readLine());
		Grafo g=new Grafo(numv);
		System.out.println("Ingrese lados: ");
		g.read();
		System.out.println("\n");
		
		System.out.println("COLOREO DE GRAFOS \n");
		for (int i = 0; i< numv; i++){
			System.out.print("Color para el vertice "+i+": "+g.AproxColor()[i]+"\n");
		}
	}
}