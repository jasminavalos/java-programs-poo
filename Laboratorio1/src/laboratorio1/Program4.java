package laboratorio1;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double pesoKg, altura;
		
		System.out.println("Programa que calcula el indice de masa corporal (IMC)");		
		do
		{
			System.out.println("Ingrese su peso en kilogramos (kg):");
			pesoKg = input.nextDouble();
			
			System.out.println("Ingrese su estatura en metros (m):");
			altura = input.nextDouble();
			
			if(pesoKg < 0 || altura < 0)
			{
				System.out.println("Ingrese valores válidos.");
			}
			
		}while(pesoKg < 0 || altura < 0);
		
		double imc = pesoKg / (altura * altura);
		
		System.out.printf("Tu índice de masa corporal es: %.2f", imc);
		
		input.close();	
	}

}
