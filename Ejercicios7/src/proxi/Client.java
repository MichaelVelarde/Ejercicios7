package proxi;

public class Client {

	public static void main(String[] args) {
		Archivo archivo = new Archivo(".rar" );
		IServer proxy = new ProxyServer(archivo);
		proxy.descargar();
		
		Archivo archivo2 = new Archivo(".zip" );
		IServer proxy2 = new ProxyServer(archivo2);
		proxy2.cargar();
		
		Archivo archivo3 = new Archivo(".java" );
		IServer proxy3 = new ProxyServer(archivo3);
		proxy3.descargar();
	

	}

}
