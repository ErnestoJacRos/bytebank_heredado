package mx.com.bytebank.test;

import mx.com.bytebank.modelo.*;

public class TestArregloReferencias {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		/**
		 * hacemos un arreglo de la clase padre para que 
		 * podemos tener referefencias de clases hijas 
		 */
		Object[] referencias = new Object[5];
		referencias[1] = cc;
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		CuentaAhorros ca = new CuentaAhorros(44, 45);
		referencias[3] = ca;
		System.out.println(referencias[3]);
		System.out.println(cc);
		System.out.println(referencias[1]);
		referencias[0] =  new CuentaCorriente(11, 99);
		System.out.println(referencias[0]);
		
		//Hacemos Cast
		//lo hacemos porque le estamos asignando una claspadre a una clase hija 
		//entonces paar qeu pueda ser hacemos el cast para que esta cuenta seha del tipo d ela hija 
		CuentaCorriente corriente = (CuentaCorriente)referencias[1];
		System.out.println("Cuenta corriente: " + corriente);
		System.err.println();
		System.err.println();
		System.out.println("=== Impresión con for de referencias====");
		
		for(int i = 0; i< referencias.length; i++) {
			System.out.println(referencias[i]);
		}
		
	}

}
