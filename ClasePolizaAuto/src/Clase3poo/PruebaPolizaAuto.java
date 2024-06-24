package Clase3poo;
import javax.swing.JOptionPane;

public class PruebaPolizaAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolizaAuto Auto1 = new PolizaAuto(20230616, "MB2022", "Masaya");
		
		JOptionPane.showMessageDialog(null, "Su numero de cuenta es: "+Auto1.getNumeroCuenta(), "Informaci�n Poliza", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "La marca y modelo del auto es: "+Auto1.getMarcaYmodelo(), "Informaci�n Poliza", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Usted es del municipio de: "+Auto1.getMunicipio(), "Informaci�n Poliza", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "En ese departamento no se aplica multa: "+Auto1.MunicipioSinMulta(), "Informaci�n Poliza", JOptionPane.INFORMATION_MESSAGE);
	}

}
