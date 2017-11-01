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
	}

	public adj(int n, boolean isdirected)
	{
		adjm=new boolean[n][n];
		directed=isdirected;
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
				Global.c.print(matriz[i][j]+" ");
			}
			Global.c.println("");
		}
	}
	
	public void read(){
	String line, first, second; 
	int x, y, split;   
	    
	while (true) {
	    // get next line of input -- containts two ints split by a " "
		line = Global.c.readLine();
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
}

