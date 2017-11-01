public class ArbolBinario{
	private NodoArbol raiz;
	private int size=0;
	public ArbolBinario(){
	}
	public boolean inserta(Object o){
		if (raiz==null)
			raiz=new NodoArbol(o);
		else{
			NodoArbol padre=null;
			NodoArbol actual=raiz;
			while (actual!=null){
				if (((Comparable)o).compareTo(actual.elemento) < 0){
					padre=actual;
					actual=actual.izq;
				}
				else if(((Comparable)o).compareTo(actual.elemento)>0){
					padre=actual;
					actual=actual.der;
				}
				else return false;
			}
			if (((Comparable) o).compareTo(padre.elemento)<0)
				padre.izq=new NodoArbol(o);
			else
				padre.der=new NodoArbol(o);
			size++;
		}
		return true;
	}
	public void postorder(){
		postorder(raiz);
	}
	private void postorder(NodoArbol raiz){
		if (raiz==null) return;
		postorder(raiz.izq);
		postorder(raiz.der);
		System.out.println(raiz.elemento+" ");
	}
	
	
}