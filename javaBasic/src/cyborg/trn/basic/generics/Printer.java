package cyborg.trn.basic.generics;

public class Printer<T> {
	/**
	 * Generics - Podemos crear nuestras propias clases parametrizadas
	 */
	private T object;
	
	public Printer(T object){
		this.object = object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "Printer [object=" + object + "]";
	}
	
}
