package proxi;

public class Servidor implements IServer{
	private Archivo archivo;
	public Servidor(Archivo archivo) {
		this.archivo = archivo;
	}
	
	@Override
	public void descargar() {
		System.out.println("El archivo " + archivo.getTipo() +" sera descargado.");
	}
	@Override
	public void cargar() {
		System.out.println("El archivo " + archivo.getTipo() +" sera cargado.");
	}

}
