import java.io.*;
public class adj {
	protected int numvertices;
	protected int adjm[][];
	protected boolean directed;
	public adj()
	{
	}

	public adj(int n)
	{
		adjm=new int[n][n];
		directed=false;
	}

	public adj(int n, boolean isdirected)
	{
		adjm=new int[n][n];
		directed=isdirected;
	}

	public void addEdge(int i, int j,int cont){
		if (directed){
			adjm[i][j]=cont;
		}
		else{
			adjm[i][j]=cont;
			//adjm[j][i]=true;
		}
	}

	/*public int getGrado (int v)
	{
		int cont=0;
		int i=0;
		while (i< adjm[v].length)
		{
			if(adjm[v][i]==true)
			{
			cont++;
			}
			i++;
		}

		return cont;
	}

	public int verticeMaxGrado ()
	{
		int max=0;
		int i=0;
		while(i<adjm.length)
		{
			if(getGrado(i)>max)
			{
				max=i;
			}
			i++;
		}

		return max;	
	}

	//COLOREO DE GRAFO

	public boolean eslado(int v, int w)
	{
		if(adjm[v][w])
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int EncontrarColorLibre (int color[], int v)
	{
		int w, N;
		boolean usado[];
		N =adjm.length;
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

		N = adjm.length;

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


	 */
	public void imprimir(int[][] matriz){
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
				//imprimir(adjm);
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
				//addEdge(x,y);}
			}}
	}
}
