import java.io.*;

public class Pregunta2 {
	
	public static void main(String[] args) throws IOException{
	
	double r = -1; 
	double total = 0;
	String temp = "";
	
	BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
	
	while (r != 0){
		System.out.println("Ingrese resistencia del resistor/ 0 para calcular resultado :");
		temp = buffer.readLine();
		r = Double.parseDouble(temp);
		
		if (r == 0){
			break;
		}
		else
		{
			total = total + r;
		}
	}
	System.out.println("La resistencia total es :" + total);
	}
}
