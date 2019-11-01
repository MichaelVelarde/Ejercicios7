package bridge;

public class Credito implements Moneda{

	@Override
	public void bolivianos(double monto) {
		System.out.println("Se deposito " + monto + "bs sin interes");
	}

	@Override
	public void dolares(double monto) {
		System.out.println("Se deposito " + monto + "$( "+ (monto*6.96) +
				"bs )sin interes");
		
	}
	@Override
	public void euros(double monto) {
		System.out.println("Se deposito " + monto + "€( "+ (monto*7.72) +
				"bs ) sin interes");
		
	}
}
