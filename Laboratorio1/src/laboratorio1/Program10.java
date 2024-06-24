package laboratorio1;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que determina si un número es par o impar.");
		System.out.println("Ingrese el número:");
		int numero = input.nextInt();

		
		if(numero % 2 == 0)
		{
			System.out.printf("El número %d es un número par", numero);
		}
		else
		{
			System.out.printf("El número %d es un número impar", numero);
		}
		
		input.close();
	}

}
