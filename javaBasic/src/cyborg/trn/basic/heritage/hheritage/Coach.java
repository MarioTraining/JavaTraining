package cyborg.trn.basic.heritage.hheritage;

public class Coach extends FutbolSelection{
	private String idFederation;
	
	
	public Coach(){
		super();
	}
	public Coach(int id, String name, String lastName, int age, String idFederation){
		super(id, name, lastName, age);
		this.idFederation = idFederation;
	}
	
	public void manageGame(){
		System.out.println("Coach.manageGame: " + super.getId() + " " + super.getName() + " " + super.getLastName());		
	}
	public void manageTraining(){
		System.out.println("Coach.manageTraining: " + super.getId() + " " + super.getName() + " " + super.getLastName());		
	}
	
	
	
	public String getIdFederation() {
		return idFederation;
	}
	public void setIdFederation(String idFederation) {
		this.idFederation = idFederation;
	}
}
