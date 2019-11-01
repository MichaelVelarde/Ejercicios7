package decorador;

public class BancoBasica implements IBanco{
	private double monto;
	private String nombre;
	
	BancoBasica(double monto, String nombre){
		this.monto = monto;
		this.nombre = nombre;
		
	}
	@Override
	public void operation() {
		System.out.println("El cliente "+nombre+" tiene un monto inicial de: " + monto);
	}
	@Override
	public double getMonto() {
		
		return monto;
	}

}
