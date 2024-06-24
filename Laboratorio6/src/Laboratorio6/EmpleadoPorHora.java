package Laboratorio6;

public class EmpleadoPorHora extends Empleado{
	private double horasTrabajadas;
	private double sueldoHora;
	
	public EmpleadoPorHora(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double horasTrabajadas, double sueldoHora, Fecha fechaNacimiento) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
		
		if(horasTrabajadas >=0.0 && horasTrabajadas <= 168.0) {
			this.horasTrabajadas = horasTrabajadas;
		}
		else {
			this.horasTrabajadas = 0.0;
		}
		
		if(sueldoHora >= 0) {
			this.sueldoHora = sueldoHora;
		}
	}
	
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(double horasTrabajadas) {
		if(horasTrabajadas >=0.0 && horasTrabajadas <= 168.0) {
			this.horasTrabajadas = horasTrabajadas;
		}
		else {
			this.horasTrabajadas = 0.0;
		}
	}
	
	public double getSueldoHora()
	{
		return sueldoHora;
	}
	
	public void setSueldoHora(double sueldoHora) {
		if(sueldoHora >= 0) {
			this.sueldoHora = sueldoHora;
		}
	}
	
	public double ingresos() {
		if(horasTrabajadas <= 40) {
		return horasTrabajadas * sueldoHora;
		}
		else {
			return (sueldoHora + horasTrabajadas - 40)* sueldoHora * 1.5;
		}
	}
	
	public String toString() {
		return String.format(super.toString() + "\n" + "Horas Trabajadas: " + getHorasTrabajadas() + "\n" + 
								"Sueldo por hora: " + getSueldoHora() + "\n");
		}
}