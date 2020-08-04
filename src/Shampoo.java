
public class Shampoo extends Producto {
	
	public Shampoo(String nombre, int precio, String unidad, double contenido) {		
		this.nombre = nombre;
		this.precio = precio;
		this.unidad = unidad;
		this.contenido = contenido;
	}
	
	@Override
	public String toString() {
		return String.format("Nombre: %s /// Contenido: %s%s /// Precio: $%s", nombre, (int)contenido, unidad, precio);
		
	}

}
