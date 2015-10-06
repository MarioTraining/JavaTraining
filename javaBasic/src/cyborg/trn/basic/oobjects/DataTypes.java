package cyborg.trn.basic.oobjects;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 5, p = 0;
		short s = 10;
		char c = 'a';
		float h = 0;

		System.out.println("k:" + k);
		System.out.println("p:" + p);
		System.out.println("s:" + s);
		System.out.println("c:" + c);
		System.out.println("h:" + h);		
		
		p = c;
		h = k;
		k = s;
		
		System.out.println("p:" + p);
		System.out.println("h:" + h);
		System.out.println("k:" + k);
	}

}
