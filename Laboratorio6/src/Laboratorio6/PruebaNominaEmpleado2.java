package Laboratorio6;

import java.time.LocalDate;

public class PruebaNominaEmpleado2 {
	
	public static void main(String[] args) {
        Empleado[] empleados = new Empleado[] {
            new EmpleadoAsalariado("Juan", "Pérez", "123-45-6789", new Fecha(15, 5, 1985), 2000.00),
            new EmpleadoAsalariado("Ana", "Gómez", "987-65-4321", new Fecha(20, 4, 1990), 2500.00),
            new EmpleadoPorHora("Luis", "Martínez", "111-22-3333", 40, 15.00, new Fecha(10, 6, 1975)),
            new EmpleadoPorHora("Marta", "Sánchez", "444-55-6666", 45, 12.00, new Fecha(25, 5, 1982)),
            new TrabajadorPorPieza("Pedro", "Rodríguez", "222-33-4444", new Fecha(30, 7, 1988), 10.00, 500)
        };

        int mesActual = LocalDate.now().getMonthValue();

        for (Empleado empleado : empleados) {
            double pago = empleado.ingresos();
            if (empleado.getFechaNacimiento().getMes() == mesActual) {
                pago += 100.00; 
            }
            System.out.printf("Empleado:\n%s\nPago de nómina: $%.2f\n\n", empleado, pago);
        }
    }

}
