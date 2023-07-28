package mx.com.bytebank.test;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import mx.com.bytebank.modelo.Cuenta;
import mx.com.bytebank.modelo.CuentaCorriente;

public class TestArraysList {

	public static void main(String[] args) {
		/**si no ponemos los parentesís en diamante en los arrayList serán del tipos más 
		 * genérico y si los ponemos ponemos poner dentro de que tipo será el arrayList 
		 * en esta caso Es Cuenta y solo aceptará de este tipo de objetos  */
		ArrayList<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(22, 44);
		Cuenta cc2 = new CuentaCorriente(11, 22);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		//aquí hacemso el casteo porque el arryList es del tipo object
		//y la varible que estamamos dreclarando es del tipo cuenta 
		//nececitamos castear loq ue vamos a asignar a mismni tipo d ela varibales 
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		System.out.println();
		System.out.println();
		System.out.println("===usado for para mostrar slos elelmentos de arrayList===");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		lista.remove(0);
		System.out.println("Usado foreach para mostrar el contenido de arrayList");
		for(Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		if(lista.contains(cc3)) {
			System.out.println("Si lo contine");
		}else {
			System.out.println("No lo contiene");
		}
		
		System.out.println("Ejecutando el método aquals");
		if(cc2.equals(cc3)){
			System.out.println("Sí, son iguales");
		}else {
			System.out.println("no la contien");
		}
		
	}
}
