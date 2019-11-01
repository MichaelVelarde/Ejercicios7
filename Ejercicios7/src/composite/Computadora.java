package composite;

public class Computadora extends Component {

	public Computadora(int precio) {
		super(precio);
	}
	@Override
	public int CalcularPrecio() {
		return this.getPrecio();
	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on computadora");
	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on computadora");
	}

}
