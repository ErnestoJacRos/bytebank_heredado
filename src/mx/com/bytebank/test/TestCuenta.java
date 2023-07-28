package mx.com.bytebank.test;

import mx.com.bytebank.modelo.CuentaAhorros;
import mx.com.bytebank.modelo.CuentaCorriente;

public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente corriente = null;
		int num = 0;
		int resl =  30 /num;
		CuentaAhorros ahorros = new CuentaAhorros(2, 3);
		corriente.depositar(2000);
		corriente.transferir(1000, ahorros);
		System.out.println("Saldo de cuenta corriente: " + corriente.getSaldo());
		System.out.println("Saldo de cuenta ahorros: " + ahorros.getSaldo());
		
		
	}
}
 