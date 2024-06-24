package claseFiguras;
import javax.swing.JOptionPane;

public class PruebaFiguras {
    private static Rectangulo rectangulo;
    private static Trapezoide trapezoide;
    private static Paralelogramo paralelogramo;
    private static Cuadrado cuadrado;

    public static void main(String[] args) {
        Punto punto1 = new Punto(1, 3);
        Punto punto2 = new Punto(4, 5);
        Punto punto3 = new Punto(4, 3);
        Punto punto4 = new Punto(2, 3);
        
        rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);
        trapezoide = new Trapezoide(punto1, punto2, punto3, punto4);
        paralelogramo = new Paralelogramo(punto1, punto2, punto3, punto4);
        cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);  
        
        mostrarAreas();
    }
    
    public static void mostrarAreas() {
        JOptionPane.showMessageDialog(null, "Área del Rectángulo: " + rectangulo.calcularArea());
        JOptionPane.showMessageDialog(null, "Área del Trapezoide: " + trapezoide.calcularArea());
        JOptionPane.showMessageDialog(null, "Área del Paralelogramo: " + paralelogramo.calcularArea());
        JOptionPane.showMessageDialog(null, "Área del Cuadrado: " + cuadrado.calcularArea());
    }
}
