package cyborg.trn.basic.collections;

public class CollectionsTest {

	public static void main(String[] args) {			

		//testList(); // Test List
		//testSet(); // Test set
		//testQueue(); // Test Queue
		//testMap(); // Test Map
	}
	
	public static void testMap(){
		MapEx mapEx = new MapEx();
		
		mapEx.testHashMap();
		mapEx.testLinkedHashMap();
		mapEx.testTreeMap();
	}
	
	public static void testQueue(){
		QueueEx queueEx = new QueueEx();
		
		queueEx.testPriorityQueue();
		queueEx.testArrayDeque();
	}
	
	public static void testSet(){
		SetEx setEx = new SetEx();
		
		setEx.testHashSet();
		setEx.testLinkedHashSet();
		setEx.testTreeSet();//
	}
	
	public static void testList(){
		ListEx listEx = new ListEx();
		
		listEx.testArrayList();
		listEx.testLinkedList();
		listEx.testVector();
		listEx.testStack();		
	}

}
