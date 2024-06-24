package ejercicio4;
import java.sql.Date;

public class Producto {
	private final Date fechaCaducidad;
	private final String numeroLote;
	
	public Producto(Date fechaCaducidad, String numeroLote)
	{
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}
	
	public Date getFechaCaducidad()
	{
		return fechaCaducidad;
	}
	
	public String getNumeroLote()
	{
		return numeroLote;
	}
}
