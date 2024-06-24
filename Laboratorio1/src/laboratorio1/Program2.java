package laboratorio1;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que da la bienvenida al usuario.");
		System.out.println("Cual es su nombre?:");
		String name = input.nextLine();
		
		System.out.printf("¡Hola %s!", name);
		
		input.close();
	}

}
