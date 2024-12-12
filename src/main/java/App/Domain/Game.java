package App.Domain;

public class Game {
    private int GameID;
    private String HomeTeam;
    private String AwayTeam;
    private String Date;
    private int StadiumID;

    // Getter and Setter for GameID
    public int getGameID() {
        return GameID;
    }

    public void setGameID(int GameID) {
        this.GameID = GameID;
    }

    // Getter and Setter for HomeTeam
    public String getHomeTeam() {
        return HomeTeam;
    }

    public void setHomeTeam(String HomeTeam) {
        this.HomeTeam = HomeTeam;
    }

    // Getter and Setter for AwayTeam
    public String getAwayTeam() {
        return AwayTeam;
    }

    public void setAwayTeam(String AwayTeam) {
        this.AwayTeam = AwayTeam;
    }

    // Getter and Setter for Date
    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    // Getter and Setter for StadiumID
    public int getStadiumID() {
        return StadiumID;
    }

    public void setStadiumID(int StadiumID) {
        this.StadiumID = StadiumID;
    }
}
