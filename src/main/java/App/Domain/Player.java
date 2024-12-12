package App.Domain;

public class Player {
    private int ID;
    private String Name;
    private String Position;
    private int Age;
    private String Team;

    // Getter and Setter for ID
    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    // Getter and Setter for Name
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    // Getter and Setter for Position
    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    // Getter and Setter for Age
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    // Getter and Setter for Team
    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        this.Team = team;
    }
}
