package proxi;

public class ProxyServer implements IServer{
	private Archivo archivo;
	private Servidor server;
	public ProxyServer(Archivo archivo) {
		this.archivo = archivo;
		server = new Servidor (archivo);
	}
	
	@Override
	public void descargar() {
		if(archivo.getTipo().equals(".rar") || archivo.getTipo().equals(".zip") ) {
			this.server.descargar();
		}
		else 
		System.out.println("El servidor solo acepta archivos .rar y .zip");
			
		
	}
	@Override
	public void cargar() {
		if(archivo.getTipo().equals(".rar") || archivo.getTipo().equals(".zip") ) {
			this.server.cargar();
		}
		else 
			System.out.println("El servidor solo acepta archivos .rar y .zip");
			
		
	}
}
