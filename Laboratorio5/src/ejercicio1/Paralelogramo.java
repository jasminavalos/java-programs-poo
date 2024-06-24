package ejercicio1;

public class Paralelogramo extends Cuadrilatero{

	public Paralelogramo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
		super(punto1, punto2, punto3, punto4);
		// TODO Auto-generated constructor stub
	}
	public double calcularArea()
	{
        double base = Math.abs(getPunto1().getX() - getPunto2().getX());
        double altura = Math.abs(getPunto1().getY() - getPunto3().getY());
        return base * altura;
	}

}
