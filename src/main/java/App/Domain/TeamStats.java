package App.Domain;

public class TeamStats {
    private int TeamStatID;
    private String Team;
    private int StatID;
    private Integer LeagueStatID;

    // Getter and Setter for TeamStatID
    public int getTeamStatID() {
        return TeamStatID;
    }

    public void setTeamStatID(int teamStatID) {
        this.TeamStatID = teamStatID;
    }

    // Getter and Setter for Team
    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        this.Team = team;
    }

    // Getter and Setter for StatID
    public int getStatID() {
        return StatID;
    }

    public void setStatID(int statID) {
        this.StatID = statID;
    }

    // Getter and Setter for LeagueStatID
    public Integer getLeagueStatID() {
        return LeagueStatID;
    }

    public void setLeagueStatID(Integer leagueStatID) {
        this.LeagueStatID = leagueStatID;
    }
}
