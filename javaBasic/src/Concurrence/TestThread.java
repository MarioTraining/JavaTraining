package Concurrence;

public class TestThread {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*//Example without share data
		ThreadClass threadClass1 = new ThreadClass("thread 1");
		ThreadClass threadClass2 = new ThreadClass("thread 2");	
		
		Thread t1 = new Thread(threadClass1);
		Thread t2 = new Thread(threadClass2);
		
		t1.start();
		t2.start();
		*/
		/*//Example share data
		ThreadClass threadClass1 = new ThreadClass("thread 1");	
		Thread t1 = new Thread(threadClass1);
		Thread t2 = new Thread(threadClass1);
		
		t1.start();
		t2.start();
		*/	
		
		ThreadClass threadClass1 = new ThreadClass("thread 1");
		ThreadClass threadClass2 = new ThreadClass("thread 2");	
		
		Thread t1 = new Thread(threadClass1);
		Thread t2 = new Thread(threadClass2);
		
		t1.start();
		t2.start();		
	}

}
