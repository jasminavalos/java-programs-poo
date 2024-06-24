package clasestatic;

public class Empleado {

	String primerNombre;
	String apellidoPaterno;
	double salarioMensual;
	
	public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual)
	{
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		
		if(salarioMensual < 0.0)
		{
			salarioMensual = 0.0;
		}
		this.salarioMensual = salarioMensual;
	}
	
	public void setPrimerNombre(String primerNombre)
	{
		this.primerNombre = primerNombre;
	}
	
	public String getPrimerNombre()
	{
		return primerNombre;
	}
	
	public void setApellidoPaterno(String apellidoPaterno)
	{
		this.apellidoPaterno = apellidoPaterno;
	}
	
	public String getApellidoPaterno()
	{
		return apellidoPaterno;		
	}
	
	public void setSalarioMensual(double salarioMensual)
	{
		this.salarioMensual = salarioMensual;
	}
	
	public double getSalarioMensual()
	{
		return salarioMensual;
		
	}
	
}
