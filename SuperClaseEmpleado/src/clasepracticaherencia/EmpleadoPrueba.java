package clasepracticaherencia;
import javax.swing.JOptionPane;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado("Jasmin", "Avalos", "1612041016N");
		EmpleadoPorComision empleado2 = new EmpleadoPorComision("Sharon", "Quintero", "23456", 345.4, 678.7);
		
		JOptionPane.showMessageDialog(null, empleado1);
		JOptionPane.showMessageDialog(null, empleado2);
	}

}
