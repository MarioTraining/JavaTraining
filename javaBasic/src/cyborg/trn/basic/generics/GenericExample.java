package cyborg.trn.basic.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	
	public void exampleGeneric(){

		/**
		 * Los generics son una mejora al sistema de tipos que nos permite programar abstrayéndonos de los tipos de datos.
		 * Podemos especificar el tipo de objeto que introduciremos en la colección, de forma que el compilador 
		 * conozca el tipo de objeto que vamos a utilizar, evitándonos así el casting
		 */
		List<String> lista = new ArrayList<String>();
		lista.add("test");
		
		String cadena = lista.get(0);
		System.out.println("Cadena:" + cadena);
		
		
		/**
		 * Algo a tener en cuenta es que el tipo parámetro debe ser una clase; no podemos utilizar tipos primitivos. 
		 * Esto, sin embargo, no es ningún problema gracias a las características de autoboxing y unboxing de Java 5. 
		 */
		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(4); //Autoboxing
		
		int numero = lista2.get(0);
		System.out.println("numero:" + numero);	//Unboxing
	}
}
