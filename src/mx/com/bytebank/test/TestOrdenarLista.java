package mx.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mx.com.bytebank.modelo.*;

public class TestOrdenarLista {
	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(22, 33);
		Cliente clienteCC1 = new Cliente();
		cc1.setTitular(clienteCC1);
		clienteCC1.setNombre("Diego");
		cc1.depositar(333.0);
		
		Cuenta cc2 = new CuentaAhorros(22, 44);
		Cliente clienteCC2 = new Cliente();
		cc2.setTitular(clienteCC2);
		clienteCC2.setNombre("Renato");
		
		cc2.depositar(444.0);
		
		Cuenta cc3 = new CuentaCorriente(22, 11);
		Cliente clienteCC3 = new Cliente();
		cc3.setTitular(clienteCC3);
		clienteCC3.setNombre("Liam");
		cc3.depositar(111.0);
		
		Cuenta cc4 = new CuentaAhorros(22, 122);
		Cliente clienteCC4 = new Cliente();
		cc4.setTitular(clienteCC4);
		clienteCC4.setNombre("Noel88");
		cc4.depositar(222.0);
		
		List< Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		System.out.println("Antes de usar el método para ordenas ");
		for(Cuenta cuenta : lista){
			System.out.println(cuenta);
		}
		
		/**Ordenar las cuentas 
		 *             cualquier clase hija de Cuenta
		 *  Comparator< ? extend Cuenta>*
		 */
		//Comparator<Cuenta> comparador = new OrdenadorPorNumeroDeCuenta() ;
		lista.sort(new OrdenadorPorNumeroDeCuenta());
		lista.sort(new Comparator<Cuenta>(){

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
			
				return Integer.compare(o1.getAgencia(), o2.getNumero());
			}
			
		});
		
		
		
		System.out.println("Después	 de usar el método para ordenas ");
		for(Cuenta cuenta : lista){
			System.out.println(cuenta);
		}

		Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
		lista.sort(comparatorNombreTitular);
		System.out.println("Después de ordenar ");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		/*ordenamiento de listas antes de java1.8
		 * el segundo parametro es para que le digamos como va ordenar */
		Collections.sort(lista,new OrdenadorPorNombreTitular());
		/*
		 * no compila por que deebos dar un orden natual con el cual vamso a ordenar 
		 * y para pode rhacer eso debemos implementar las interface "Comparable<>y asigar la clase que 
		 * vamos a comparar en esta caso cuanta y al mismo tiempo implemetar 
		 * el método "compareTo()"*/
		Collections.sort(lista);
	
		
		
	}

}
/**
 * en esta clase la usamos para darle un orden a nuestra lista 
 * hacemso uso de la interface Comparator que al mismo tiempo 
 * implementamos el método compare pra sobre escribirlo y hacer la comparación que querramos 
 * 
 */
class OrdenadorPorNumeroDeCuenta implements Comparator<Cuenta>{

	@Override
	/**
	 * como regresa un tipo netero podmeos usar las 
	 * clases wrapper para hacer esa comparación yq ue no diga que retorna 
	 * 0 son iguales 
	 * 1 el pirmer arguento es mayoy als segundo 
	 * -1 el sedgundo es mayor al rimero 
	 */
	public int compare(Cuenta o1, Cuenta o2) {
		//Forma básica
		/*if(o1.getNumero() == o2.getNumero()) {
			return 0;
		}else if(o1.getNumero() > o2.getNumero()) {
			return 1;
		}else {
			return -1;
		}*/
		//forma intermedia 
		//return o1.getNumero - o2.getNumero;
		//Froma Wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
	
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
	}
	 
}
