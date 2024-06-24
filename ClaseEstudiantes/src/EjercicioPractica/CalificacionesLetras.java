package EjercicioPractica;
import java.util.Scanner;

public class CalificacionesLetras {

	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int total = 0;
		int contador = 0;
		int aCuenta = 0;
		int bCuenta = 0;
		int cCuenta = 0;
		int dCuenta = 0;
		int fCuenta = 0;
		
		System.out.printf("%s%n%s%n%s%n", "Introduzca las calificaciones en el rango de 0 - 100", "Escriba un indicador de fin de línea para terminar el ciclo",
				"Escriba <ctrl> + z y presione ENTER");
		
		while(entrada.hasNext())
		{
			System.out.printf("Introduza la calificación:");
			int calificacion = entrada.nextInt();
			total += calificacion;
			contador ++;
			
			switch(calificacion / 10)
			{
				case 10:
					
				case 9:
					++aCuenta;
					break;
				
				case 8:
					++bCuenta;
					break;
				
				case 7:
					++cCuenta;
					break;
					
				case 6:
					dCuenta++;
					break;
				
				default:
					fCuenta++;
					break;
			}
		}
		
		System.out.printf("Reporte de calificaciones:");
		if(contador != 0)
		{
			double promedio = (double)total / contador;
			
			System.out.printf("El total de %d calificaciones es %d%n", contador, total);
			System.out.printf("El promedio de la clase es %.2f %n", promedio);
			System.out.printf("%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
					"Cantidad de notas en letras",
					"A: ", aCuenta,
					"B: ", bCuenta,
					"C: ", cCuenta,
					"D: ", dCuenta,
					"F: ", fCuenta);
		}
		else
		{
			System.out.printf("No se introdujeron calificaciones.");
		}
		
		entrada.close();
	}
}
