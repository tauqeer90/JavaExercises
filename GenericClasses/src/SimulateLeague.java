import java.util.Iterator;

public class SimulateLeague {
	
	public static void main(String[] args) {
		League<FootballTeam> epl= new League<>(new FootballTeam("Liverpool" , 31 , 2 ,5));
		epl.addTeam(new FootballTeam("ManchesterUnited", 0, 25, 13));
		epl.addTeam(new FootballTeam("Arsenal", 20, 10, 8));
		epl.addTeam(new FootballTeam("Chelsea", 22, 10, 6));
		
		Iterator<Team> eplIterator = epl.getIterator();
		
		Team iteratedTeam;
		while(eplIterator.hasNext()) {
			iteratedTeam =  eplIterator.next() ;
			System.out.println(iteratedTeam.getTeamName() + " Points: " + iteratedTeam.getTeamPoints());
		}
	}
}
