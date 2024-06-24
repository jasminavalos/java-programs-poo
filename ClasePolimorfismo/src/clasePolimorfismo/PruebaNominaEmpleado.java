package clasePolimorfismo;
import javax.swing.JOptionPane;

public class PruebaNominaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado[] empleados = new Empleado[4];
		empleados[0] = new EmpleadoPorHora("Jasmin", "Avalos", "1612041016N", 20.9, 42.5);
		empleados[1] = new EmpleadoPorHora("Sharon", "Briceni", "16120465016N", 31.4, 456.1);
		empleados[2] = new EmpleadoPorHora("Kevin", "Briceni", "16120465016NMN", 56.4, 45.1);
		empleados[3] =  new EmpleadoPorHora("Erick", "Morales", "161204N", 87.0, 45.8);
		
		String salida = String.format("Empleado procesados de forma polimorfica: %n%n");
		for(Empleado empleadoActual: empleados) {
			salida += empleadoActual.toString();
			salida += String.format("Ingreso $%,.2f%n%n", empleadoActual.ingresos());
		}
		JOptionPane.showMessageDialog(null, salida);
	}
}
