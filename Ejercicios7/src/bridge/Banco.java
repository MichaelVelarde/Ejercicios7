package bridge;

public class Banco implements TipoDeCuenta {
	private Moneda moneda;
	
	public Banco(Moneda moneda) {
		this.moneda= moneda;
	}

	@Override
	public void cuentaEnDolar(double monto) {
		System.out.println("Deposito en dolares");
		this.moneda.dolares(monto);
		
	}

	@Override
	public void cuentaEnBoliviano(double monto) {
		System.out.println("Deposito en bolivianos");
		this.moneda.bolivianos( monto);
	}
	@Override
	public void cuentaEnEuro(double monto) {
		System.out.println("deposito en euros");
		this.moneda.euros(monto);
	}
}
