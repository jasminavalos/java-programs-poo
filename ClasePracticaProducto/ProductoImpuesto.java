public class ProductoImpuesto extends Producto
{
    private double impuesto;
    public ProductoImpuesto(String nombre, double precio, double impuesto) 
    {
        super(nombre, precio);
        this.impuesto = impuesto;
    }
    @Override
    public double calcularTotal() 
    {
        return precio + (precio * impuesto);
    }
    @Override
    public String toString() 
    {
        return super.toString() + "\nImpuesto: " + impuesto;
    }
}
