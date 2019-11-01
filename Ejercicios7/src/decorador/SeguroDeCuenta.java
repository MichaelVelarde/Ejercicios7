package decorador;

public class SeguroDeCuenta extends Decorator{
	private double costoSeguro;
	SeguroDeCuenta(IBanco componente, double costoSeguro) {
		super(componente);
		this.costoSeguro = costoSeguro;
	}
	public void operation () {
		super.operation();
		System.out.println("Debido al costo del seguro el monto actual es: " + getMonto() );
	}
	public double getMonto() {
		
		return (super.getMonto() - costoSeguro);
	}

}
