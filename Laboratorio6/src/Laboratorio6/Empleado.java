package Laboratorio6;

public abstract class Empleado {

	private final String primerNombre;
	private final String apellidoPaterno;
	private final String numeroSeguroSocial;
	private final Fecha fechaNacimiento;
	
	public Empleado(final String primerNombre, final String apellidoPaterno, final String numeroSeguroSocial, Fecha fechaNacimiento)
	{
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.fechaNacimiento = fechaNacimiento;
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
	
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public abstract double ingresos();
	
	@Override
	public String toString()
	{
		return String.format("Nombre: " + getPrimerNombre() + "\n"+ "Apellido: " + getApellidoPaterno() + "\n"+ 
							"Numero del seguro social: " + getNumeroSeguroSocial() +"\n"+"Fecha de Nacimiento"+ getFechaNacimiento());
	}
	
}
