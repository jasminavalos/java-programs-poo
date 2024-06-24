package laboratorio1;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que indica el nivel de rendimiento de los trabajadores:");
		System.out.println("Ingrese su puntuación (solo pueden ser 0.0, 0.4, 0.6 o más):");
		double puntuacion = input.nextDouble();
		
		double dineroConseguido = puntuacion * 2400;
		
		if(puntuacion == 0.0)
		{
			System.out.println("Su nivel es INACEPTABLE");
			
		}
		else if(puntuacion == 0.4)
		{
			System.out.println("Su nivel es ACEPTABLE");
		}
			
		else if(puntuacion >= 0.6)
		{
			System.out.println("Su nivel es MERITORIO");

		}
		
		System.out.println("Su puntuación es: " + puntuacion);
		System.out.printf("La cantidad de dinero que recibirá es de: %.2f€",dineroConseguido);
		
		input.close();	
	}
}
