package laboratorio4;

import javax.swing.JOptionPane;

public class Trabajador {

	int horasTrabajadas = 0;
	double sueldoHora = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador trabajador1 = new Trabajador(12, 550);
		JOptionPane.showMessageDialog(null, "El salario base del trabajador es: " + trabajador1.salarioBase() + "\n" + 
										"Los impuestos aplicados son: " + trabajador1.impuestoAplicado() + "\n" + 
										"El salario neto es: " + trabajador1.salarioNeto());
	}
	
	public Trabajador(int horasTrabajadas, double sueldoHora)
	{
		if(horasTrabajadas < 0)
		{
			horasTrabajadas = 0;
		}
		this.horasTrabajadas = horasTrabajadas;
		
		if(sueldoHora < 0)
		{
			sueldoHora = 0.0;
		}
		this.sueldoHora = sueldoHora;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas)
	{
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public int getHorasTrabajadas()
	{
		return horasTrabajadas;	
	}
	
	public void setSueldoHora(double sueldoHora)
	{
		this.sueldoHora = sueldoHora;
	}
	
	public double getSueldoHora()
	{
		return sueldoHora;
	}
	
	public double salarioBase()
	{
		double salarioBase = horasTrabajadas * sueldoHora;
		return salarioBase;
	}
	
	public double impuestoAplicado()
	{
		double impuestoAplicado = salarioBase() * 0.15;
		return impuestoAplicado;
	}
	
	public double salarioNeto()
	{
		double salarioNeto = salarioBase() - impuestoAplicado();
		return salarioNeto;
	}
}
