import java.io.*;
public class Grafo {
	protected int numvertices;
    protected int numlados;
    protected boolean dirigido;
    protected ListaLados adjlist [];
    public Grafo() {};
	
    public Grafo(int n) {
    	numvertices = n;
    	dirigido=false;
    	adjlist = new ListaLados [n];
    }
	
    public Grafo(int n, boolean esdirigido) {
    	numvertices = n;
    	dirigido=esdirigido;
    	adjlist = new  ListaLados [n];
    }
    public void agregarLado(int x, int y) {
    	
    	ListaLados curr = new ListaLados(x,y);
    	curr.next = adjlist[x];
    	adjlist[x] = curr;
    	if (!dirigido) 
    	    {
    		curr = new ListaLados(y, x);
    		curr.next = adjlist[y];
    		adjlist[y]=curr;
    	    }
    }
    public void imprimir(){
    	System.out.println("El gráfico tiene "+numvertices+" vertices");
    	System.out.println("El gráfico es " + (dirigido ? "dirigido" : "no dirigido"));
    	for (int i=0; i<numvertices; i++) {mostrar_lados(i); }
    }
    
    public void mostrar_lados(int x) {
    	ListaLados curr;
    	curr=adjlist[x];
    	while (curr!=null)
    	{
    		System.out.println("("+curr.x+","+curr.y+")");
    		curr=curr.next;
    	}
    }
    
    public void read() throws IOException{
    	String line, first, second; 
    	int x, y, split;   
    	    
    	while (true) {
    	    // get next line of input -- containts two ints split by a " "
    		line = Global.b.readLine();
    		if (line.equals("")){
    			imprimir();
    			break;  
    		}
    		else{
    	    // find where the split is
    	    split = line.indexOf(",");
    	    // extract out the numbers and convert to integer
    	    first = line.substring(0,split);
    	    second= line.substring(split+1);
    	    x = Integer.parseInt(first);
    	    y = Integer.parseInt(second);
    	    agregarLado(x,y);}
    	}}
}
