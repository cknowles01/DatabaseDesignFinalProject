package App.Domain;

public class Play {
    private int PlayID;
    private int GameID;
    private String Description;
    private int Quarter;
    private String TimeRemaining;
    private int PenaltyID;

    // Getter and Setter for PlayID
    public int getPlayID() {
        return PlayID;
    }

    public void setPlayID(int playID) {
        this.PlayID = playID;
    }

    // Getter and Setter for GameID
    public int getGameID() {
        return GameID;
    }

    public void setGameID(int gameID) {
        this.GameID = gameID;
    }

    // Getter and Setter for Description
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    // Getter and Setter for Quarter
    public int getQuarter() {
        return Quarter;
    }

    public void setQuarter(int quarter) {
        this.Quarter = quarter;
    }

    // Getter and Setter for TimeRemaining
    public String getTimeRemaining() {
        return TimeRemaining;
    }

    public void setTimeRemaining(String timeRemaining) {
        this.TimeRemaining = timeRemaining;
    }

    // Getter and Setter for PenaltyID
    public int getPenaltyID() {
        return PenaltyID;
    }

    public void setPenaltyID(int penaltyID) {
        this.PenaltyID = penaltyID;
    }
}
