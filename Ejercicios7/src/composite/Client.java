package composite;

public class Client {

	public static void main(String[] args) {
		Composite laboratorio  = new Composite(1);
		laboratorio.add(new Computadora(100));
		laboratorio.add(new Computadora(100));
		
		Composite laboratorio2  = new Composite(1);
		laboratorio2.add(new Computadora(100));
		laboratorio2.add(new Computadora(100));
		laboratorio2.add(new Computadora(100));
		laboratorio2.add(new Computadora(100));
		
		Composite laboratorio3  = new Composite(1);
		laboratorio3.add(new Computadora(100));
		laboratorio3.add(new Computadora(100));
		laboratorio3.add(new Computadora(100));
		
		Composite contenedor  = new Composite(1);
		contenedor.add(laboratorio);
		contenedor.add(laboratorio2);
		contenedor.add(laboratorio3);
		System.out.println("El precio del contenedor es: "+contenedor.CalcularPrecio());
	}

}
