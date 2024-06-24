package ejercicio1;

public class Trapezoide extends Cuadrilatero {
    public Trapezoide(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    public double calcularArea() {
        double base1 = Math.abs(getPunto1().getX() - getPunto2().getX());
        double base2 = Math.abs(getPunto3().getX() - getPunto4().getX());
        double altura = Math.abs(getPunto1().getY() - getPunto3().getY());
        return ((base1 + base2) * altura) / 2;
    }
}