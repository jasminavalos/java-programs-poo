package laboratorio3;
import javax.swing.JOptionPane;

public class Program1 {

	    public static void main(String[] args) {
	        String[][] ciudades = new String[4][3];
	        for (int i = 0; i < 4; i++) {
	            String pais = JOptionPane.showInputDialog("Introduce el nombre del país " + (i + 1));
	            for (int j = 0; j < 3; j++) {
	                ciudades[i][j] = JOptionPane.showInputDialog("Introduce la ciudad " + (j + 1) + " de " + pais);
	            }
	        }

	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < 4; i++) {
	            sb.append("País " + (i + 1) + ":\n");
	            for (int j = 0; j < 3; j++) {
	                sb.append("Ciudad " + (j + 1) + ": " + ciudades[i][j] + "\n");
	            }
	            sb.append("\n");
	        }

	        JOptionPane.showMessageDialog(null, sb.toString());
	    }

}
