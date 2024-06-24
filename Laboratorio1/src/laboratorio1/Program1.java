package laboratorio1;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Programa que calcula el producto de 3 números enteros.");
		do
		{
			System.out.println("Ingrese el primer numero:");
			numero1 = input.nextInt();
			
			System.out.println("Ingrese el segundo numero:");
			numero2 = input.nextInt();
			
			System.out.println("Ingrese el tercer numero:");
			numero3 = input.nextInt();
			
			if(numero1 < 0 || numero2 < 0 || numero3 < 0)
			{
				System.out.println("Los números deben de ser enteros.");
			}
			
		}while(numero1 < 0 || numero2 < 0 || numero3 < 0);
		
		int producto = numero1 * numero2 * numero3;
		
		System.out.printf("%d * %d * %d = %d", numero1, numero2, numero3, producto);
		
		input.close();
	}
}
