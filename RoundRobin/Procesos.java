
public class Procesos {

	protected ListaEnlaz tareas;
	
	public Procesos(int num)
	{}

	public void agregarNodo(int nro, int time)
	{
		//Crear nuevo nodo
		ListaEnlaz nuevo = new ListaEnlaz(nro,time);
		ListaEnlaz actual;
	
		actual = tareas;
		
		while (actual!=null)
		{
			actual = actual.sgte;
		}
		actual = nuevo;
		
		*
		if (pointer == 0)
		{
			tareas[pointer] = nuevo;
			pointer ++;
		}
		else
		{
			tareas[pointer-1].sgte = nuevo;
			pointer++;	
		}*/
	}
}
