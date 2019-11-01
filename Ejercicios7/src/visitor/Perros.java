package visitor;

public class Perros implements Animales {
	private String enfermedad;
	
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	

}
