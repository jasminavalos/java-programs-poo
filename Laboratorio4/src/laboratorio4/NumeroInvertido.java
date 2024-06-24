package laboratorio4;
import javax.swing.JOptionPane;

public class NumeroInvertido {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero=JOptionPane.showInputDialog("Ingrese el numero a invertir: ");
		int num=Integer.parseInt(numero);
		
		int numeroInvertido= NumerosInvertidos(num);
		
		JOptionPane.showMessageDialog(null, String.format("El numero ingresado ya invertido es: %d", numeroInvertido));
	}
	
	public static int NumerosInvertidos(int numero) {
		int numeroInvertido = 0;
		
		while (numero !=0) {
			int dig = numero%10;
			
			numeroInvertido = numeroInvertido*10+ dig;
			numero/=10;
		}
		return numeroInvertido;
	}
}
