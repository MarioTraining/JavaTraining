package cyborg.trn.basic.collections;

import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx {

	public void testPriorityQueue(){
		
		/**
		 * Es la implementación de una cola con orden de prioridad, los elementos no están ordenados, 
		 * garantiza eliminar de acuerdo a  orden pero no sigue un orden al recorrerlo
		 */
		Queue<String> priorityQueue = new PriorityQueue<String>();
		
		priorityQueue.add("one");
		priorityQueue.add("two");
		priorityQueue.add("three");
		priorityQueue.add("four");
		priorityQueue.add("five");
		
		System.out.println("priorityQueue.size:" + priorityQueue.size());
		System.out.println("priorityQueue:" + priorityQueue.toString());
		
		System.out.println("Element: " + priorityQueue.element());//Desencola elemento sin eliminarlo, si no existe, lanza NoSuchElementException.		
		System.out.println("priorityQueue.sixe:" + priorityQueue.size());
		System.out.println("priorityQueue:" + priorityQueue.toString());

		System.out.println("Remove: " + priorityQueue.remove()); // desencola y retorna un elemento si existe; si no existe, lanza NoSuchElementException -	
		System.out.println("priorityQueue.size:" + priorityQueue.size());
		System.out.println("priorityQueue:" + priorityQueue.toString());
		
		System.out.println("Peek: " + priorityQueue.peek());//Desencola elemento sin eliminarlo, si no existe, retorna null.			
		System.out.println("priorityQueue.size:" + priorityQueue.size());
		System.out.println("priorityQueue:" + priorityQueue.toString());

		System.out.println("Poll: " + priorityQueue.poll()); // desencola y retorna un elemento si existe; si no existe, retorna null.		
		System.out.println("priorityQueue.size:" + priorityQueue.size());
		System.out.println("priorityQueue:" + priorityQueue.toString());
		
		priorityQueue.add("six");
		System.out.println("priorityQueue.size:" + priorityQueue.size());
		System.out.println("priorityQueue:" + priorityQueue.toString());		
	}
	
	public void testArrayDeque(){
		/**
		 * Es similar a la clase LinkedList pero tiene un mejor desempeño debido a un comportamiento FIFO, 
		 * ideal para implementas pilas.
		 */
		Queue<String> arrayDeque = new ArrayDeque<String>();
		
		arrayDeque.add("one");
		arrayDeque.add("two");
		arrayDeque.add("three");
		arrayDeque.add("four");
		arrayDeque.add("five");
		
		System.out.println("arrayDeque.size:" + arrayDeque.size());
		System.out.println("arrayDeque:" + arrayDeque.toString());
		
		System.out.println("Element: " + arrayDeque.element());//Desencola elemento sin eliminarlo, si no existe, lanza NoSuchElementException.		
		System.out.println("arrayDeque.size:" + arrayDeque.size());
		System.out.println("arrayDeque:" + arrayDeque.toString());

		System.out.println("Remove: " + arrayDeque.remove()); // desencola y retorna un elemento si existe; si no existe, lanza NoSuchElementException -	
		System.out.println("arrayDeque.size:" + arrayDeque.size());
		System.out.println("arrayDeque:" + arrayDeque.toString());
		
		System.out.println("Peek: " + arrayDeque.peek());//Desencola elemento sin eliminarlo, si no existe, retorna null.			
		System.out.println("arrayDeque.size:" + arrayDeque.size());
		System.out.println("arrayDeque:" + arrayDeque.toString());

		System.out.println("Poll: " + arrayDeque.poll()); // desencola y retorna un elemento si existe; si no existe, retorna null.		
		System.out.println("arrayDeque.size:" + arrayDeque.size());
		System.out.println("arrayDeque:" + arrayDeque.toString());
		
		arrayDeque.add("six");
		System.out.println("arrayDeque.size:" + arrayDeque.size());
		System.out.println("arrayDeque:" + arrayDeque.toString());				
	}
}
