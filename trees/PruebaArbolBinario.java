public class PruebaArbolBinario{
	public static void main(String argv[]){
		ArbolBinario arbol=new ArbolBinario();
		arbol.inserta("G");
		arbol.inserta("M");
		arbol.inserta("T");
		arbol.inserta("A");
		arbol.inserta("J");
		arbol.inserta("P");
		arbol.inserta("D");
		arbol.postorder();
	}
}