import java.io.*;

public class Pregunta1 {
	
	static double pago(double montoH, double horas){
		return (montoH * horas);
	}
	
	public static void main(String[] args) throws IOException {
		double monto, horas, pago;
		String temp;
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Ingrese monto de pago por hora :");
		temp = buffer.readLine();
		monto = Double.parseDouble(temp);
		
		System.out.println("Ingrese horas trabajadas :");
		temp = buffer.readLine();
		horas = Double.parseDouble(temp);
		
		pago = pago(monto, horas);
		
		System.out.println("El monto total a pagar es :"+ pago);
	}

}
