package cyborg.trn.basic.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapEx {

	public void testHashMap(){
		/**
		 * Un mapa que almacena sus elementos en una tabla Hash, no hay orden en sus elementos
		 */
		System.out.println("........ HashMap");
		Map<Integer,String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(3, "three");
		hashMap.put(4, "four");
		hashMap.put(5, "five");
		
		System.out.println("HashMap.size:" + hashMap.size());
		System.out.println("HashMap:" + hashMap.toString());
		
		if(hashMap.containsKey(3)){
			System.out.println("HashMap.containsKey: 3");
		}
		if(hashMap.containsValue("four")){
			System.out.println("HashMap.containsValue: four");
		}	
		
		System.out.println("HashMap.get(2)" + hashMap.get(2));
		System.out.println("HashMap.get(5)" + hashMap.get(5));
		
		hashMap.remove(2);
		System.out.println("HashMap.size:" + hashMap.size());
		System.out.println("HashMap:" + hashMap.toString());
		
		hashMap.put(6, "six");
		System.out.println("HashMap.size:" + hashMap.size());
		System.out.println("HashMap:" + hashMap.toString());		
	}
	
	public void testLinkedHashMap(){
		/**
		 * Un mapa que almacena sus elementos en una tabla hash y una lista doblemente enlazada, 
		 * sus elementos se encuentran ordenados
		 */
		
		System.out.println("........ LinkedHashMap");
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1, "one");
		linkedHashMap.put(2, "two");
		linkedHashMap.put(3, "three");
		linkedHashMap.put(4, "four");
		linkedHashMap.put(5, "five");
		
		System.out.println("LinkedHashMap.size:" + linkedHashMap.size());
		System.out.println("LinkedHashMap:" + linkedHashMap.toString());
		
		if(linkedHashMap.containsKey(3)){
			System.out.println("LinkedHashMap.containsKey: 3");
		}
		if(linkedHashMap.containsValue("four")){
			System.out.println("LinkedHashMap.containsValue: four");
		}	
		
		System.out.println("LinkedHashMap.get(2)" + linkedHashMap.get(2));
		System.out.println("LinkedHashMap.get(5)" + linkedHashMap.get(5));
		
		linkedHashMap.remove(2);
		System.out.println("LinkedHashMap.size:" + linkedHashMap.size());
		System.out.println("LinkedHashMap:" + linkedHashMap.toString());
		
		linkedHashMap.put(6, "six");
		System.out.println("LinkedHashMap.size:" + linkedHashMap.size());
		System.out.println("LinkedHashMap:" + linkedHashMap.toString());		
	}
	
	public void testTreeMap(){
		/**
		 * Almacena sus datos en un árbol por lo que sus elementos se encuentran en orden natural
		 *  o de acuerdo a un orden definido por el usuario
		 */
		
		System.out.println("........ TreeMap");
		Map<Integer,String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "one");
		treeMap.put(2, "two");
		treeMap.put(3, "three");
		treeMap.put(4, "four");
		treeMap.put(5, "five");
		
		System.out.println("TreeMap.size:" + treeMap.size());
		System.out.println("TreeMap:" + treeMap.toString());
		
		if(treeMap.containsKey(3)){
			System.out.println("TreeMap.containsKey: 3");
		}
		if(treeMap.containsValue("four")){
			System.out.println("TreeMap.containsValue: four");
		}	
		
		System.out.println("TreeMap.get(2)" + treeMap.get(2));
		System.out.println("TreeMap.get(5)" + treeMap.get(5));
		
		treeMap.remove(2);
		System.out.println("TreeMap.size:" + treeMap.size());
		System.out.println("TreeMap:" + treeMap.toString());
		
		treeMap.put(6, "six");
		System.out.println("TreeMap.size:" + treeMap.size());
		System.out.println("TreeMap:" + treeMap.toString());		
	}
}
