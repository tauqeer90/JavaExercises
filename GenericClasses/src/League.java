import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class League<T extends Team> {
	
	private List<Team> teamList = new ArrayList<>();
	
	public League(T team) {
		teamList.add(team);
	}
	
	public void addTeam(T team) {
		for (int i = 0; i< teamList.size() ; i++) {
			if(teamList.get(i).compareTo(team) <= 0) {
				teamList.add(i, team);
				return;
			}
		}
		
		teamList.add(team);
	}
	
	public Iterator<Team> getIterator() {
		return teamList.iterator();
	}
	
}
