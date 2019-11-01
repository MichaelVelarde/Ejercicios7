package adapter;

public class Tablets implements Electro1{
	private int precio;
	private int tiempo;
	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public void setprecio(int precio) {
		this.precio=precio;
	}

	@Override
	public int tiempoDeVida() {
		// TODO Auto-generated method stub
		return tiempo;
	}

	@Override
	public void settiempoDeVida(int tiempo) {
		this.tiempo = tiempo;
	}

}
