package laboratorio4;
import javax.swing.JOptionPane;

public class Minimo3 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			float num1, num2, num3;
			
			num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
			num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
			num3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer numero"));
			
			JOptionPane.showMessageDialog(null, String.format("El numero minimo es: %.1f", minimo(num1, num2, num3)));
		}
		
		public static float minimo(float x, float y, float z)
		{
			return Math.min(x, Math.min(y, z));
		}
	}

