package clasepractica;
import java.util.Random;

import javax.swing.JOptionPane;

public class Encuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPersonas = 10;
		int [] sexo = new int[totalPersonas];
		int [] trabajo = new int[totalPersonas];
		int [] sueldo = new int [totalPersonas];
	
		
		Random random = new Random();
		
		for(int i = 0; i < totalPersonas; i++)
		{
			sexo[i] = random.nextInt(2) + 1;
			trabajo[i] = random.nextInt(2) + 1;
			if(trabajo[i] == 1) {
				sueldo[i] = random.nextInt(1401) + 600;
			}
			else {
				sueldo[i] = 0;
			}
			
		}
			
			int hombreTotal = 0;
			int mujerTotal = 0;
			
			int hombresTrabajan = 0;
			int mujeresTrabajan = 0;
			
			int sueldoHombre = 0;
			int sueldoMujer = 0;
			
		
			
			for(int i = 0; i < totalPersonas; i++) {
				if(sexo[i] == 1) {
					hombreTotal ++;
					
					if(trabajo[i] == 1) {
						hombresTrabajan ++;
						
						sueldoHombre += sueldo[i];
					}
				}else {
					mujerTotal ++;
					if(trabajo[i] == 1) {
						mujeresTrabajan ++;
						sueldoMujer += sueldo[i];
					}
					 
				}
			}
			
			double porcentajeHombres = (hombreTotal / (double)totalPersonas) * 100;
			double porcentajeMujeres = (mujerTotal / (double)totalPersonas) * 100;
			
			double porcentajeHombresTrabajan = (hombresTrabajan/ (double)hombreTotal) * 100;
			double porcentajeMujeresTrabajan = (mujeresTrabajan / (double)mujerTotal)* 100;
			
			double promedioSueldoHombres = hombresTrabajan == 0 ? 0 : sueldoHombre / (double)hombresTrabajan;
			double promedioSueldoMujeres = mujeresTrabajan == 0 ? 0 : sueldoMujer / (double)mujeresTrabajan;	
			
			JOptionPane.showMessageDialog(null, "Porcentaje de Hombres: " + porcentajeHombres + "\n" + 
					"Porcentaje Mujeres: " + porcentajeMujeres + "\n" + " Porcentaje hombres que trabajan: " +  porcentajeHombresTrabajan + "\n" + 
					"Porcentaje mujeres que trabajan: " + porcentajeMujeresTrabajan + "\n" + "Sueldo Promedio de los Hombres: " + promedioSueldoHombres + "\n" + 
					"Sueldo Promedio de las mujeres: " + promedioSueldoMujeres + "\n");
		}
	

}
