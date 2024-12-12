package App.Domain;

public class Stadium {
    private int ID;
    private String StadiumName;
    private String Location;
    private int Capacity;
    private String Team;

    public int getStadiumID() {
        return ID;
    }

    public void setStadiumID(int stadiumID) {
        ID = stadiumID;
    }

    public String getStadiumName() {
        return StadiumName;
    }

    public void setStadiumName(String stadiumName) {
        StadiumName = stadiumName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }
}
