package adapter;

public class AdaptadorLavadora implements Electro1{
	Lavadoras lavadora = new Lavadoras();
	
	AdaptadorLavadora(Lavadoras lavadora){
		this.lavadora = lavadora;
	}
	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return lavadora.costo();
	}
	@Override
	public void setprecio(int precio) {
		lavadora.setCosto(precio);
	}
	@Override
	public int tiempoDeVida() {
		// TODO Auto-generated method stub
		return lavadora.tiempoDeGarantia();
	}
	@Override
	public void settiempoDeVida(int tiempo) {
		// TODO Auto-generated method stub
		lavadora.settiempoDeGarantia(tiempo);
	}
	
	
}
