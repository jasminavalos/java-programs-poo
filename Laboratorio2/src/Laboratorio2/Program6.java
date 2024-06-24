package Laboratorio2;

import javax.swing.JOptionPane;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int producto = 1;
		
		for(int i = 1; i <=15; i+=2)
		{
			producto = producto * i;	
		}
		
		JOptionPane.showMessageDialog(null, "El producto es: " + producto);

	}

}
