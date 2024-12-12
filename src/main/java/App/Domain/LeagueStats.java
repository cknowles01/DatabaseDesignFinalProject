package App.Domain;

public class LeagueStats {
    private int StatID;
    private int SeasonYear;
    private int TotalGames;
    private int TotalPoints;
    private int TotalPenalties;

    // Getter and Setter for StatID
    public int getStatID() {
        return StatID;
    }

    public void setStatID(int statID) {
        this.StatID = statID;
    }

    // Getter and Setter for SeasonYear
    public int getSeasonYear() {
        return SeasonYear;
    }

    public void setSeasonYear(int seasonYear) {
        this.SeasonYear = seasonYear;
    }

    // Getter and Setter for TotalGames
    public int getTotalGames() {
        return TotalGames;
    }

    public void setTotalGames(int totalGames) {
        this.TotalGames = totalGames;
    }

    // Getter and Setter for TotalPoints
    public int getTotalPoints() {
        return TotalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.TotalPoints = totalPoints;
    }

    // Getter and Setter for TotalPenalties
    public int getTotalPenalties() {
        return TotalPenalties;
    }

    public void setTotalPenalties(int totalPenalties) {
        this.TotalPenalties = totalPenalties;
    }
}


