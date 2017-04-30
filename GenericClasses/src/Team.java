
public abstract class Team implements Comparable<Team>{
	private String teamName;
	private int wins;
	private int draws;
	private int losses;
	
	private static int WIN_POINTS = 3;
	private static int DRAW_POINTS = 1;
	private static int LOSS_POINTS = 0;
	
	public Team(String teamName, int wins, int draws, int losses) {
		this.teamName = teamName;
		this.wins = wins;
		this.draws = draws;
		this.losses = losses;
	}
	
	public int getTeamPoints() {
		return (wins * WIN_POINTS) + (draws*DRAW_POINTS) + (losses * LOSS_POINTS);
	}
	
	public String getTeamName() {
		return this.teamName;
	}
	
	/**
	 * Return 0 if two teams have same point
	 * -1 if the current team has lesser points than the team to be compared
	 * +1 if the current team has more points than the team to be compared
	 */
	@Override
	public int compareTo(Team o) {
		 return ((this.getTeamPoints() > o.getTeamPoints()) ? 1 : (this.getTeamPoints() < o.getTeamPoints()) ? -1 :0);
	}
}
