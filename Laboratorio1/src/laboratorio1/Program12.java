package laboratorio1;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double renta = 0;
		
		System.out.println("Programa que determina los tramos impositivos en un determinado país.");
		
		do 
		{
			System.out.println("Ingrese su renta anual:");
			renta = input.nextDouble();
			
		}while(renta < 0);

		if(renta < 10000)
			System.out.println("Su tipo impositivo corresponde al 5%");
		
		else if(renta >= 10000 && renta < 20000)	
			System.out.println("Su tipo impositivo corresponde al 15%");
		
		else if(renta >=20000 && renta < 35000)
			System.out.println("Su tipo impositivo corresponde al 20%");
		
		else if(renta >=35000 && renta < 60000)
			System.out.println("Su tipo impositivo corresponde al 30%");
		
		else
			System.out.println("Su tipo impositivo corresponde al 45%");
		
		input.close();
	}

}
