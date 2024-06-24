package laboratorio4;
import javax.swing.JOptionPane;

public class NumeroPar {
	    public static void main(String[] args) {
	        while (true) {
	            int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
	            if (num == -1) {
	                break;
	            }
	            boolean esPar = esPar(num);
	            JOptionPane.showMessageDialog(null, "¿El número " + num + " es par ?: " + esPar);
	        }
	    }

	    public static boolean esPar(int num) {
	        return num % 2 == 0;
	    }
	}
