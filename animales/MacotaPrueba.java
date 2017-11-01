
public class MacotaPrueba {

	public static void main(String[] args) {
		Mascota a,b;
		Pinguino p;
		a = new Mascota ("Fred ", "Jirafa",1992);
		p = new Pinguino ("Freda", "King",1997);
		b = p;
		//p = a; //No se puede convertir de mascota a pinguino
		a.come();
		p.come();
		System.out.println(p.ID());
		p.fecnac();
		b.fecnac();
	}

}
