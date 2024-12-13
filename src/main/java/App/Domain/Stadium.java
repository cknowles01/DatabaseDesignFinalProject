package App.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stadium {
    @JsonProperty("stadiumID")
    private int ID;
    private String StadiumName;
    private String Location;
    private int Capacity;
    private String Team;

    public int getStadiumID() {
        return this.ID;
    }

    public void setStadiumID(int ID) {
        this.ID = ID;
    }

    public String getStadiumName() {
        return StadiumName;
    }

    public void setStadiumName(String StadiumName) {
        this.StadiumName = StadiumName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }
}
