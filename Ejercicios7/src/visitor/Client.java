 	package visitor;

public class Client {

	public static void main(String[] args) {
		Gatos gato = new Gatos();
		Perros perro = new Perros();
		Caballos caballo = new Caballos();
		gato.setEnfermedad("moquillo");
		perro.setEnfermedad("sarna");
		caballo.setEnfermedad("enfermedad1");
		
		
		ProductosVisitor visitor = new ProductosVisitor();
		gato.accept(visitor);
		perro.accept(visitor);
		caballo.accept(visitor);
		
	}

}
