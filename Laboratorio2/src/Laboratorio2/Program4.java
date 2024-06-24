package Laboratorio2;

import javax.swing.JOptionPane;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lado1;
		int lado2;
		int lado3;
		
		lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer lado:"));
		lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo lado:"));
		lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer lado:"));
		
		if(lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
		{
			JOptionPane.showMessageDialog(null, "No se puede representar un triángulo con estos valores.", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Si se puede representar un triángulo.");
		}
	}

}
