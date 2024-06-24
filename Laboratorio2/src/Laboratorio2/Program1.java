package Laboratorio2;
import javax.swing.JOptionPane;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primero número:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
		
		int resultadoSuma = numero1 + numero2;
		int resultadoResta = numero1 - numero2;
		int resultadoProducto = numero1 * numero2;
		
		JOptionPane.showMessageDialog(null, "La suma es: "+ resultadoSuma);
		JOptionPane.showMessageDialog(null, "La resta es: "+ resultadoResta);
		JOptionPane.showMessageDialog(null, "El producto es: "+ resultadoProducto);
		
		if(numero2 == 0)
		{
			JOptionPane.showMessageDialog(null, "ERROR, el divisor no puede ser cero", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			int resultadoCociente = numero1 / numero2;
			JOptionPane.showMessageDialog(null, "El cociente es: "+ resultadoCociente);
		}
	}

}
