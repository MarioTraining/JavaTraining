package cyborg.trn.basic.heritage.interfaceEx;

public class Mammal extends Animal implements Carnivorous, Vertebrate{
	public void move(){
		System.out.println("I am a Mammal and I walking");
	}
	
	public void chew(){
		System.out.println("I am mammal and I chew");
	}
	
	public void hunt(String tool){
		System.out.println("I am mammal and I hunt with " + tool);
	}
}
