package Laboratorio2;
import javax.swing.JOptionPane;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1;
		int numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
		
		if(numero1 > numero2)
		{
			JOptionPane.showMessageDialog(null, numero1 + " es el número mas grande.");
		}
		else if(numero2 > numero1)
		{
			JOptionPane.showMessageDialog(null, numero2 + " es el número mas grande.");
		}
		else if(numero1 == numero2) 
		{
			JOptionPane.showMessageDialog(null, "Los numeros son iguales");
		}
	}

}
