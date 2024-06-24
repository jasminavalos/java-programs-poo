package laboratorio3;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de la matriz cuadrada"));
		        int[][] matriz = new int[n][n];
		        int sumaDiagonal = 0;
		        int sumaDiagonalInvertida = 0;

		        for (int i = 0; i < n; i++) {
		        	
		            for (int j = 0; j < n; j++) {
		            	
		                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento (" + (i + 1) + "," + (j + 1) + ") de la matriz"));
		                
		                if (i == j) {
		                    sumaDiagonal += matriz[i][j];
		                }
		                if (i + j == n - 1) {
		                    sumaDiagonalInvertida += matriz[i][j];
		                }
		            }
		        }

		        StringBuilder sb = new StringBuilder();
		        
		        for (int[] fila : matriz) {
		            sb.append(Arrays.toString(fila)).append("\n");
		        }
		        
		        sb.append("Suma de la diagonal: "+sumaDiagonal+"\n");
		        sb.append("Suma de la diagonal invertida: "+sumaDiagonalInvertida);
		        
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }


	}
