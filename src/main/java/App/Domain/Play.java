package App.Domain;

public class Play {
    private int PlayID;
    private int GameID;
    private String Description;
    private int Quarter;
    private String TimeRemaining;
    private Integer PenaltyID;


    public int getPlayID() {
        return PlayID;
    }

    public void setPlayID(int playID) {
        this.PlayID = playID;
    }


    public int getGameID() {
        return GameID;
    }

    public void setGameID(int gameID) {
        this.GameID = gameID;
    }


    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }


    public int getQuarter() {
        return Quarter;
    }

    public void setQuarter(int quarter) {
        this.Quarter = quarter;
    }


    public String getTimeRemaining() {
        return TimeRemaining;
    }

    public void setTimeRemaining(String timeRemaining) {
        this.TimeRemaining = timeRemaining;
    }


    public Integer getPenaltyID() {
        return PenaltyID;
    }

    public void setPenaltyID(Integer penaltyID) {
        this.PenaltyID = penaltyID;
    }
}

