package Laboratorio4ej6;
import javax.swing.JOptionPane;

public class PruebaEmpleado {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre1 = String.valueOf(JOptionPane.showInputDialog("Ingrese el nombre del empleado 1"));
		String apellido1 = String.valueOf(JOptionPane.showInputDialog("Ingrese el apellido del empleado 1"));
		double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado 1"));
		
		Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
		
		String nombre2 = String.valueOf(JOptionPane.showInputDialog("Ingrese el nombre del empleado 2"));
		String apellido2 = String.valueOf(JOptionPane.showInputDialog("Ingrese el apellido del empleado 2"));
		double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado 2"));
		
		Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);
		
		String tabla = "Nombre" + " " + "Apellido" + " " +  " " + "Salario Mensual" + " "+ "Salario anual mas 10% de aumento";
		
		double salarioAnual1 = empleado1.getSalarioMensual() * 12;
		
		tabla += empleado1.getPrimerNombre() + " " + empleado1.getApellidoPaterno() + salarioAnual1 + " ";
		
		double salarioAnualAumento1 = salarioAnual1 + 0.10 * salarioAnual1;
		
		tabla += salarioAnualAumento1 + "\n";
		
		double salarioAnual2 = empleado2.getSalarioMensual() * 12;
		
		double salarioAnualAumento2 = salarioAnual1 + 0.10 * salarioAnual1;
		
		tabla += empleado2.getPrimerNombre() + " " + empleado2.getApellidoPaterno() + salarioAnual2 + " " + salarioAnualAumento2;
		
		JOptionPane.showMessageDialog(null, tabla);
		
 	}
}
