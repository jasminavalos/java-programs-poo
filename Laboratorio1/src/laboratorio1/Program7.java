package laboratorio1;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Scanner input = new Scanner(System.in);
		int edad = 0;
		System.out.println("Programa que determina si una persona es mayor o menor de edad");
		
		do
		{
			System.out.println("Ingrese su edad:");
			edad = input.nextInt();
			
		}while(edad < 0);
	
		if(edad >= 18)
			System.out.printf("Su edad es de %d años, por lo tanto usted es mayor de edad.",edad);
		else
			System.out.printf("Su edad es de %d años, por lo tanto usted es menor de edad", edad);

		input.close();
	}

}
