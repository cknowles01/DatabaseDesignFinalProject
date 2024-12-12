package App.Domain;

public class Referee {
    private int ID;
    private String FirstName;
    private String LastName;
    private int Experience;

    // Getter and Setter for ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Getter and Setter for FirstName
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    // Getter and Setter for LastName
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    // Getter and Setter for Experience
    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        this.Experience = experience;
    }
}
