import java.io.*;

public class Arrays {

	public static void main(String[] args) throws IOException {
		
		int atencion[],n,i;
		double promedio = 0;
		int dias = 0;
		int sum = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String temp="";
		
		System.out.println("Ingrese tamaño :");
		temp = reader.readLine();
		n = Integer.parseInt(temp);
		atencion = new int[n];
		
		// Llenar atenciones y sumarlas
		for (i = 0; i<atencion.length;i++){
			System.out.println("Ingrese cantidad de atenciones :");
			temp = reader.readLine();
			atencion[i] = Integer.parseInt(temp);
			sum = sum + atencion[i];
		}
		
		// Promedio habitual
		promedio = sum/ (atencion.length);
		
		// Dias que superan lo habitual
		for (i = 0; i<atencion.length;i++){
			if ((atencion[i]) > (promedio +(promedio * 0.2)))
				dias ++;
		}
		System.out.println(" Promedio de atenciones :" + promedio);
		System.out.println(" Dias que excedieron 20 % :" + dias);
	}
}
