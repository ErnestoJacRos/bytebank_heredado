package mx.com.bytebank.test;

import mx.com.bytebank.modelo.CuentaAhorros;

public class TestString {
	public static void main(String[] args) {
		//El String por naturaleza es inmutable 
		String nombre = "Alura";
		System.out.println("Antes del replace: " + nombre);
		/*
		 * el string esw inmutable así que nace y muere d ela misma forma 
		 * por eso reasiganamos otra vez el valor d ela variable cuando usamos 
		 * cualquier métod de String que modifique al string y asi crear un nuevo objeto String
		 */
		nombre = nombre.replace("A", "@");
		nombre = nombre.concat(" cursos online");
		nombre = nombre.toUpperCase();
		nombre = nombre.toLowerCase();
		 char letra = nombre.charAt(3);
		 int indice = nombre.indexOf("e");
		print("Después del replace: " + nombre);
		print("La letra del indice proporcionada es: " + letra);
		print("Indice del caracter que hemos proporcionada: " + indice);
		String sub = nombre.substring(1);
		print("Método substringn:  " + sub);
		print("Sara desde método print");
		print("Numero desde el método print: " + 45);
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("Sara");
		sb.append(" Contadora");
		System.out.println(sb);
		
		for(int i = 0; i< nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		print(new CuentaAhorros(45, 45));
		
		
	}
	public static void print(Object valor) {
		System.out.println(valor.toString());
	}

}
