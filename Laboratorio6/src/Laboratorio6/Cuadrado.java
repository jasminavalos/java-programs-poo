package Laboratorio6;

import javax.swing.JOptionPane;

public class Cuadrado extends FiguraBidimensional {
    private double lado;

    public Cuadrado(double lado) {
        if (lado >= 0) {
            this.lado = lado;
        } else {
            JOptionPane.showMessageDialog(null, "El lado debe ser >= 0", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            this.lado = 0; // Valor por defecto
        }
    }

    @Override
    public double obtenerArea() {
        return lado * lado;
    }

    @Override
    public String obtenerDescripcion() {
        return String.format("Cuadrado con lado %.2f", lado);
    }
}

