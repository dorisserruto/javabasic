public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numv;
		Global.c.println("Ingrese dimensiones del grafo ");
		numv=Global.c.readInt();
		Grafo g=new Grafo(numv);
		g.read();
		}
	}

