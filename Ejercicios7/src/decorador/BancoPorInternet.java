package decorador;

public class BancoPorInternet extends Decorator{
	private boolean enable;
	public BancoPorInternet(IBanco componente, boolean enable) {
		super(componente);
		this.enable = enable;
	}
	public void operation () {
		super.operation();
		if(enable)
			System.out.println("El servicio de banco por internet se encuentra activo.");
		else
			System.out.println("El servicio de banco por internet se encuentra desactivado.");
		
	}
	public double getMonto() {
		
		return super.getMonto();
	}

}
