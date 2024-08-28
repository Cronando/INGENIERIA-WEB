package persistencia;

import com.db4o.*;

public class DB4O {
	private static ObjectContainer db;
	
	public static void Conexion() {
		db = Db4oEmbedded.openFile("LineaVenta.db");
	}
	
	public static void grabarObjeto(Venta venta) {
		db.store(venta);
	}
	
	public static void consultaObjeto(Venta venta) {
		db.queryByExample(venta);
	}

}
