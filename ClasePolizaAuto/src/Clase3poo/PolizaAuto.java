package Clase3poo;

public class PolizaAuto {
	
		int numeroCuenta;
		String marcaYmodelo;
		String municipio;
		
		public PolizaAuto(int numeroCuenta, String marcaYmodelo, String municipio) 
		{
			this.numeroCuenta = numeroCuenta;
			this.marcaYmodelo = marcaYmodelo;
			this.municipio = municipio;
			
		}
		
		public void SetNumeroCuenta(int numeroCuenta) 
		{
			this.numeroCuenta = numeroCuenta;
		}
		
		public int getNumeroCuenta() 
		{
			return numeroCuenta;
		}
		
		public void SetMarcaYmodelo(String marcaYmodelo) 
		{
			this.marcaYmodelo = marcaYmodelo;
		}
		
		public String getMarcaYmodelo() 
		{
			return marcaYmodelo;
		}
		
		public void SetMunicipio(String municipio) 
		{
			this.municipio = municipio;
		}
		
		public String getMunicipio() 
		{
			return municipio;
		}
		
		
		public boolean MunicipioSinMulta() {
			boolean municipioSinMulta;
			
			switch(getMunicipio())
			{
				case "Masaya" : case "Granada" : case "Le�n" : case "Matagalpa" :
					municipioSinMulta = true;
					break;
					
				default: 
					municipioSinMulta = false;
			}
			
			return municipioSinMulta;
		}

}
