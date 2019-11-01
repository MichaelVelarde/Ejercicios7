package bridge;

final class Client {

	public static void main(String[] args) {
		PlazoFijo plazoFijo = new PlazoFijo();
		Banco banco = new Banco(plazoFijo);
		banco.cuentaEnBoliviano(1000);
		banco.cuentaEnDolar(100);
		banco.cuentaEnEuro(100);
		
		Ahorro ahorro = new Ahorro();
		Banco banco1 = new Banco(ahorro);
		banco1.cuentaEnBoliviano(1000);
		banco1.cuentaEnDolar(100);
		banco1.cuentaEnEuro(100);
		
		Credito credito = new Credito();
		Banco banco2 = new Banco(credito);
		banco2.cuentaEnBoliviano(1000);
		banco2.cuentaEnDolar(100);
		banco2.cuentaEnEuro(100);
	}

}
