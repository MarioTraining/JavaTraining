package cyborg.trn.basic.oobjects;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] intArray1;
		String [] strArray1;
		
		int [] intArray2 = {9,8,7,6,5,4,3,2,1};
		String [] strArray2 = {"uno", "dos", "tres", "cuatro", "cinco"};
		
		intArray1 = new int[5];
		intArray1[0] = 1;
		intArray1[1] = 2;
		intArray1[2] = 3;
		intArray1[3] = 4;
		intArray1[4] = 5;
		
		strArray1 = new String[5];
		strArray1[0] = "uno";
		strArray1[1] = "dos";
		strArray1[2] = "tres";
		strArray1[3] = "cuatro";
		strArray1[4] = "cinco";
		
		for(int i : intArray1){
			System.out.println(i);
		}
		
		for(int j : intArray2){
			System.out.println(j);
		}
		
		for(String s : strArray1){
			System.out.println(s);
		}

		for(String t : strArray2){
			System.out.println(t);
		}
				
	}

}
