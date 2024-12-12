package App.Domain;

public class Penalty {
    private int ID;
    private String Name;
    private String Description;
    private int YardsLost;

    // Getter and Setter for ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Getter and Setter for Name
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    // Getter and Setter for Description
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    // Getter and Setter for YardsLost
    public int getYardsLost() {
        return YardsLost;
    }

    public void setYardsLost(int YardsLost) {
        this.YardsLost = YardsLost;
    }
}
