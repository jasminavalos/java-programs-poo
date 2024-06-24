public class ProductoDescuento extends Producto
{
    private double descuento;
    public ProductoDescuento(String nombre, double precio, double descuento) 
    {
        super(nombre, precio);
        this.descuento = descuento;
    }
    @Override
    public double calcularTotal() 
    {
        return precio - (precio * descuento);
    }
    @Override
    public String toString() 
    {
        return super.toString() + "\nDescuento: " + descuento;
    }
}
