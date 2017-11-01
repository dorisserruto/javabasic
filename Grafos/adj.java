import java.io.*;
public class adj {
	protected int numvertices;
	protected boolean adjm[][];
	protected boolean directed;
	
	public adj()
	{
	}

	public adj(int n)
	{
		adjm=new boolean[n][n];
		directed=false;
		numvertices = n;
	}

	public adj(int n, boolean isdirected)
	{
		adjm=new boolean[n][n];
		directed=isdirected;
		numvertices = n;
	}

	public void addEdge(int i, int j){
		if (directed){
			adjm[i][j]=true;
		}
		else{
			adjm[i][j]=true;
			adjm[j][i]=true;
		}
	}
	public void imprimir(boolean[][] matriz){
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz[i].length;j++){
				//Global.c.print(matriz[i][j]+" ");
				System.out.print(matriz[i][j]+" ");
			}
			//Global.c.println("");
			System.out.println("");
		}
	}
	
	public void read() throws IOException{
	String line, first, second; 
	int x, y, split;   
	    
	while (true) {
	    // get next line of input -- containts two ints split by a " "
		line = Global.b.readLine();
		if (line.equals("")){
			imprimir(adjm);
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
	    addEdge(x,y);}
	}}
	
	public void mostrar_lados (int v)
	{
		int vecinos[];
		vecinos = new int [numvertices];
		
		for (int i = 0; i < adjm.length; i++)
		{
			int c = 0;
			if (adjm[v][i] == true)
				//vecinos [c] = i;
				System.out.println(i);
		}
	}
}

