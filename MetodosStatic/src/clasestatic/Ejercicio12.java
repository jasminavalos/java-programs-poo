package clasestatic;
import javax.swing.JOptionPane;
public class Ejercicio12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero=JOptionPane.showInputDialog("Ingrese el numero a invertir: ");
		int num=Integer.parseInt(numero);
		
		int numeroInvertido=Invertir.NumerosInvertidos(num);
		
		JOptionPane.showMessageDialog(null, String.format("El numero ingresado ya invertido es: %d", numeroInvertido));
	
	}
}