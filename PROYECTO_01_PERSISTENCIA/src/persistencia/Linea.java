package persistencia;

public class Linea {
	private int prod;
	private int unidades;
	private int precio;
	
	public Linea(int prod, int unidades, int precio) {
		this.prod = prod;
		this.unidades = unidades;
		this.precio = precio;
	}
	
	public int getProd() {
		return prod;
	}
	
	public void setProd(int prod) {
		this.prod = prod;
	}
	
	public int getUnidades() {
		return unidades;
	}
	
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
