package cyborg.trn.basic.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	
	public void exampleGeneric(){

		/**
		 * Los generics son una mejora al sistema de tipos que nos permite programar abstray�ndonos de los tipos de datos.
		 * Podemos especificar el tipo de objeto que introduciremos en la colecci�n, de forma que el compilador 
		 * conozca el tipo de objeto que vamos a utilizar, evit�ndonos as� el casting
		 */
		List<String> lista = new ArrayList<String>();
		lista.add("test");
		
		String cadena = lista.get(0);
		System.out.println("Cadena:" + cadena);
		
		
		/**
		 * Algo a tener en cuenta es que el tipo par�metro debe ser una clase; no podemos utilizar tipos primitivos. 
		 * Esto, sin embargo, no es ning�n problema gracias a las caracter�sticas de autoboxing y unboxing de Java 5. 
		 */
		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(4); //Autoboxing
		
		int numero = lista2.get(0);
		System.out.println("numero:" + numero);	//Unboxing
	}
}
