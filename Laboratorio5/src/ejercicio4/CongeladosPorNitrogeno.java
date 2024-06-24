package ejercicio4;

import java.sql.Date;

public class CongeladosPorNitrogeno extends ProductoCongelado {
	private String metodoCongelacion;
	private Double tiempoExposicion;

	public CongeladosPorNitrogeno(Date fechaCaducidad, String numeroLote, Date fechaEnvasado, String paisOrigen,
			Double temperaturaRecomendada, String metodoCongelacion, Double tiempoExposicion) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
		
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicion = tiempoExposicion;
	}
	
	public String getMetodoCongelacion()
	{
		return metodoCongelacion;
	}
	
	public Double getTiempoExposicion()
	{
		return tiempoExposicion;
	}

}
