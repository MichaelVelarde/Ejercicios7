package decorador;

public abstract class Decorator implements IBanco{
	private IBanco componente;
	public Decorator( IBanco componente) {
		this.componente = componente;
	}
	public void operation() {
		componente.operation();
	}
	public double getMonto() {
		return componente.getMonto();
	}

}
