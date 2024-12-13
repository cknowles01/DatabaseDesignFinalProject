package App.Domain;

public class Team {
    private String Name;
    private String Division;
    private String Coach;
    private Integer CoachID;
    private Integer StadiumID;

    // Getter for Name
    public String getName() {
        return Name;
    }

    // Setter for Name
    public void setName(String Name) {
        this.Name = Name;
    }

    // Getter for Division
    public String getDivision() {
        return Division;
    }

    // Setter for Division
    public void setDivision(String Division) {
        this.Division = Division;
    }

    // Getter for Coach
    public String getCoach() {
        return Coach;
    }

    // Setter for Coach
    public void setCoach(String Coach) {
        this.Coach = Coach;
    }

    // Getter for CoachID
    public Integer getCoachID() {
        return CoachID;
    }

    // Setter for CoachID
    public void setCoachID(Integer CoachID) {
        this.CoachID = CoachID;
    }

    // Getter for StadiumID
    public Integer getStadiumID() {
        return StadiumID;
    }

    // Setter for StadiumID
    public void setStadiumID(Integer StadiumID) {
        this.StadiumID = StadiumID;
    }
}
