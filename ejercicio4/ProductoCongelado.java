package ejercicio4;

import java.sql.Date;

public class ProductoCongelado extends ProductoFresco {
	private Double temperaturaRecomendada;

	public ProductoCongelado(Date fechaCaducidad, String numeroLote, Date fechaEnvasado, String paisOrigen, Double temperaturaRecomendada) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
		
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	public Double getTemperaturaRecomendada()
	{
		return temperaturaRecomendada;
	}

}
