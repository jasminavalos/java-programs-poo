package Laboratorio6;

import javax.swing.JOptionPane;

public class PruebaFigura {
    public static void main(String[] args) {
        // Crear instancias de figuras con valores predefinidos
        Figura[] figuras = new Figura[] {
            new Circulo(5.0),
            new Cuadrado(4.0),
            new Cubo(3.0),
            new Esfera(2.0)
        };

        // Construir la cadena de resultados
        StringBuilder resultados = new StringBuilder();
        for (Figura figura : figuras) {
            resultados.append(figura.toString()).append("\n");
            if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional figura2D = (FiguraBidimensional) figura;
                resultados.append("Área: ").append(String.format("%.2f", figura2D.obtenerArea())).append("\n\n");
            } else if (figura instanceof FiguraTridimensional) {
                FiguraTridimensional figura3D = (FiguraTridimensional) figura;
                resultados.append("Área: ").append(String.format("%.2f", figura3D.obtenerArea())).append("\n");
                resultados.append("Volumen: ").append(String.format("%.2f", figura3D.obtenerVolumen())).append("\n\n");
            }
        }

        // Mostrar resultados en JOptionPane
        JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados de las Figuras", JOptionPane.INFORMATION_MESSAGE);
    }
}
