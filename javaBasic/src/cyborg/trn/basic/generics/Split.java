package cyborg.trn.basic.generics;

public class Split <T extends Number>{
	
	/**
	 * Generics -Llimitar los tipos con los que se puede parametrizar nuestra clase
	 */
	private T number;
	
	public Split(T number){
		this.number = number;
	}
	
	public void divide(){
		System.out.println(number.doubleValue()/2);
	}
}
