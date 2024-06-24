package ejercicio1;

public class Cuadrado extends Rectangulo {

	public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
		super(punto1, punto2, punto3, punto4);
	}
	
	@Override
	public double calcularArea()
	{
        double lado = Math.abs(getPunto1().getX() - getPunto2().getX());
        return lado * lado;
	}

}
