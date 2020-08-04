
public class Fruta extends Producto {
	
	
	public Fruta(String nombre, int precio, String unidad) {
			
		this.nombre = nombre;
		this.precio = precio;
		this.unidad = unidad;
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s /// Precio: $%s /// Unidad de venta: %s", nombre, precio, unidad);
	}	
}
