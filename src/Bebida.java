
public class Bebida extends Producto {
	
	public Bebida(String nombre, int precio, String unidad, double contenido) {		
		this.nombre = nombre;
		this.precio = precio;
		this.unidad = unidad;
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s /// %s: %s /// Precio: $%s", nombre, unidad, contenido, precio);
	}
}
