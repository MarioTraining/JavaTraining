package cyborg.trn.basic.nnested.inner;

public class OuterClass {
	public static class StaticNestedClass{
				
		public void print(){
			System.out.println("StaticNestedClass.print");			
		}

	}
	
	public class InnerClass{
		public void print(){
			System.out.println("InnerClass.print");
		}
	}
	

}
