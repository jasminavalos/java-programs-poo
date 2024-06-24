package Laboratorio2;

import javax.swing.JOptionPane;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kilometrosConducidos = 0;
		int litrosUsados = 0;
		
		do
		{
			kilometrosConducidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los kilometros conducidos:"));
			litrosUsados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los litros usados:"));
			
		}while(kilometrosConducidos < 0 || litrosUsados < 0);

		
		double kilometrosPorLitros = (double)kilometrosConducidos / litrosUsados;
		double litrosPorKilometros = (double)litrosUsados / kilometrosConducidos;
		
		JOptionPane.showMessageDialog(null, "Cantidad de kilometros por litros: " + kilometrosPorLitros);
		JOptionPane.showMessageDialog(null, "Cantidad de litros por kilometros: " + litrosPorKilometros);
		
		
		

	}

}
