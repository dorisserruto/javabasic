
public class Pinguino extends Mascota{
	String tipo;
	public Pinguino( String n, String t, int fecha)
	{
		super (n, "Pinguino", fecha);
		tipo = t;
	}
	void come()
	{
		System.out.println(nombre + " come pescado");
	}
	String tipo_de_pinguino ()
	{
		return tipo;
	}
	void fecnac()
	{
		//System.out.println(tipo+ " pinguino "+nombre+ "nacido en "+fecha_nac);
		super.fecnac();
	}
}
