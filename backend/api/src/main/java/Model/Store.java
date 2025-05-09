package Model;

public class Store {

    private int idStore;
    private String modeStore;
    private String location;

    //Constructor
    public Store (int idStore, String location, String modeStore) {
        this.idStore = idStore;
        this.location = location;
        this.modeStore = modeStore;
    }

    public Store(String location, String modeStore) {
        this.location = location;
        this.modeStore = modeStore;
    }
    public Store (){}



    //Getter y Setters
    public int getIdStore () {
        return idStore;
    }
    public void setIdStore (int idStore) {
        this.idStore = idStore;
    }
    public String getLocation () {
        return location;
    }
    public void setLocation (String location) {
        this.location = location;
    }
    public String getModeStore () {
        return modeStore;
    }
    public void setModeStore (String modeStore) {
        this.modeStore = modeStore;
    }

    //ToString


    @Override
    public String toString () {
        return "\"Store\":{" +
                "\"idStore\":" + idStore +
                ", \"modeStore\":'" + modeStore + '\'' +
                ", \"location\":'" + location + '\'' +
                '}';
    }
}
