package clasepractica1;
import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaSaldo cuenta1 = new CuentaSaldo("Jasmin Avalos", 600);
		CuentaSaldo cuenta2 = new CuentaSaldo("Sharon Quintero", 500);
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Saldo actual de %s: $%.2f\n", cuenta1.getNombre(), cuenta1.getSaldo());
		System.out.printf("Saldo actual de %s: $%.2f\n", cuenta2.getNombre(), cuenta2.getSaldo());
		
		System.out.printf("\nIngrese el monto a depositar para la cuenta de %s:", cuenta1.getNombre());
		double saldo_actual = entrada.nextDouble();
		cuenta1.ActualizarSaldo(saldo_actual);
		
		System.out.printf("El saldo actual de la cuenta de %s es: $%.2f\n", cuenta1.getNombre(), cuenta1.getSaldo());
		
		System.out.printf("\nIngrese el monto a depositar para la cuenta de %s:", cuenta2.getNombre());
		double saldo_actual2 = entrada.nextDouble();
		cuenta2.ActualizarSaldo(saldo_actual2);
		
		System.out.printf("El saldo actual de la cuenta de %s es: %.2f", cuenta2.getNombre(), cuenta2.getSaldo());
		
		entrada.close();
	}

}
