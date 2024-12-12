package App.Domain;

public class Team {
    private String Name;
    private String Division;
    private String Coach;

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
}