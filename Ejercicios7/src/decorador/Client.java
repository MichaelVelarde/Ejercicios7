package decorador;

public class Client {

	public static void main(String[] args) {
		IBanco banco = new BancoBasica(10000 , "Juan Perez");
		banco = new BancoPorInternet(banco,true);
		banco = new SeguroDeCuenta(banco,200);
		banco = new Promocion(banco);
		
		banco.operation();

	}

}
