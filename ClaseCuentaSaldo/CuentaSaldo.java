package clasepractica1;

public class CuentaSaldo {
	
	private String nombre;
	private double saldo;
	
	public CuentaSaldo(String nombre, double saldo)
	{
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public void ActualizarSaldo(double montoSaldo)
	{
		if(montoSaldo <= 0.0)
		{
			montoSaldo = saldo;
		}
		else
		{
			saldo = saldo + montoSaldo;
		}
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}
}
