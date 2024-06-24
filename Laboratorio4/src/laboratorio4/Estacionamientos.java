package laboratorio4;

import javax.swing.JOptionPane;

public class Estacionamientos {
    public static void main(String[] args) {
        double totalRecibos = 0;
        int horas = 0;
        
        while (true)
        {
        	horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas de estacionamiento para el cliente (o -1 para salir):"));
        	
            if (horas == -1) {
                break;
            }
            double cargo = calcularCargos(horas);
            totalRecibos += cargo;
            JOptionPane.showMessageDialog(null, String.format("El cargo para el cliente actual es: $%.2f", cargo));
        }
        JOptionPane.showMessageDialog(null, String.format("El total de los recibos de ayer es: $%.2f", totalRecibos));
    }

    public static double calcularCargos(double horas) {
        double cargo;
        if (horas <= 3)
        {
            cargo = 2.00;
        } 
        else if (horas < 24)
        {
            cargo = 2.00 + 0.50 * (Math.ceil(horas) - 3);
            
            if (cargo > 10.00)
            {
                cargo = 10.00;
            }
        } 
        else 
        {
            cargo = 10.00;
        }
        return cargo;
    }
}
