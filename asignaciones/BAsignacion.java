
public class BAsignacion {

	public static void main(String[] args) {
		int u,v,w;
		boolean d, e = false;
		u = 1;
		v = 10;
		w = 100;
		d = (u < v);
		System.out.println("d ="+d+" e="+e);
		d = d && (w < u);
		System.out.println("d ="+d+" e= "+e);
		d = (w>u) && (d || u < v);
		System.out.println("d ="+d+" e="+e);
	}
}
