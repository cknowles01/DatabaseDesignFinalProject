package App.Domain;

public class Score {
    private int ScoreID;
    private int GameID;
    private String Team;
    private int Points;

    // Getter and Setter for ScoreID
    public int getScoreID() {
        return ScoreID;
    }

    public void setScoreID(int ScoreID) {
        this.ScoreID = ScoreID;
    }

    // Getter and Setter for GameID
    public int getGameID() {
        return GameID;
    }

    public void setGameID(int GameID) {
        this.GameID = GameID;
    }

    // Getter and Setter for Team
    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

    // Getter and Setter for Points
    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }
}
