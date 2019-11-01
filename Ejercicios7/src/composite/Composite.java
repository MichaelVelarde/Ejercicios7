package composite;

import java.util.ArrayList;

public class Composite extends Component{
	private ArrayList<Component> list = new ArrayList<>();
	public Composite(int precio) {
		super(precio);
	}
	@Override
	public int CalcularPrecio() {
		int acc =0;
		for(Component comp: list) {
			acc += comp.CalcularPrecio();
		}
		return acc;
	}
	@Override
	public void add(Component component) {
		list.add(component);
		
	}
	@Override
	public void remove(Component component) {
		list.remove(component);
		
	}
	
}
