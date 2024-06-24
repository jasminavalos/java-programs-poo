package Laboratorio2p11;

import javax.swing.JOptionPane;

public class Fecha {

	int mes;
	int dia;
	int anio;

	public Fecha(int mes, int dia, int anio)
	{
		this.mes = mes;
		this.dia = dia;
		this.anio = anio;	
	}
	
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	
	public int getMes()
	{
		return mes;
	}
	
	public void setDia(int dia)
	{
		this.dia = dia;
	}
	
	public int getDia()
	{
		return dia;
	}
	
	public void setAnio(int anio)
	{
		this.anio = anio;
	}
	
	public int getAnio()
	{
		return anio;
	}
	
	public void mostrarFecha()
	{
		JOptionPane.showMessageDialog(null, "Fecha: " + mes + "/" +  dia  + "/" + anio);
	}
}
