
public class colaterales {

	static int i,j, x = 3;
	static int funcionA (int x){
		int i, m;
		i = x -5;
		m = 2 * x + 3 *i;
		j = 7;
		return m - 1;
	}
	static int funcionB (int x){
		int m;
		i = x - 5;
		m = 2 * x + 3* i;
		int i;
		i = x - 10;
		j = i - 7;
		return m - i;
	}
	static int k;
	
	public static void main (String argv []){
		int i, n;
		int l;
		i = 3 ; j = 5;
		k = funcionA(5);
		l = funcionB(8);
		System.out.println("Valores i: "+i+"; j:"+j+"; k:"+k+"; l:"+l);
	}
}
