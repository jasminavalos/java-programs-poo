package Laboratorio2;

import javax.swing.JOptionPane;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String output = "Factorial de n\n";
		
		for(int i = 1; i <= 20; i++)
		{
			output += i + factorial(i) + "\n";
		}
		
		JOptionPane.showMessageDialog(null, output, "Factoriales del 1 al 20", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static long factorial(int n)
	{
		long resultado = 1;
		
		for(int i = 2; i <= n; i++)
		{
			resultado *= i;
		}
		
		return resultado;
	}

}
        