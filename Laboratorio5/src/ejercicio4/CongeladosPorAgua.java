package ejercicio4;

import java.sql.Date;

public class CongeladosPorAgua extends ProductoCongelado {
	private Double salinidadAgua;
	
	public CongeladosPorAgua(Date fechaCaducidad, String numeroLote, Date fechaEnvasado, String paisOrigen,
			Double temperaturaRecomendada, Double salinidadAgua) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
		
		this.salinidadAgua = salinidadAgua;
	}
	
	public Double getSalinidadAgua()
	{
		return salinidadAgua;
	}

}
