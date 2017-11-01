
public class Pregunta3 {
	
	public static void main (String args[]) {
	
	double upper;
	double fahr = 0.0; 
	double celsius;
	
	Console c= new Console();
	upper=c.readDouble();
	
	while (fahr <= upper){
	fahr += 20.0;
	celsius = (5.0 / 9.0) * (fahr-32.0);
	c.println(fahr + " " + celsius);
	}
	}
}
