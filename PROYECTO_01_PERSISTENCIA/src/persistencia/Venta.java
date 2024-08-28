package persistencia;

public class Venta {
	private String folio;
	private String fecha;
	private Linea[] lineas;
	private int index;
	
	public Venta(String folio, String fecha) {
		this.folio = folio;
		this.fecha = fecha;
		lineas = new Linea[20];
		this.index = 0;
	}
	
	public boolean AgregarLinea(int prod, int unidades, int precio) {
		if (index < lineas.length) {
			lineas[index++] = new Linea(prod, unidades, precio);
			return true;
		}else {
			return false;
		}
	}
	
	public String getFolio(){
		return folio;
	}
	
	public void setFolio(String folio) {
		this.folio = folio;
	}
	
	public String getFecha(){
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
