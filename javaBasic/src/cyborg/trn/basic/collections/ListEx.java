package cyborg.trn.basic.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.List;

public class ListEx {
	
	
	public void testArrayList(){
		/*
		 * Beneficio al momento de realizar busquedas.
		 */		
		System.out.println("-----> TestArrayList");
		
		List<String> arrayList = new ArrayList<String>(); ;
		
		arrayList = addObjects(arrayList);
		System.out.println("ArrayList - addObjects:" + arrayList);
		System.out.println("ArrayList - size:" + arrayList.size());		
		
		arrayList = removeObjects(arrayList);
		System.out.println("ArrayList - removeObjects:" + arrayList);		
		System.out.println("ArrayList - size:" + arrayList.size());
		
		iterateObjects(arrayList);
		System.out.println("ArrayList - size:" + arrayList.size());	
		
		arrayList.clear();
		System.out.println("ArrayList - size:" + arrayList.size());		
	}
	
	
	public void testLinkedList(){
		/*
		 * Beneficio al momemto de insertar o borrar debido a que la lista la enlaza y en tiempo es menor que el ArrayList
		 */
		System.out.println("-----> TestLinkedList");
		
		List<String> linkedList = new LinkedList<String>();
		
		linkedList = addObjects(linkedList);
		System.out.println("LinkedList - addObjects:" + linkedList);
		System.out.println("LinkedList - size:" + linkedList.size());		
		
		linkedList = removeObjects(linkedList);
		System.out.println("LinkedList - removeObjects:" + linkedList);		
		System.out.println("LinkedList - size:" + linkedList.size());
		
		iterateObjects(linkedList);
		System.out.println("LinkedList - size:" + linkedList.size());	
		
		linkedList.clear();
		System.out.println("LinkedList - size:" + linkedList.size());				
	}
	
	
	public void testVector(){
		/*
		 * Es sincronizado cuando se trabaja con hilos. Crece su tamaño al doble
		 */
		System.out.println("-----> TestVector");
		
		List<String> vector = new Vector<String>();

		vector = addObjects(vector);
		System.out.println("Vector - addObjects:" + vector);
		System.out.println("Vector - size:" + vector.size());		
		
		vector = removeObjects(vector);
		System.out.println("Vector - removeObjects:" + vector);		
		System.out.println("Vector - size:" + vector.size());
		
		iterateObjects(vector);
		System.out.println("Vector - size:" + vector.size());	
		
		vector.clear();
		System.out.println("Vector - size:" + vector.size());			
	}
	
	public void testStack(){
		/*
		 * 
		 */
		System.out.println("-----> TestStack");
		
		List<String> stack = new Stack<String>();

		stack = addObjects(stack);
		System.out.println("Stack - addObjects:" + stack);
		System.out.println("Stack - size:" + stack.size());		
		
		stack = removeObjects(stack);
		System.out.println("Stack - removeObjects:" + stack);		
		System.out.println("Stack - size:" + stack.size());
		
		iterateObjects(stack);
		System.out.println("Stack - size:" + stack.size());	
		
		stack.clear();
		System.out.println("Stack - size:" + stack.size());			
	}
	
	private List<String> addObjects(List<String> genericList){
		
		for(int i=0; i < 50; i++){
			genericList.add("Object " + i);			
		}
		
		return genericList;
	}
	
	private List<String> removeObjects(List<String> genericList){
		int total = genericList.size();
		int deleted = 0;
		
		if(!genericList.isEmpty()){
			for(int i=0; i < total-deleted; i = i + 5){
				genericList.remove(i);
				deleted++;
			}
		}
		
		return genericList;
	}
	
	private void iterateObjects(List<String> genericList){
		Iterator<String> iterator = genericList.iterator();
		
		while(iterator.hasNext()){
			System.out.println("Iterator" + iterator.next());
		}
		
	}
	
}
