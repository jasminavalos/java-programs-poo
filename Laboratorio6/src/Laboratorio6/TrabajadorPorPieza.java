package Laboratorio6;

import javax.swing.JOptionPane;

public class TrabajadorPorPieza extends Empleado {
	
    private double sueldoPorPieza;
    private int piezasProducidas;

    public TrabajadorPorPieza(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento, double sueldoPorPieza, int piezasProducidas) {
        
    	super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
        
    	if (sueldoPorPieza >= 0.0) {
            this.sueldoPorPieza = sueldoPorPieza;
        } else {
            JOptionPane.showMessageDialog(null, "El sueldo por pieza debe ser >= 0.0", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            this.sueldoPorPieza = 0.0; // Valor por defecto
        }
        
    	if (piezasProducidas >= 0) {
            this.piezasProducidas = piezasProducidas;
        } else {
            JOptionPane.showMessageDialog(null, "El número de piezas producidas debe ser >= 0", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            this.piezasProducidas = 0; // Valor por defecto
        }
    }

    public double getSueldoPorPieza() {
        return sueldoPorPieza;
    }

    public void setSueldoPorPieza(double sueldoPorPieza) {

    	if (sueldoPorPieza >= 0.0) {
    		
            this.sueldoPorPieza = sueldoPorPieza;
            
        } else {
            JOptionPane.showMessageDialog(null, "El sueldo por pieza debe ser >= 0.0", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    
    }

    public int getPiezasProducidas() {
        return piezasProducidas;
    }

    public void setPiezasProducidas(int piezasProducidas) {
        
    	if (piezasProducidas >= 0) {
        
    		this.piezasProducidas = piezasProducidas;
        
    	} else {
            JOptionPane.showMessageDialog(null, "El número de piezas producidas debe ser >= 0", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public double ingresos() {
        return getSueldoPorPieza() * getPiezasProducidas();
    }

    @Override
    public String toString() {
        return String.format("Trabajador por piezas: %s\nSueldo por pieza: $%.2f\nPiezas producidas: %d",
                super.toString(), getSueldoPorPieza(), getPiezasProducidas());
    }
}