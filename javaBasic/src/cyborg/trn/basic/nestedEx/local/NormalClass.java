package cyborg.trn.basic.nestedEx.local;

public class NormalClass {
	public void exampleLocal(){
		
		//Local Class
		class LocalClass{
			public void print(){
				System.out.println("NormalClass.exampleLocal.LocalClass.print");
			}
		}
		
		LocalClass localClass = new LocalClass();
		localClass.print();
	}
}
