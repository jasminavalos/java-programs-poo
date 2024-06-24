package laboratorio1;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int horas = 0;
		double pago = 0;
		
		System.out.println("Programa que calcula el sueldo de un trabajador");	
		do 
		{
			System.out.println("Ingrese el número de horas trabajadas:");
			horas = input.nextInt();
			
			System.out.println("Ingrese el pago por hora:");
			pago = input.nextDouble();
			
			if(horas < 0 || pago < 0)
			{
				System.out.println("El pago y las horas no pueden ser menores a cero.\nIngrese valores validos");
			}
			
		}while(horas < 0 || pago < 0);
		
		double sueldo = horas * pago;
		
		System.out.printf("El sueldo del trabajador será: %.2f$", sueldo);
		
		input.close();
	}

}
