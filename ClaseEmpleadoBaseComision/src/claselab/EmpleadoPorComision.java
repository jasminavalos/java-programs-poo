package claselab;

public class EmpleadoPorComision {

	private final String primerNombre;
	private final String apellidoPaterno;
	private final String numeroSeguroSocial;
	private Double tarifaComision;
	private Double ventasBrutas;
	
	public EmpleadoPorComision(final String primerNombre, final String apellidoPaterno, final String numeroSeguroSocial, Double tarifaComision, Double ventasBrutas)
	{
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroSeguroSocial = numeroSeguroSocial;
		if(tarifaComision > 0)
		{
			tarifaComision = tarifaComision;
		}
		this.tarifaComision = tarifaComision;
		
		if(ventasBrutas > 0)
		{
			ventasBrutas = ventasBrutas;
		}
		this.ventasBrutas = ventasBrutas;		
	}
	
	public String getPrimerNombre()
	{
		return primerNombre;
	}
	
	public String getApellidoPaterno()
	{
		return apellidoPaterno;
	}
	
	public String getNumeroSeguroSocial()
	{
		return numeroSeguroSocial;
	}
	
	public Double getTarifaComision()
	{
		return tarifaComision;
	}
	
	public void setTarifaComision(Double tarifaComision)
	{
		if(tarifaComision > 0)
		{
			tarifaComision = tarifaComision;
		}
		this.tarifaComision = tarifaComision;
	}
	
	public Double getVentasBrutas()
	{
		return ventasBrutas;
	}
	
	public void setVentasBrutas(Double ventasBrutas)
	{
		if(ventasBrutas > 0)
		{
			ventasBrutas = ventasBrutas;
		}
		this.ventasBrutas = ventasBrutas;
	}
	
	public Double salario()
	{
		return ventasBrutas * tarifaComision;
	}
	
	public String toString()
	{
		return String.format("Nombre: " + getPrimerNombre() + "\n"+ "Apellido: " + getApellidoPaterno() + "\n"+ "Numero del seguro social: " + getNumeroSeguroSocial() + "\n" +
								"Tarifa por comision: " + getTarifaComision() + "\n" + "Ventas Brutas: " + getVentasBrutas() + "\n" + "Salario del empleado: " + salario());
	}
	
	
	
	
}
