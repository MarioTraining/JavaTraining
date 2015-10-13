package cyborg.trn.basic.nestedEx.inner;

public class OuterClassTest {

	public static void main(String[] args) {
		System.out.println("Main");
		
		//Static Nested Class Instance
		OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
		
		staticNestedClass.print();
		
		
		//Inner Class Instance
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		
		innerClass.print();
	}

}
