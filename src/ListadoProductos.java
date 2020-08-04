import java.util.ArrayList;

public class ListadoProductos {
	
	ArrayList<Producto> productos = new ArrayList<Producto>();	
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void cargarProductos() {		
		Producto cocaZero = new Bebida("Coca-Cola Zero", 20, "Litros", 1.5);
		Producto coca = new Bebida("Coca-Cola", 18, "Litros", 1.5);
		Producto shampooSedal = new Shampoo("Shampoo Sedal", 19, "ml", 500);
		Producto frutillas = new Fruta("Frutillas", 64, "kilo");
	
		productos.add(cocaZero);
		productos.add(coca);
		productos.add(shampooSedal);
		productos.add(frutillas);
	}

	public Producto masCaro() {
		Producto productoMasCaro = productos.get(0);
		for(Producto producto : productos) {
			if(producto.compareTo(productoMasCaro) > 0) {
				productoMasCaro = producto;
			}
		}
		return productoMasCaro;
	}
	
	public Producto masBarato() {
		Producto productoMasBarato = productos.get(0);
		for(Producto producto : productos) {
			if(producto.compareTo(productoMasBarato) < 0) {
				productoMasBarato = producto;
			}
		}
		return productoMasBarato;
	}	
}
