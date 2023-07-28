package mx.com.bytebank.test;

import mx.com.bytebank.modelo.CalculadoraDeImpuesto;
import mx.com.bytebank.modelo.CuentaCorriente;
import mx.com.bytebank.modelo.SeguroDeVida;

public class TestTributacion {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(222, 333);
		cc.depositar(100.0);
		SeguroDeVida deVida = new SeguroDeVida();
		CalculadoraDeImpuesto calculadoraDeImpuesto = new CalculadoraDeImpuesto();
		
		calculadoraDeImpuesto.registra(cc);
		calculadoraDeImpuesto.registra(deVida);
		System.out.println(calculadoraDeImpuesto.getTotalImpuesto());
		
		 
	}

}
