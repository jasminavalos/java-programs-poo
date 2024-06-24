package laboratorio4;

import javax.swing.JOptionPane;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de un circulo"));
		JOptionPane.showMessageDialog(null, "El area del circulo es: " + String.format("%.2f",circuloArea(radio)));
	}
	
	public static double circuloArea(double radio)
	{
		double areaCirculo = Math.PI * Math.pow(radio, 2);
		return areaCirculo;
	}

}
