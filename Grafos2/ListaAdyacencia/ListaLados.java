public class ListaLados {
	//programas ListaLados y Grafo
	//desarrollados por S. Hazelhurst, 2003
	int x, y;
    ListaLados next;
	
    public ListaLados () {
	// default constructor
    }
	

    public ListaLados(int u, int v) {
	// Constructor that makes an edge list of exactly one edge
	x = u;
	y = v;
	next = null;
    }
}
