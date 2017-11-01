
public class Mascota {
	String nombre;
	String ident;
	int fecha_nac;
	
	public Mascota() {}
	public Mascota (String n, String id, int fecha)
	{
		nombre = n;
		ident = id;
		fecha_nac = fecha;
	}
	
	void come ()
	{
		System.out.println (nombre+" dieta no conocida");
	}
	void fecnac()
	{
		System.out.println("**MASCOTA** "+nombre+ " nacido en "+fecha_nac);
	}
	String ID()
	{
		return (nombre + ": ("+ident+")");
	}
}
