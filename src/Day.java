public class Day {
    private String location;
    private String ally;


    //Contstructor
    public Day(String location, String ally){
        this.location = location;
        this.ally = ally;
    }

    //Default Constructor
    public Day(){
        location = "NOWHERE";
        ally = "ALONE";
    }

    //set ally
    public void setAlly(String ally) {
        this.ally = ally;
    }

    //return ally
    public String getAlly() {
        return ally;
    }

    //set location
    public void setLocation(String location) {
        this.location = location;
    }

    //return location
    public String getLocation() {
        return location;
    }
}
