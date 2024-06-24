import javax.swing.JOptionPane;
public class CalculoFactura
{
    public static void main(String[] args) 
    {
        Producto producto1 = new ProductoDescuento("Producto con descuento", 100, 0.1);
        Producto producto2 = new ProductoImpuesto("Producto con impuesto", 200, 0.15);
        Producto[] productos = {producto1, producto2};
        double totalFactura = 0;
        for (Producto producto : productos) 
        {
            totalFactura += producto.calcularTotal();
            JOptionPane.showMessageDialog(null, producto.toString() + "\nTotal: " + producto.calcularTotal());
        }
        JOptionPane.showMessageDialog(null, "Total de la factura: " + totalFactura);
    }
}
