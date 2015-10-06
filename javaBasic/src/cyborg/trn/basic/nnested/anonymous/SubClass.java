package cyborg.trn.basic.nnested.anonymous;

public class SubClass {
	public void exampleAnonymus(){
		SuperClass superClass = new SuperClass(){
			public void print(){
				System.out.println("SubClass.SuperClass.print");
			};
		};
		
		superClass.print();
	}
}
