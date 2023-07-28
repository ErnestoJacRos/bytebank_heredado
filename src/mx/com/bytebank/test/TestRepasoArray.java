package mx.com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {

	public static void main(String[] args) {
		//todo arreglo nace con un tamaño fijo 
		int[]arreglo = new int[10];
		//Lista 
		//tienen tamaña dinámico 
		List <Integer>lista = new ArrayList<Integer>();
		int numero = 40;
		Integer numeroObjeto = new Integer(40); 
		
		lista.add(numero);//autoboxing
		//sigue aceptando a un privimitivo en este caso la variable numero porque 
		//java está haciendo un autoboxing 
		//una forma de pasar de un primitivo a un Integr o su clase wrapper usamos 
		int numeroDos =  Integer.valueOf(45); // esto es autoboxing
		lista.add(numeroObjeto);
		//para hacer unboxing 
		//estamos haciendo que s ecomvierta en un primitivo int 
		int valorPrimitivo = numeroObjeto.intValue();
		
		System.out.println("esto contine el arrayList: " + lista.get(0));
		for(Integer numer: lista) {
			System.out.println("Numeros guardados en el ArraysList: " + numer);
		}
		
	}
}
