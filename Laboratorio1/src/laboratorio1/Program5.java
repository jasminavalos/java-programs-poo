package laboratorio1;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Programa que calcula el peso de un paquete enviado por una juguetería");
		
		System.out.println("Ingrese el número de muñecas enviadas en el último pedido:");
		int munecasEnviadas = input.nextInt();
		
		System.out.println("Ingrese el número de payasos enviados en el último pedido:");
		int payasosEnviados = input.nextInt();
		
		int pesoMunecas = (munecasEnviadas * 75); 
		int pesoPayasos = (payasosEnviados * 112);
		
		int pesoTotalPedido = pesoMunecas + pesoPayasos;
		
		System.out.printf("El peso total del paquete enviado es: %dg.", pesoTotalPedido);
			
		input.close();
	}

}
