package laboratorio1;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que calcula el precio que le debe de cobrar a sus clientes por entrar a un juego");
		int edad = 0;
		
		do
		{
			System.out.println("Ingrese su edad:");
			edad = input.nextInt();
			
			if(edad < 0)
			{
				System.out.println("Ingrese un edad válida");
			}
			
		}while(edad < 0);
		
		if(edad >= 0 && edad < 4)
		{
			System.out.printf("Su edad es de %d años, por lo tanto su entrada es gratis", edad);
		}
		else if(edad >= 4 && edad <= 18)
		{
			System.out.printf("Su edad es de %d años, por lo tanto su entrada cuesta 5€", edad);
		}
		else
		{
			System.out.printf("Su edad es de %d años, por lo tanto su entrada cuesta 10€", edad);
		}
		
		input.close();
	}

}
