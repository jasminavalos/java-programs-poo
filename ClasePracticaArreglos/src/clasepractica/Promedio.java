package clasepractica;

import javax.swing.JOptionPane;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arreglo = new int[10];
		
		String mensaje = String.format("%s%8s%n", "Indice", "Valor");
		
		for(int contador = 0; contador < arreglo.length; contador ++) 
		{
			arreglo[contador] = (contador +1)*2;
			
			mensaje+= String.format("%5d %8d %n", contador, arreglo[contador]);
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
