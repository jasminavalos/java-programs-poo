package laboratorio1;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int edad = 0;
		double ingresosMensuales = 0;
		
		System.out.println("Programa que determina si un usuario puede tributar o no.");
		
		do
		{
			System.out.println("Ingrese su edad:");
			edad = input.nextInt();
			
			System.out.println("Ingrese sus ingresos mensuales:");
			ingresosMensuales = input.nextDouble();
			
			if(edad < 0 || ingresosMensuales < 0)
			{
				System.out.println("Ingrese valores válidos.");
			}
			
		}while(edad < 0 || ingresosMensuales < 0);
		
		if(edad > 16 && ingresosMensuales >= 1000)
			System.out.println("Usted ya puede tributar.");
		else
			System.out.println("Usted aún no puede tributar.");
		
		input.close();
	}

}
