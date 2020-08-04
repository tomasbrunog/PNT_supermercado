

public class Main {

	static ListadoProductos productos = new ListadoProductos();
	
	public static void main(String[] args) {
		
		productos.cargarProductos();
		
		for(Producto producto : productos.getProductos()) {
			System.out.println(producto.toString());
		}
		
		System.out.println("=============================");
		
		Producto masCaro = productos.masCaro();
		Producto masBarato = productos.masBarato();
		
		System.out.println(String.format("Producto más caro: %s", masCaro.getNombre()));
		System.out.println(String.format("Producto más barato: %s", masBarato.getNombre()));		
	}

}
