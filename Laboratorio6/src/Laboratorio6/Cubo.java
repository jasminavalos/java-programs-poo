package Laboratorio6;

import javax.swing.JOptionPane;

public class Cubo extends FiguraTridimensional {
    private double lado;

    public Cubo(double lado) {
        if (lado >= 0) {
            this.lado = lado;
        } else {
            JOptionPane.showMessageDialog(null, "El lado debe ser >= 0", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            this.lado = 0; // Valor por defecto
        }
    }

    @Override
    public double obtenerArea() {
        return 6 * lado * lado;
    }

    @Override
    public double obtenerVolumen() {
        return lado * lado * lado;
    }

    @Override
    public String obtenerDescripcion() {
        return String.format("Cubo con lado %.2f", lado);
    }
}
