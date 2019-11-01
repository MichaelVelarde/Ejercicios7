package adapter;

public class AdaptadorRefri implements Electro1{
	Refrigeradores refri = new Refrigeradores();
	
	AdaptadorRefri(Refrigeradores refri){
		this.refri = refri;
	}
	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return refri.costo();
	}
	@Override
	public void setprecio(int precio) {
		refri.setCosto(precio);
	}
	@Override
	public int tiempoDeVida() {
		// TODO Auto-generated method stub
		return refri.tiempoDeGarantia();
	}
	@Override
	public void settiempoDeVida(int tiempo) {
		// TODO Auto-generated method stub
		refri.settiempoDeGarantia(tiempo);
	}
	
	
}
