package clasepractica;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de notas: "));
		
		double[] arreglo = new double[n];
		double suma = 0;
		
		for (int i = 0; i<n ; i++) 
		{
			arreglo[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de las notas: "+(i+1)+":"));
			suma += arreglo[i];
		}
		
		double promedio = suma /n;
		
		JOptionPane.showMessageDialog(null, "El promedio es: " +promedio );
	}

}
