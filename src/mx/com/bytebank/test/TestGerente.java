package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Gerente;

public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());
		
	}
}
