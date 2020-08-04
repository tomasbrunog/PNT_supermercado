
public abstract class Producto implements Comparable<Producto> {
	
	protected String nombre;
	protected int precio;
	protected String unidad;
	protected double contenido;	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public double getContenido() {
		return contenido;
	}
	public void setContenido(double contenido) {
		this.contenido = contenido;
	}
	
	@Override
	public int compareTo(Producto o) {
		if (precio > o.precio) {
			return 1;
		}
		else if (precio < o.precio) {
			return -1;
		}
		else return 0;
	}
	
	
}
