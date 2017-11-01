import java.io.*;
public class LeeArchivo{
	public static void main(String argv[]) throws IOException, FileNotFoundException{
		String ruta;
		String cad;
		ruta=argv[0];
		int i=0;
		BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream(ruta)));
		System.out.println(argv);
		while ((cad=in.readLine())!=null){
			System.out.println(cad);
		}
		PrintWriter out=new PrintWriter(new FileOutputStream(ruta),true);
		cad="hola";
		while(i<4){
			out.println(cad);
			i++;
		}
	}
}