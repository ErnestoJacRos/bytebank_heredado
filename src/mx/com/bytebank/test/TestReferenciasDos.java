package mx.com.bytebank.test;
import mx.com.bytebank.modelo.*;

public class TestReferenciasDos {

	public static void main(String[] args) {
	
	GuardaReferencias guardaReferencias = new GuardaReferencias();
	Cuenta cc = new CuentaCorriente(11, 22);
	guardaReferencias.adicionar(cc);
	Cuenta cc2 = new CuentaCorriente(22, 44);
	guardaReferencias.adicionar(cc2);
	
	System.out.println(guardaReferencias.obtener(0));
	System.out.println(guardaReferencias.obtener(1));
	
	} 
}
