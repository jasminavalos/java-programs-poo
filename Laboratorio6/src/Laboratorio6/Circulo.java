package Laboratorio6;

import javax.swing.JOptionPane;

public class Circulo extends FiguraBidimensional {
    private double radio;

    public Circulo(double radio) {
        if (radio >= 0) {
            this.radio = radio;
        } else {
            JOptionPane.showMessageDialog(null, "El radio debe ser >= 0", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            this.radio = 0; // Valor por defecto
        }
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String obtenerDescripcion() {
        return String.format("Círculo con radio %.2f", radio);
    }
}

