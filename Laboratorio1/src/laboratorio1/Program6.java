package laboratorio1;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que calcula el descuento que hay en una panadería");
		System.out.println("Ingrese el número de barras de pan vendidas que no son del día:");
		int barrasPanNoDia = input.nextInt();
		
		double costoPan = 3.49;	
		
		double CostobarrasVendidas = barrasPanNoDia * costoPan;
		double descuentoPan = CostobarrasVendidas * 0.60;
		double costoFinal = CostobarrasVendidas - descuentoPan;
		
		System.out.printf("El costo habitual de una barra de pan es: %.2f€\n", costoPan);
		System.out.printf("El descuento total por no ser barras frescas será de: %.2f€\n", descuentoPan);
		System.out.printf("El costo final será es: %.2f€", costoFinal);
			
		input.close();	
	}
}
