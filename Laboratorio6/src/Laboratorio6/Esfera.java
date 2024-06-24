package Laboratorio6;

import javax.swing.JOptionPane;

public class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera(double radio) {
        if (radio >= 0) {
            this.radio = radio;
        } else {
            JOptionPane.showMessageDialog(null, "El radio debe ser >= 0", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            this.radio = 0; // Valor por defecto
        }
    }

    @Override
    public double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }

    @Override
    public String obtenerDescripcion() {
        return String.format("Esfera con radio %.2f", radio);
    }
}
