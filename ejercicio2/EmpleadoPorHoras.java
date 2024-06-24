package ejercicio2;

public class EmpleadoPorHoras extends Empleado{
	private Double horasTrabajadas;
	private Double sueldoHora;
	

	public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Double horasTrabajadas, Double sueldoHora) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		
		if(horasTrabajadas >=0 || horasTrabajadas <=168)
		{
			this.horasTrabajadas = horasTrabajadas;
		}
		
		if(sueldoHora > 0)
		{
			this.sueldoHora = sueldoHora;
		}
	}
	
	public Double getHorasTrabajadas()
	{
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(Double horasTrabajadas)
	{
		if(horasTrabajadas >=0 || horasTrabajadas <=168)
		{
			this.horasTrabajadas = horasTrabajadas;
		}
	}
	
	public Double getSueldoHora()
	{
		return sueldoHora;
	}
	
	public void setSueldoHora(Double sueldoHora)
	{
		if(sueldoHora > 0)
		{
			this.sueldoHora = sueldoHora;
		}
	}
	
	public Double calcularIngresos()
	{
		return horasTrabajadas * sueldoHora;
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + "\n" + "Horas Trabajadas: " + getHorasTrabajadas() + "\n" + "Tarifa por horas: " + getSueldoHora() + "\n" + "Ingresos: " + calcularIngresos());
	}

}
