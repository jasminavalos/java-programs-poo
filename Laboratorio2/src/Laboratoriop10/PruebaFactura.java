package Laboratoriop10;


public class PruebaFactura {

	public static void main(String[] args) {
		
		Factura factura1 = new Factura("45B", "Pieza de moto", 3, 567.5);
		Factura factura2 = new Factura("3212C", "Articulo de limpieza", 4, 110.5);
		
		factura1.MostraFactura();
		factura2.MostraFactura();
	}
}
