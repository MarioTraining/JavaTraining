package cyborg.trn.basic.heritage.interfaceEx;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mammal mammal = new Mammal();
		
		moveAnimal(mammal);
		
		mammal.chew();
		mammal.hunt("teeth");
	}

	public static void moveAnimal(Animal a){
		a.move();
	}	
}
