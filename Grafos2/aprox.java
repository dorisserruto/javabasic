static int EncontrarColorLibre (Grafo g, int color[], int v)
{
	int w, N;
	boolean usado[];
	N =g.getNumVertices();
	usado = new Boolean[N];
	for (w = 0; w < N; w++){
		if (g.eslado(v.w) && color[w]!= -1)
			usuado[color[w]] = true;
	}
	w = 0;
	while (usado [w]) w++;
	return w;
}

static int[] AproxColor (Grafo g)
{
	int N = g.gerNumVertices();
	int v, i, nuevo_color;
	int color[], grado[]; sindice[];
	color = new int[N];
	grado = new int[N];
	sindice = new int[N];
	for (v = 0; v<N; v++){
		color[v] = -1;
		grado[v] = g.grado[v];
	}
	Sort.insertion_sort (grado,sindice);
	color[sindice[0]]=0;
	for (i = 1; i< N; i++){
		v = sindice[i];
		nuevo_color = EncontrarColorLibre (g, color, v);
		color[v] = nuevo_color;
	}
	return color;
}