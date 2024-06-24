package Laboratorio2;
import javax.swing.JOptionPane;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
		
		if(numero1 % numero2 == 0)
		{
			JOptionPane.showMessageDialog(null, numero1 + " es multiplo de " + numero2);
		}
		else
		{
			JOptionPane.showMessageDialog(null, numero1 + " no es multiplo de " + numero2);
		}
	}

}
