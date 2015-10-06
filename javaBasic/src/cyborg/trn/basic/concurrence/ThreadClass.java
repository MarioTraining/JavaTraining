package cyborg.trn.basic.concurrence;

public class ThreadClass implements Runnable{

	String name;
	int data;
	
	public ThreadClass(String name){
		this.name = name;		
	}
	
	@Override
	public void run() {
		
		do{
			System.out.println("Hi! I am " + name + " and I am thread, My x = " + data);
			data = data + 1;
			if(data == 4){
				try{
					Thread.sleep(7000);
				}catch(Exception e){
					System.out.println(e);
				}
			}
		}while(data <= 10);
		
	}

}
