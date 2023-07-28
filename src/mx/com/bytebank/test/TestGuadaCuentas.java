package mx.com.bytebank.test;

import mx.com.bytebank.modelo.*;

public class TestGuadaCuentas {
	public static void main(String[] args) {
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		
		Cuenta  cc = new CuentaCorriente(45, 45);
		Cuenta cc2 = new CuentaCorriente(4, 4);
		Cuenta cc3 = new CuentaCorriente(5, 5);
		guardaCuentas.adicionar(cc);
		guardaCuentas.adicionar(cc2);
		guardaCuentas.adicionar(cc3);
		System.out.println(guardaCuentas.obtener(0));
		System.out.println(guardaCuentas.obtener(1));
		System.out.println(guardaCuentas.obtener(2));
		
		
	}

}
