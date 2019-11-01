package decorador;

public class Promocion extends Decorator{
	private boolean par;
	Promocion(IBanco componente) {
		super(componente);
		int aux = ((int)(Math.random() * 100) + 1);
		if(aux%2 == 0)
			par = true;
		else
			par = false;
		
	}
	public void operation () {
		super.operation();
		if(par)
			System.out.println("Gano la promocion el monto actual es: " + getMonto() );
		else
			System.out.println("No gano la promocion el monto actual es : " + getMonto() );
			
	}
	public double getMonto() {
		if(par)
			return (super.getMonto()*2 );
		else
			return super.getMonto();
	}

}
