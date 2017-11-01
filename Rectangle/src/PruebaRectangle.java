import java.io.*;

public class PruebaRectangle {

	static Rectangle r = new Rectangle();
	static Rectangle r1 = new Rectangle(20,30);
	static Rectangle r2 = new Rectangle(40,50,"black");
	
	public static void main(String[] args) throws IOException {
		String temp,c;
		int w,h;
		
		BufferedReader b = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("Valores del Rectangulo 0");
		System.out.println("Ancho : "+ r.getWidth());
		System.out.println("Alto : "+ r.getHeight());
		System.out.println("Color : "+ r.getColor());
		
		System.out.println("Valores del Rectangulo 1");
		System.out.println("Ancho : "+ r1.getWidth());
		System.out.println("Alto : "+ r1.getHeight());
		System.out.println("Color : "+ r1.getColor());
		
		System.out.println("Valores del Rectangulo 2");
		System.out.println("Ancho : "+ r1.getWidth());
		System.out.println("Alto : "+ r1.getHeight());
		System.out.println("Color : "+ r1.getColor());
		
		System.out.println("Ingresar nuevo ancho (Rectangulo 0");
		temp = b.readLine();
		w = Integer.parseInt(temp);
		r.setWidth(w);
		
		System.out.println("Ingresar nuevo alto (Rectangulo 0");
		temp = b.readLine();
		h = Integer.parseInt(temp);
		r.setHeight(h);
		
		System.out.println("Ingresar nuevo color");
		c = b.readLine();
		r.setColor(c);
		
		System.out.println("Nuevo ancho de Rectangulo 0 es "+ r.getWidth());
		System.out.println("Nuevo alto de Rectangulo 0 es "+ r.getHeight());
		System.out.println("Nuevo color de Rectangulo 0 es "+ r.getColor());
	}
}
