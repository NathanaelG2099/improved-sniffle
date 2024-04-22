public class Day {
    private String location;
    private String item;
    private String ally;

    public Day(String location, String item, String ally){
        this.location = location;
        this.item = item;
        this.ally = ally;
    }

    public void setAlly(String ally) {
        this.ally = ally;
    }

    public String getAlly() {
        return ally;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
