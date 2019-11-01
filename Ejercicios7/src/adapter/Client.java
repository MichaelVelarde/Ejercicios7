package adapter;

public class Client {

	public static void main(String[] args) {
		Celulares celular = new Celulares();
		celular.setprecio(1000);
		celular.settiempoDeVida(3);
	System.out.println("El precio del celular es: " +celular.precio());

	System.out.println("El tiempo de vida del celular es: " +celular.tiempoDeVida());
		Televisores tele = new Televisores();
		tele.setCosto(2300);
		tele.settiempoDeGarantia(2);
		AdaptadorTele nuevaTele= new AdaptadorTele(tele);
	System.out.println("El precio de la tele es: " +nuevaTele.precio());

	System.out.println("El tiempo de vida de la tele es: " +nuevaTele.tiempoDeVida());
		
	}

}
