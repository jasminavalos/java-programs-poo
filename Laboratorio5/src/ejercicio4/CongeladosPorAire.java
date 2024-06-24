package ejercicio4;

import java.sql.Date;

public class CongeladosPorAire extends ProductoCongelado {
	private Double porcentajeNitrogeno;
	private Double porcentajeOxigeno;
	private Double porcentajeDioxidoCarbono;
	private Double porcentajeVaporAgua;
	
	public CongeladosPorAire(Date fechaCaducidad, String numeroLote, Date fechaEnvasado, String paisOrigen,
			Double temperaturaRecomendada, Double porcentajeNitrogeno, Double porcentajeOxigeno, Double porcentajeDioxidoCarbono, Double porcentajeVaporAgua) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
		
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeOxigeno = porcentajeOxigeno;
		this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}
	
	public Double getPorcentajeNitrogeno() 
	{
		return porcentajeNitrogeno;	
	}
	
	public Double getPorcentajeOxigeno() 
	{
		return porcentajeOxigeno;	
	}
	
	public Double getPorcentajeDioxidoCarbono() 
	{
		return porcentajeDioxidoCarbono;	
	}
	
	public Double getPorcentajeVaporAgua() 
	{
		return porcentajeVaporAgua;	
	}
}
