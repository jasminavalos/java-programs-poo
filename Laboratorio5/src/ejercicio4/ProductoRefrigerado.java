package ejercicio4;

import java.sql.Date;

public class ProductoRefrigerado extends ProductoFresco{
	private String codigoSupervision;
	private Double temperaturaAdecuada;

	public ProductoRefrigerado(Date fechaCaducidad, String numeroLote, Date fechaEnvasado, String paisOrigen, String codigoSupervision, Double temperaturaAdecuada) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
		
		this.codigoSupervision = codigoSupervision;
		this.temperaturaAdecuada = temperaturaAdecuada;
	}
	
	public String getCodigoSupervision()
	{
		return codigoSupervision;
	}
	
	public Double getTemperaturaRecomendada()
	{
		return temperaturaAdecuada;
	}

}
