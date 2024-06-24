package claselab;

import javax.swing.JOptionPane;

public class clasePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpleadoPorComision empleado1 = new EmpleadoPorComision("Jasmin", "Avalos", "123456", 530.7, 123.5);
		EmpleadoBaseMasComision empleado2 = new EmpleadoBaseMasComision("Sharon", "Quintero", "23456", 345.4, 678.7, 87.5);
		
		JOptionPane.showMessageDialog(null, empleado1);
		JOptionPane.showMessageDialog(null, empleado2);

	}

}
