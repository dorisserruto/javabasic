import java.io.*;
import java.lang.*;

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
    	System.out.println("El grafico tiene "+numvertices+" vertices");
    	System.out.println("El grafico es " + (dirigido ? "dirigido" : "no dirigido"));
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
    
	// Coloreo de Grafos
	
	public boolean eslado(int v1, int v2)
	{
		boolean respuesta = false;
		ListaLados curr;
		curr=adjlist[v1];
		while (curr!= null)
		{
			if ( v2 == curr.y){
				respuesta = true;
				break;}
			curr=curr.next;
		}
		return respuesta;
	}
	/*
	public void mostrar_vecinos(int v)
	{
			for (int j = 0; j< adjm[v].length; j++){
				if (adjm[v][j]==true) {
					System.out.print(j+" - ");
				}
			}
	}*/
	
	public int getGrado (int v)
	{
		ListaLados curr;
		int contador = 0;
		if (adjlist[v] != null){
			curr=adjlist[v];
			while (curr != null){
				contador++;
				curr=curr.next;
			}
		}
		return contador;
	}
	/*
	public int getGradoMaximoVertice()
	{
		int maximo = 0;
		for (int i=0; i < adjm.length; i++){
			if (getGrado(i) > getGrado(maximo)) {
				maximo = i; 
			}
		}
		return maximo;
	}*/
	
	public int EncontrarColorLibre (int color[], int v)
	{
		int w, N;
		boolean usado[];
		N =adjlist.length;
		usado = new boolean[N];
		for (w = 0; w < N; w++){
			if (eslado(v,w) && color[w]!= -1)
				usado[color[w]] = true;
		}
		w = 0;
		while (usado [w]) w++;
		return w;
	}
	
	public void insertion(int grados[], int sindice[])
	{
	    int sig;
	    int actual, i;
	    sindice[0] = 0;

	    for (sig = 1; sig < grados.length;sig ++){
	    	actual = grados[sig];
	    	i = sig;
	    	while ((i > 0) && (grados[sindice[i-1]]< actual))
	    	{
	    		sindice[i] = sindice[i-1];
	    		i--;
	    	}
	    	sindice[i] = sig;
	    }
	}
	
	public int[] AproxColor ()
	{
		int N;
		int v, i, nuevo_color;
		int color[];
		int grado[]; 
		int sindice[];
		
		N = adjlist.length;
		
		color = new int[N];
		grado = new int[N];
		sindice = new int[N];
		
		for (v = 0; v<N; v++){
			color[v] = -1;
			grado[v] = getGrado(v);
		}
		
		insertion(grado,sindice);
		
		color[sindice[0]]=0;
		
		for (i = 1; i< N; i++){
			v = sindice[i];
			nuevo_color = EncontrarColorLibre (color, v);
			color[v] = nuevo_color;
		}
		return color;
	}
    
    // Modificado con fuente txt.
    public void read() throws IOException{
    	String line, first, second;
    	//String source ="D:\Trees\grafo.txt";
    	String source="C:\trees.txt";
    	int x, y, split;   
    	
    	BufferedReader b =new BufferedReader(new InputStreamReader(new FileInputStream(source)));
    	
    	while ((line = b.readLine())!=null) 
    	{
    		//line = b.readLine();
    		if (line.equals(""))
    		{
    			break;  
    		}
    		else
    		{
	    	    split = line.indexOf(",");
	    	    
	    	    first = line.substring(0,split);
	    	    second= line.substring(split+1);
	    	    x = Integer.parseInt(first);
	    	    y = Integer.parseInt(second);
	    	    agregarLado(x,y);
    	    }
    	}
    }
}
