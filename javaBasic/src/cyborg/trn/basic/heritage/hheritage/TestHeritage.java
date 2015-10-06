package cyborg.trn.basic.heritage.hheritage;

import java.util.ArrayList;

public class TestHeritage {

	public static ArrayList<FutbolSelection> members = new ArrayList<FutbolSelection>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coach delBosque = new Coach(1, "Vicente", "Del Bosque", 60, "284EZ89");
		SoccerPlayer iniesta = new SoccerPlayer(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		
		members.add(delBosque);
		members.add(iniesta);
		
		
		System.out.println("");
		for(FutbolSelection member : members){
			System.out.println(member.getName() + " " + member.getLastName());	
			member.concentrate();
			member.travel();
		}
		
		delBosque.manageGame();
		delBosque.manageTraining();
		iniesta.playGame();
		iniesta.trining();
		
	}

}
