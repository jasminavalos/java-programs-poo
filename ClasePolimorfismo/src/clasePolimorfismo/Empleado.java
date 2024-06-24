package clasePolimorfismo;

public abstract class Empleado {
			private final String primerNombre;
			private final String apellidoPaterno;
			private final String numeroSeguroSocial;
			
			public Empleado(final String primerNombre, final String apellidoPaterno, final String numeroSeguroSocial)
			{
				this.primerNombre = primerNombre;
				this.apellidoPaterno = apellidoPaterno;
				this.numeroSeguroSocial = numeroSeguroSocial;
			}
			
			public String getPrimerNombre()
			{
				return primerNombre;
			}
			
			public String getApellidoPaterno()
			{
				return apellidoPaterno;
			}
			
			public String getNumeroSeguroSocial()
			{
				return numeroSeguroSocial;
			}
			
			public abstract double ingresos();
			
			@Override
			public String toString()
			{
				return String.format("Nombre: " + getPrimerNombre() + "\n"+ "Apellido: " + getApellidoPaterno() + "\n"+ "Numero del seguro social: " + getNumeroSeguroSocial());
			}
}
