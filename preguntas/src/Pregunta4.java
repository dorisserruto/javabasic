
public class Pregunta4 {
/*
	static void lanzardados(){
		//Math.random() genera un número aleatorio, es decir
		//al azar, comprendido entre el valor de 0 y 1
		//(double)
		//para que simule el lanzamiento de un dado este
		//valor
		//lo multiplicaría por 6 (valor superior) y se le
		//añadiría 1. Se debe de realizar un cast a fin de
		//que devuelva un dato entero y sin decimales
		int d1, d2;
		while (true){
		d1=(int)(Math.random()*6+1);
		d2=(int)(Math.random()*6+1);
		System.out.println("dado 1 "+d1);
		System.out.println("dado 2 "+d2);
		if ((d1==1) && (d2==1)){
		break;
		}
		}
		System.out.println("ganador");
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		lanzardados();
		}
*/
	
		static void lanzardados(){
		//Math.random() genera un número aleatorio, es decir
		//al azar, comprendido entre el valor de 0 y 1
		//(double)
		//para que simule el lanzamiento de un dado este
		//valor
		//lo multiplicaría por 6 (valor superior) y se le
		//añadiría 1. Se debe de realizar un cast a fin de
		//que devuelva un dato entero y sin decimales
		
		int d1 = 0, d2 = 0;
		while (true){
		if ((d1==1) && (d2==1)){
		break;
		}
		else
		{
			d1=(int)(Math.random()*6+1);
			d2=(int)(Math.random()*6+1);
			System.out.println("dado 1 : "+d1);
			System.out.println("dado 2 : "+d2);	
		}
		}
		System.out.println("ganador");
		}
		
		public static void main(String[] args) {
		lanzardados();
		}
}
	
