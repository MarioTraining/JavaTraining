package cyborg.trn.basic.heritage.abstractEx;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird bird = new Bird();
		moveAnimal(bird);
		
		Fish fish = new Fish();
		moveAnimal(fish);
		
		Mammal mammal = new Mammal();
		moveAnimal(mammal);
		
	}
	
	public static void moveAnimal(Animal a){
		a.move();
	}	

}
