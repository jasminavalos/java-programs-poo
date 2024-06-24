package Laboratoriop10;

import javax.swing.JOptionPane;

public class Factura {

	private String numeroPieza;
	private String descripcionPieza;
	private int cantidadArticulos;
	private double precioArticulo;
	
	public Factura(String numeroPieza, String descripcionPieza, int cantidadArticulos, double precioArticulo)
	{
		this.numeroPieza = numeroPieza;
		this.descripcionPieza = descripcionPieza;
		
		if(cantidadArticulos < 0 || precioArticulo < 0)
		{
			cantidadArticulos = 0;
			precioArticulo = 0.0;
		}
		
		this.cantidadArticulos = cantidadArticulos;
		this.precioArticulo = precioArticulo;
	}
	
	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}
	
	public String getNumeroPieza() {
		return numeroPieza;
	}
	
	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}
	
	public String getDescripcionPieza() {
		return descripcionPieza;
	}
	
	public void setCantidadArticulos(int cantidadArticulos) {
		this.cantidadArticulos = cantidadArticulos;
	}
	
	public int getCantidadArticulos() {
		return cantidadArticulos;
	}
	
	public void setPrecioArticulo(double precioArticulo) {
		this.precioArticulo = precioArticulo;
	}
	
	public double getPrecioArticulo() {
		return precioArticulo;
	}
	
	public double obtenerMontoFactura() {
		
		if(cantidadArticulos < 0 || precioArticulo < 0)
		{
			cantidadArticulos = 0;
			precioArticulo = 0.0;
		}
		double montoFactura = cantidadArticulos * precioArticulo;
		
		return montoFactura;	
	}
	
	public void MostraFactura()
	{
		JOptionPane.showMessageDialog(null, "Factura No.453\n" + "Numero de pieza: " + getNumeroPieza() + "\nDescripcion de la pieza: "
				+ getDescripcionPieza() + "\nCantidad de Articulos: " + getCantidadArticulos() + "\nPrecio por Articulo: " + getPrecioArticulo()
				+ "\nMonto Total: " + obtenerMontoFactura());
	}
}
