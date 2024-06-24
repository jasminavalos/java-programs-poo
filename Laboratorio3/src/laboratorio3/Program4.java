package laboratorio3;

import javax.swing.JOptionPane;

public class Program4 {
	
	public static void main(String[] args) {
		
        int[][] ventas = new int[4][5]; 

        for (int vendedor = 0; vendedor < 4; vendedor++) {
            for (int producto = 0; producto < 5; producto++) {
                int valorVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de venta del vendedor " + (vendedor + 1) + " para el producto " + (producto + 1) + ":"));
                ventas[producto][vendedor] = valorVenta;
            }
        }

        int[] totalPorVendedor = new int[4];
        int[] totalPorProducto = new int[5];

        for (int vendedor = 0; vendedor < 4; vendedor++) {
            for (int producto = 0; producto < 5; producto++) {
                totalPorVendedor[vendedor] += ventas[producto][vendedor];
                totalPorProducto[producto] += ventas[producto][vendedor];
            }
        }

        StringBuilder tablaHTML = new StringBuilder();
        tablaHTML.append("<html><body><h2>Resumen de ventas del último mes</h2>");
        tablaHTML.append("<table border='1'><tr><th>Producto</th><th>Vendedor 1</th><th>Vendedor 2</th><th>Vendedor 3</th><th>Vendedor 4</th><th>Total</th></tr>");

        for (int producto = 0; producto < 5; producto++) {
            tablaHTML.append("<tr><td>Producto ").append(producto + 1).append("</td>");
            for (int vendedor = 0; vendedor < 4; vendedor++) {
                tablaHTML.append("<td>").append(ventas[producto][vendedor]).append("</td>");
            }
            tablaHTML.append("<td>").append(totalPorProducto[producto]).append("</td></tr>");
        }

        tablaHTML.append("<tr><td>Total</td>");
        for (int totalVendedor : totalPorVendedor) {
            tablaHTML.append("<td>").append(totalVendedor).append("</td>");
        }
        tablaHTML.append("</table></body></html>");

        JOptionPane.showMessageDialog(null, tablaHTML.toString());
    }

}
