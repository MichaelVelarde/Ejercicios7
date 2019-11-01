package bridge;

public class PlazoFijo implements Moneda{

	@Override
	public void bolivianos(double monto) {
		System.out.println("Se deposito " + monto + "bs con un interes de 5%");
	}

	@Override
	public void dolares(double monto) {
		System.out.println("Se deposito " + monto + "$( "+ (monto*6.96) +
				"bs ) con un interes de 5%");
		
	}
	@Override
	public void euros(double monto) {
		System.out.println("Se deposito " + monto + "€( "+ (monto*7.72) +
				"bs ) con un interes de 5%");
		
	}

}
