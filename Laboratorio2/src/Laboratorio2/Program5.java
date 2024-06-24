package Laboratorio2;
import javax.swing.JOptionPane;

public class Program5 {

	public static void main(String[] args) {
		int numeroDeterminado;
		int valores;
		int numeroMenor = Integer.MAX_VALUE;

		numeroDeterminado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuántos valores quiere ingresar"));

		for (int i = 0; i < numeroDeterminado; i++) {
			valores = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los valores:"));

			if (valores < numeroMenor) {
				numeroMenor = valores;
			}
		}

		JOptionPane.showMessageDialog(null, "El número menor ingresado es: " + numeroMenor);
	}
}
