package laboratorio1;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String password = "contraseña";
		
		System.out.println("Programa que verifica una contraseña ingresada");
		
		System.out.println("Ingrese la contraseña:");
		String passwordUser = input.next();
		
		if(passwordUser.equals(password))
			System.out.println("La contraseña ingresada es correcta.");
		else
			System.out.println("Las contraseñas no coinciden.");
		
		input.close();
	}

}
