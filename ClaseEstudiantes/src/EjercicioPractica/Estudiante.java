package EjercicioPractica;

public class Estudiante {
	
	private String nombre;
	private double promedio;
	
	public Estudiante(String nombre, double promedio)
	{
		this.nombre = nombre;
		
		if(promedio >= 0 && promedio <=100)
			this.promedio = promedio;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setPromedio(double promedio)
	{
		this.promedio = promedio;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public double getPromedio()
	{
		return promedio;
	}
	
	public String getCalificacion()
	{
		int promedioFinal = (int)promedio / 10;
		String calificacionEnLetras = "";
		
		switch(promedioFinal)
		{
			case 10:
				
			case 9:
				calificacionEnLetras = "A";
				break;
			
			case 8:
				calificacionEnLetras = "B";
				break;
				
			case 7:
				calificacionEnLetras = "C";
				break;
				
			case 6:
				calificacionEnLetras = "D";
				break;
				
			default:
				calificacionEnLetras = "F";
		}
		return calificacionEnLetras;
	}
	
	public static void main(String args[])
	{
		Estudiante alumno1 = new Estudiante("Jasmin Avalos", 87);
		Estudiante alumno2 = new Estudiante("Sharon Briceño", 93);
		
	     System.out.printf ("La calificación de %s es: %s",alumno1.getNombre(),alumno1.getCalificacion());
	     System.out.println();
	     System.out.printf ("La calificación de %s es: %s",alumno2.getNombre(),alumno2.getCalificacion());
	     System.out.println();
	}

}
