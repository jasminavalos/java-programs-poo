package ejercicio4;

import java.sql.Date;

public class ProductoFresco extends Producto{
	private Date fechaEnvasado;
	private String paisOrigen;

	public ProductoFresco(Date fechaCaducidad, String numeroLote, Date fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	public Date getFechaEnvasado()
	{
		return fechaEnvasado;
	}
	
	public String getPaisOrigen() 
	{
		return paisOrigen;
	}
}
