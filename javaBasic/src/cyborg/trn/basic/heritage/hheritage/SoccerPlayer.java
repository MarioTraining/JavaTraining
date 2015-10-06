package cyborg.trn.basic.heritage.hheritage;

public class SoccerPlayer extends FutbolSelection{
	private int dorsal;
	private String position;
	
	public SoccerPlayer(){
		super();
	}
	public SoccerPlayer(int id, String name, String lastName, int age, int dorsal, String position){
		super(id, name, lastName, age);
		this.dorsal = dorsal;
		this.position = position;
	}
	
	
	public void playGame(){
		System.out.println("SoccerPlayer.playGame: " + super.getId() + " " + super.getName() + " " + super.getLastName());
	}
	public void trining(){
		System.out.println("SoccerPlayer.trining: " + super.getId() + " " + super.getName() + " " + super.getLastName());		
	}
	
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
