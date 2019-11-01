package composite;

abstract class Component {
	private int precio;
	public Component(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return this.precio;
	}
	public abstract int CalcularPrecio();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	
	
}
