import java.util.*;

public class rutaCorta 
{
	Stack W;
	Stack V;
	Grafo E = new Grafo(7);
	
	ListaLados curr;
	Integer o;
	int u = 0;
	
	while (!W.containsAll(V))
	{
		while (!W.empty())
		{
			o = (Integer) W.peek();
			u = o.intValue();
			
			W.pop();
			while (curr!= null)
			{
				curr = E.adjlist[i];
				curr = curr.next;
			}
		}
	}
}
