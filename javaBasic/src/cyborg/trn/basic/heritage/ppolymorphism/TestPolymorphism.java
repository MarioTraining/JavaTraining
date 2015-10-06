package cyborg.trn.basic.heritage.ppolymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		moveAnimal(animal);
		
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
