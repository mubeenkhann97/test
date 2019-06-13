package assignmentRefactoring;

import java.awt.List;
import java.util.ArrayList;

public class Season {
	private final ArrayList<Game> games;
    public Season(ArrayList<Game> games) {
        this.games = new ArrayList<>(games);
    }
    public Season() {
        this.games = new ArrayList<>();
    }
    public void addGame(Game game) {
        games.add(game);
    }
    public void removeGame(Game game) {
        games.remove(game);
    }
    public ArrayList<Game> getGames() {
        return games;
    }
    public GoalieStatistics getGoalieStatistics() {
        return new GoalieStatistics(this);
    }
    
    public int getTotalGoalsAgainst() {
    	 int totalGoalsAgainst = 0;
        
         for (Game game: games) {
        	 totalGoalsAgainst += game.getGoalsAgainst();
            
         }
         return totalGoalsAgainst;
    }
    
    public double getTotalMinutesPlayed() {
    	double totalMinsPlayed = 0;
		for (Game game: games) {
            
            totalMinsPlayed  += game.getMinutesPlayed();
        }
    	return totalMinsPlayed;
    }
	public int getTotalShotsOnGoalAgainst() {
		int totalShotsOnGoalsAgainst = 0;
		// TODO Auto-generated method stub
		for (Game game: games) {
			totalShotsOnGoalsAgainst  += game.getShotsOnGoalAgainst();
        }
		return totalShotsOnGoalsAgainst;
	}

    
}

