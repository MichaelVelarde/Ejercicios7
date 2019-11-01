package adapter;

public class Refrigeradores implements Electro2{
	private int costo;
	private int garantia;

	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return costo;
	}

	@Override
	public int tiempoDeGarantia() {
		// TODO Auto-generated method stub
		return garantia;
	}

	@Override
	public void setCosto(int costo) {
		this.costo = costo;
		
	}

	@Override
	public void settiempoDeGarantia(int garantia) {
		// TODO Auto-generated method stub
		this.garantia=garantia;
	}
	
}
