package mx.com.bytebank.test;

import mx.com.bytebank.modelo.*;


public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario diego = new Contador(); 
		 diego.setSalario(2000);
		 Gerente jimena = new Gerente();
		 jimena.setSalario(10000);
		 Contador alexis = new Contador();
		 alexis.setSalario(5000);
		 
		 ControlBonificacion bonificacion = new ControlBonificacion();
		 bonificacion.registrarSalario(diego);
		 bonificacion.registrarSalario(jimena);
		 bonificacion.registrarSalario(alexis);
		 
	}
}
