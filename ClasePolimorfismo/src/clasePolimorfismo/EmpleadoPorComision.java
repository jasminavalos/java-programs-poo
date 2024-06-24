package clasePolimorfismo;

public abstract class EmpleadoPorComision extends Empleado{
	private Double tarifaComision;
	private Double ventasBrutas;
	
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
			Double tarifaComision, Double ventasBrutas) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		
		if(tarifaComision > 0)
		{
			this.tarifaComision = tarifaComision;
		}
		
		if(ventasBrutas > 0)
		{
			this.ventasBrutas = ventasBrutas;
		}
	}
	
	public Double getTarifaComision()
	{
		return tarifaComision;
	}
	
	public void setTarifaComision(Double tarifaComision)
	{
		if(tarifaComision > 0)
		{
			this.tarifaComision = tarifaComision;
		}
	}
	
	public Double getVentasBrutas()
	{
		return ventasBrutas;
	}
	
	public void setVentasBrutas(Double ventasBrutas)
	{
		if(ventasBrutas > 0)
		{
			this.ventasBrutas = ventasBrutas;
		}
	}
	
	public Double salario()
	{
		return tarifaComision * ventasBrutas;
	}
	
    @Override
    public String toString() {
        return String.format("%s\nVentas Brutas: %.2f\nTarifa Comisión: %.2f\nSalario: %.2f", super.toString(), ventasBrutas, tarifaComision, salario());
    }
}
