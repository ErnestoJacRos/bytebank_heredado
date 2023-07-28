package mx.com.bytebank.modelo;

public class TestCuentaExceptionCuenta {
	public static void main(String[] args) {
		Cuenta ca = new CuentaAhorros(123, 456);
		ca.depositar(210);
		try {
			ca.retirar(210);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
