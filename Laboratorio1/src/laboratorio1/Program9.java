package laboratorio1;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que divide dos números.");
		System.out.println("Ingrese el primer numero a dividir:");
		double numero1 = input.nextDouble();
		
		System.out.println("Ingrese el segundo número a dividir:");
		double numero2 = input.nextDouble();
		
		double division = numero1 / numero2;
		
		if(numero2 == 0)
			System.out.println("ERROR, el divisor no puede ser cero.");
		else
			System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, division);
		
		input.close();

	}

}
