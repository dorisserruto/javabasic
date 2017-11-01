import java.io.*;
import java.util.Stack;

public class arboles {
	
	int numV = 7;
	Grafo origen = new Grafo(numV);
	static Stack lista;
	
	public void BreadthFirst(int raiz)
	{
		int[] padre = new int[numV];
		boolean[] marcado = new boolean[numV];
	
		Integer elemento;
		ListaLados curr;
		int w, x;
		
		for (int i = 0; i< numV; i++)
		{
			padre[i] = 0;
			marcado[i] = false;
		}
		
		elemento = new Integer(raiz);
		lista.push(elemento);
		
		while (!lista.empty())
		{
			elemento = (Integer) lista.peek();
			w = elemento.intValue();
			lista.pop();
		
			curr = origen.adjlist[w];
			
			while (curr!= null)
			{
				x = curr.y;
				marcado[x] = true;
				padre[x] = w;
				
				elemento = new Integer(x);
				lista.add(elemento);
			}
		}
		
		// Imprimir los resultados
		System.out.println("Arbol Resultante - Lados :");
		for (int j = 0; j< numV; j++)
		{
			System.out.println("Lado ("+padre[i]+","+i+");");
		}
	}
	
	public void BreadthFirstDosVertices(int raiz, int meta)
	{
		int[] padre = new int[numV];
		boolean[] marcado = new boolean[numV];
		
		Integer elemento;
		ListaLados curr;
		
		int w, x;
		boolean flag = true;
		
		for (int i = 0; i< numV; i++)
		{
			padre[i] = 0;
			marcado[i] = false;
		}
		
		elemento = new Integer(raiz);
		lista.push(elemento);
		
		while ((!lista.empty()) && (flag == true))
		{
			elemento = (Integer) lista.peek();
			w = elemento.intValue();
			lista.pop();
		
			curr = origen.adjlist[w];
			
			while (curr!= null)
			{
				x = curr.y;
				marcado[x] = true;
				padre[x] = w;
				
				if (x == meta)
				{
					flag = false;
					break;
				}
				else
				{
					elemento = new Integer(x);
					lista.push(elemento);
				}
			}
		}
		
		// Imprimir los resultados
		System.out.println("Arbol Resultante - Lados :");
		for (int j = 0; (j< numV) && (padre[j] != 0); j++)
		{
			System.out.println("Lado ("+padre[j]+","+j+");");
		}
	}
	
	static void main() throws IOException, FileNotFoundException
	{
		Grafo.read();
		String temp;
		int raiz = 0;
		int meta = 0;
		
		BufferedReader b = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Ingrese vertice raiz :");
		temp = b.readLine()
		raiz = temp.parseInt();
		
		BreadthFirst(raiz);
		
		System.out.println("Ingrese vertice raiz :");
		temp = b.readLine()
		raiz = temp.parseInt();
		System.out.println("Ingrese vertice meta :");
		temp = b.readLine()
		meta = temp.parseInt();
		
		BreadthFirstDosVertices(raiz, meta);
	}
}
