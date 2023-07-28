package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Administrador;
import mx.com.bytebank.modelo.Gerente;
import mx.com.bytebank.modelo.SistemaInterno;

public class TestSistemaInterno {
	
	public static void main(String[] args) {
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		Gerente gerente = new Gerente();
		Administrador administrador = new Administrador();
		
		gerente.setClave("AluraCursosOnLine");
		
		sistemaInterno.autenticar(gerente);
		sistemaInterno.autenticar(administrador);
	}

}
