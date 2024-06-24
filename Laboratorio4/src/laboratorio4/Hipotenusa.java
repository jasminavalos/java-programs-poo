package laboratorio4;

import javax.swing.JOptionPane;

public class Hipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     double[][] lados = {{3.0, 4.0}, {5.0, 12.0}, {8.0, 15.0}};

	        for (int i = 0; i < lados.length; i++) {
	            double lado1 = lados[i][0];
	            double lado2 = lados[i][1];
	            double hipotenusa = hipotenusa(lado1, lado2);
	            JOptionPane.showMessageDialog(null, "Para el triángulo " + (i+1) + " con lados " + lado1 + " y " + lado2 + "\n"+ "La hipotenusa es: " + hipotenusa);
	        }
	    }
	
	public static double hipotenusa(double lado1, double lado2)
	{
		lado1 = (int) Math.pow(lado1, 2);
		lado2 = (int) Math.pow(lado2, 2);
		
		double hipotenusa = Math.sqrt(lado1 + lado2);
		
		return hipotenusa;
	}

}
