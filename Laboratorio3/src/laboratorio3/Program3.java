package laboratorio3;

import java.util.Random;

import javax.swing.JOptionPane;

public class Program3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int totalPersona = 10;
		
		int []sexos = new int[totalPersona];
		int []trabajos = new int[totalPersona];
		int []sueldos = new int[totalPersona];
		
		Random random = new Random();
		
		for(int i = 0; i < totalPersona; i++) {
			sexos[i] = random.nextInt(2) + 1;
			trabajos[i] = random.nextInt(2) + 1;
			if (trabajos[i] == 1) {
				sueldos[i] = random.nextInt(1401) + 600;
			}else {
				sueldos[i] = 0;
			}
		} 
		
		int hombreTotal = 0, mujerTotal = 0;
		int hombreTrabajan = 0, mujerTrabajan= 0;
		int sueldoHombres = 0, sueldoMujeres = 0;
		
		for(int i = 0; i < totalPersona; i++) {
			if (sexos[i] == 1) {
				hombreTotal++;
				if(trabajos[i] == 1) {
					hombreTrabajan++;
					sueldoHombres += sueldos[i];
				}
			}else {
				mujerTotal++;
				if(trabajos[i] == 1) {
					mujerTrabajan++;
					sueldoMujeres += sueldos[i];
				}
			}
		}
		
		double porcentajeHombre = (hombreTotal / (double) totalPersona) * 100;
		double porcentajeMujer = (mujerTotal / (double) totalPersona) * 100;
		
		double porcentajeHombreTrabajan = (hombreTrabajan  / (double) hombreTotal) * 100;
		double porcentajeMujerTrabajan = (mujerTrabajan  / (double) mujerTotal) * 100;
		
		double promedioSueldoHombre = hombreTrabajan == 0 ? 0 : sueldoHombres / (double) hombreTrabajan;
		double promedioSueldoMujer = mujerTrabajan == 0 ? 0 : sueldoMujeres / (double) mujerTrabajan;
		
		String mensaje = "Porcentaje de hombre: " + porcentajeHombre + "\n" + 
		"Porcentaje de mujeres: " + porcentajeMujer + "\n" + 
				"Porcentaje de hombre que trabajan: " + porcentajeHombreTrabajan + "\n" +
				"Porcentaje de muejres que trabajan: " + porcentajeMujerTrabajan + "\n" +
				"Sueldo promedio de los hombre: " + promedioSueldoHombre + "\n" +
				"Sueldo promedio de las mujeres: " + promedioSueldoMujer + "\n";
		
		JOptionPane.showMessageDialog(null, mensaje);
		
	}
	

}

