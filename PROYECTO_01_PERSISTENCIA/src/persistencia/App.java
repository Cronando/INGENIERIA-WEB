package persistencia;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class App {

	public static void main(String[] args) {
		ObjectContainer db = Db4oEmbedded.openFile("LineaVenta.db");

		Venta venta = new Venta("GPU01","2024-08-27");
		
		boolean v1 = venta.AgregarLinea(10035, 8, 4900);
		boolean v2 = venta.AgregarLinea(10156, 4, 7600);
		
		System.out.println("Linea 1 added: " + v1);
        System.out.println("Linea 2 added: " + v2);
		
	}

}
