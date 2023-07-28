package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Funcionario;
import mx.com.bytebank.modelo.Gerente;

public class TestReferencias {
	public static void main(String[] args) {
		//El elemento más generico puede ser adaptado 
		//al elemento más espacífico 
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
	}

}
