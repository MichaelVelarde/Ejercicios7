package visitor;

import java.util.Date;

public class ProductosVisitor implements IVisitor{
	private Date date = new Date();

	@Override
	public void visit(Gatos gato) {
	System.out.println("Veterinario cura al gato de la enfermedad: " 
	+gato.getEnfermedad());
		System.out.println("A las : " +date.getHours() + ":" +date.getMinutes() );
		System.out.println("En la fecha : "+ date.getDate() +"/" + (date.getMonth()+1)
				+"/" + (date.getYear()+1900)	);
	}

	@Override
	public void visit(Perros perro) {
		System.out.println("Veterinario cura al perro de la enfermedad: " 
				+perro.getEnfermedad());
		System.out.println("A las : " +date.getHours() + ":" +date.getMinutes() );
		System.out.println("En la fecha : "+ date.getDate() +"/" + (date.getMonth()+1)
							+"/" + (date.getYear()+1900)	);
		
	}
	@Override
	public void visit(Caballos caballo) {
		System.out.println("Veterinario cura al caballo de la enfermedad: " 
			+caballo.getEnfermedad());
		System.out.println("A las : " +date.getHours() + ":" +date.getMinutes() );
		System.out.println("En la fecha : "+ date.getDate() +"/" + (date.getMonth()+1)
				+"/" + (date.getYear()+1900)	);
	}

}
