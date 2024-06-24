package claseFiguras;

public class Rectangulo extends Paralelogramo{

	public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
		super(punto1, punto2, punto3, punto4);
	}
	
	@Override
	public double calcularArea()
	{
		double base = Math.abs(getPunto1().getX() - getPunto2().getX());
		double altura = Math.abs(getPunto1().getX() - getPunto3().getX());
		return base * altura;
	}
}