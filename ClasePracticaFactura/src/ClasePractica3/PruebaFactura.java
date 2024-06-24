package ClasePractica3;

public class PruebaFactura {

	public static void main(String[] args) {
		
		Factura factura1 = new Factura("45B", "Pieza de moto", 3, 567.9);
		Factura factura2 = new Factura("3212C", "Articulo de limpieza", 4, 110.5);
		
		System.out.println("Factura de la tienda");
		System.out.println("Factura No. 1");
		System.out.println("Numero de la pieza: " + factura1.getNumeroPieza());
		System.out.println("Descripcion de la pieza: " + factura1.getDescripcionPieza());
		System.out.println("Cantidad de articulos: " + factura1.getCantidadArticulos());
		System.out.printf("Precio por articulo: %.2f$\n", factura1.getPrecioArticulo());
		System.out.printf("Monto Total: %.2f$\n", factura1.obtenerMontoFactura());
		
		System.out.println("Factura No. 2");
		System.out.println("Numero de la pieza: " + factura2.getNumeroPieza());
		System.out.println("Descripcion de la pieza: " + factura2.getDescripcionPieza());
		System.out.println("Cantidad de articulos: " + factura2.getCantidadArticulos());
		System.out.printf("Precio por articulo: %.2f$\n", factura2.getPrecioArticulo());
		System.out.printf("Monto Total: %.2f$", factura2.obtenerMontoFactura());
	}
}
