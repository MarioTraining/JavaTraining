package cyborg.trn.basic.heritage.hheritage;

public class FutbolSelection {
	protected int id;
	protected String name;
	protected String lastName;
	protected int age;
	
	public FutbolSelection(){
		
	}
	public FutbolSelection(int id, String name, String lastName, int age){
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	public void concentrate(){
		System.out.println("FutbolSelection.Concentrate: " + this.id + " " + this.name + " " + this.lastName);
	}
	public void travel(){
		System.out.println("FutbolSelection.Travel: " + this.id + " " + this.name + " " + this.lastName);		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
