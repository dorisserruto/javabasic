import java.io.*;

public class libre {

	static boolean esAnioBisiesto(int anio)
	{
		boolean r = false;
		if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0))
			r = true;
		else
			r = false;
		
		return r;
	}
	
	static void aniosBisiestos(int limA, int limB)
	{
		if (limA < limB)
		{
			for (int i = limA; i <= limB; i++){
				if (esAnioBisiesto(i))
					System.out.println(i);}
		}
		else
		{
			for (int j = limA; j >= limB; j--){
				if (esAnioBisiesto(j))
					System.out.println(j);}
		}
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		int x, y;
		
		System.out.println("Ingresar primer limite:");
		temp = b.readLine();
		x = Integer.parseInt(temp);
		System.out.println("Ingresar segundo limite:");
		temp = b.readLine();
		y = Integer.parseInt(temp);
		System.out.println("Los anios bisiestos entre" + x + " y" + y +" son :");
		aniosBisiestos(x,y);
	}
}
