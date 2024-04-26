public class Day {
    private String location;
    private String ally;

    public Day(String location, String ally){
        this.location = location;
        this.ally = ally;
    }

    public Day(){
        location = "NOWHERE";
        ally = "ALONE";
    }

    public void setAlly(String ally) {
        this.ally = ally;
    }

    public String getAlly() {
        return ally;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
