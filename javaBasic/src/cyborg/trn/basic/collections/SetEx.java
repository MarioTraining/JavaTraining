package cyborg.trn.basic.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetEx {

	
	public void testHashSet(){
		/*
		 * Rapida, no permite duplicados. No tiene metodos de ordenacion.
		 * Este tipo de coleccion puede ser usado cuando quieres tener una lista única de objetos
		 */
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		
		System.out.println("HashSet.size:" +hashSet.size());
		System.out.println("HashSet:" + hashSet.toString());
		
		if(hashSet.contains("two")){
			System.out.println("Object exists");
		}
		
		hashSet.add("one");//try to insert duplicate
		System.out.println("HashSet.size:" +hashSet.size());
		System.out.println("HashSet:" + hashSet.toString());
		
		hashSet.remove("two");
		System.out.println("HashSet.size:" +hashSet.size());
		System.out.println("HashSet:" + hashSet.toString());
		
		hashSet.add("four");
		hashSet.add("four 2");
		System.out.println("HashSet.size:" +hashSet.size());
		System.out.println("HashSet:" + hashSet.toString());

		hashSet.remove("three");
		System.out.println("HashSet.size:" +hashSet.size());
		System.out.println("HashSet:" + hashSet.toString());
		
		hashSet.add("five");
		hashSet.add("five 2");
		System.out.println("HashSet.size:" +hashSet.size());
		System.out.println("HashSet:" + hashSet.toString());
		
		hashSet.add("six");
		System.out.println("HashSet.size:" +hashSet.size());
		System.out.println("HashSet:" + hashSet.toString());		
	}
	
	public void testLinkedHashSet(){
		/*
		 * Ordenacion de elementos por odren de entrada (LIFO). Mal rendimiento a la hora de añadir elementos.
		 */
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");		
		
		System.out.println("LinkedHashSet.size:" +linkedHashSet.size());
		System.out.println("LinkedHashSet:" + linkedHashSet.toString());
		
		if(linkedHashSet.contains("two")){
			System.out.println("Object exists");
		}
		
		linkedHashSet.add("one");//try to insert duplicate
		System.out.println("LinkedHashSet.size:" + linkedHashSet.size());
		System.out.println("LinkedHashSet:" + linkedHashSet.toString());
		
		linkedHashSet.remove("two");
		System.out.println("LinkedHashSet.size:" + linkedHashSet.size());
		System.out.println("LinkedHashSet:" + linkedHashSet.toString());
		
		linkedHashSet.add("four");
		linkedHashSet.add("four 2");
		System.out.println("LinkedHashSet.size:" + linkedHashSet.size());
		System.out.println("LinkedHashSet:" + linkedHashSet.toString());

		linkedHashSet.remove("three");
		System.out.println("LinkedHashSet.size:" + linkedHashSet.size());
		System.out.println("LinkedHashSet:" + linkedHashSet.toString());
		
		linkedHashSet.add("five");
		linkedHashSet.add("five 2");
		System.out.println("LinkedHashSet.size:" + linkedHashSet.size());
		System.out.println("LinkedHashSet:" + linkedHashSet.toString());
		
		linkedHashSet.add("six");
		System.out.println("LinkedHashSet.size:" + linkedHashSet.size());
		System.out.println("LinkedHashSet:" + linkedHashSet.toString());		
	}
	
	public void testTreeSet(){
		/*
		 * Incluye implementacion de arbol rojo-negro. El rendimiento es peor que un HashSet. Utilizarlo solo si es necesario
		 * un Set con metodos de ordenacion especifico, cuidado con los inserts.
		 */
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");		
		
		System.out.println("TreeSet.size:" +treeSet.size());
		System.out.println("TreeSet:" + treeSet.toString());
		
		if(treeSet.contains("two")){
			System.out.println("Object exists");
		}
		
		treeSet.add("one");//try to insert duplicate
		System.out.println("TreeSet.size:" + treeSet.size());
		System.out.println("TreeSet:" + treeSet.toString());
		
		treeSet.remove("two");
		System.out.println("TreeSet.size:" + treeSet.size());
		System.out.println("TreeSet:" + treeSet.toString());
		
		treeSet.add("four");
		treeSet.add("four 2");
		System.out.println("TreeSet.size:" + treeSet.size());
		System.out.println("TreeSet:" + treeSet.toString());

		treeSet.remove("three");
		System.out.println("TreeSet.size:" + treeSet.size());
		System.out.println("TreeSet:" + treeSet.toString());
		
		treeSet.add("five");
		treeSet.add("five 2");
		System.out.println("TreeSet.size:" + treeSet.size());
		System.out.println("TreeSet:" + treeSet.toString());
		
		treeSet.add("six");
		System.out.println("TreeSet.size:" + treeSet.size());
		System.out.println("TreeSet:" + treeSet.toString());		
		
	}
}
