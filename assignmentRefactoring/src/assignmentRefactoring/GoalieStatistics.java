package assignmentRefactoring;

import java.awt.List;
import java.util.ArrayList;

public class GoalieStatistics {
	private final Season season;
    public GoalieStatistics(Season season) {
        this.season = season;
    }
    public double getGoalsAgainstAverage() {
        if (season.getGames().isEmpty()) {
            return 0.0;
        }
        else {
            int totalGoalsAgainst = season.getTotalGoalsAgainst();
            double totalMinutesPlayed = season.getTotalMinutesPlayed();
            
            return (totalGoalsAgainst / totalMinutesPlayed) * 60;
        }
    }
    public double getSavePercentage() {
        if (season.getGames().isEmpty()) {
            return 0.0;
        }
        else {
            int totalGoals = season.getTotalGoalsAgainst();
            int totalSogAgainst = season.getTotalShotsOnGoalAgainst();
            
            return ((double) totalSogAgainst - totalGoals) / totalSogAgainst;
        }
    }
}
