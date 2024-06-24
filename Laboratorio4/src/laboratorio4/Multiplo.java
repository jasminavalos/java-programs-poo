package laboratorio4;

import javax.swing.JOptionPane;

public class Multiplo {

    public static void main(String[] args) {
        while (true) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número (o -1 para salir):"));
            if (num1 == -1) {
                break;
            }
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));
            boolean esMultiplo = esMultiplo(num1, num2);
            JOptionPane.showMessageDialog(null, "¿El número " + num2 + " es múltiplo de " + num1 + "? " + esMultiplo);
        }
    }

    public static boolean esMultiplo(int num1, int num2) {
        return num2 % num1 == 0;
    }
}
