package claselab;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	private double salarioBase;
	
	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
			Double tarifaComision, Double ventasBrutas, double salarioBase) 
	{
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, tarifaComision, ventasBrutas);

		if(salarioBase > 0)
		{
			salarioBase = salarioBase;
		}
		this.salarioBase = salarioBase;
	}
	
	public Double getSalarioBase()
	{
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase)
	{
		if(salarioBase > 0)
		{
			salarioBase = salarioBase;
		}
		this.salarioBase = salarioBase;
	}
	
	@Override
	public Double salario()
	{
		return salarioBase + super.salario();
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + "\n" +  getSalarioBase());
	}
}
