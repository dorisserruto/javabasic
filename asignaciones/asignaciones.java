
public class asignaciones {

	// Asignaciones
	public static void main(String[] args) {
		int u, v, w;
		boolean d, e = false;
		float a, b;
		u = 1;
		v = 10;
		w = 100;
		u ++;
		v = 3 * w + u;
		v-= w;
		System.out.println("u ="+u+"; v ="+v+"; w ="+w);
		u = Math.max(v, w);
		a = (float) u;
		b = (float) Math.sqrt(a);
		System.out.println("u="+u+"; a="+a+";b ="+b);
	}

}
