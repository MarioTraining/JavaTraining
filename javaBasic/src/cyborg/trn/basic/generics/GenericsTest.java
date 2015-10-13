package cyborg.trn.basic.generics;



public class GenericsTest {

	public static void main(String[] args) {
		
		testGenericExample();
		testPrinter();
		testSplit();
	}

	public static void testGenericExample(){
		GenericExample genericExample = new GenericExample();		
		genericExample.exampleGeneric();		
	}
	
	public static void testPrinter(){
		Printer<String> printer = new Printer<String>("Test print");
		
		System.out.println(printer.toString());
	}
	
	public static void testSplit(){
		Split<Integer> split = new Split<Integer>(5);
		
		split.divide();
	}
}
