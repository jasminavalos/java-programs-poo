package laboratorio4;

import javax.swing.JOptionPane;

public class Conversion {

	double grados = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conversion conversion = new Conversion(43);	
		
		JOptionPane.showMessageDialog(null, "Grados: " + String.format("%.2f", conversion.obtenerGrados()) + "\n" + 
											"Grados en fahrenheit: " + String.format("%.2f", conversion.convertirCF()) + "\n" + 
											"Grados en celsius: " + String.format("%.2f", conversion.convertirFC()));
	}
	
	public Conversion(double grados)
	{
		this.grados = grados;
	}
	
	public void establecerGrados(double grados)
	{
		this.grados = grados;
	}
	
	public double obtenerGrados()
	{
		return grados;
	}
	
	public double convertirFC()
	{
		return (grados - 32) * 5 / 9;
	}
	
	public double convertirCF()
	{
		return (grados * 9/5) + 32;
	}
	
	

}
