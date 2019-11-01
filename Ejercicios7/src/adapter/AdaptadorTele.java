package adapter;

public class AdaptadorTele implements Electro1{
	Televisores tele = new Televisores();
	
	AdaptadorTele(Televisores tele){
		this.tele = tele;
	}
	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return tele.costo();
	}
	@Override
	public void setprecio(int precio) {
		tele.setCosto(precio);
	}
	@Override
	public int tiempoDeVida() {
		// TODO Auto-generated method stub
		return tele.tiempoDeGarantia();
	}
	@Override
	public void settiempoDeVida(int tiempo) {
		// TODO Auto-generated method stub
		tele.settiempoDeGarantia(tiempo);
	}
	
	
}
