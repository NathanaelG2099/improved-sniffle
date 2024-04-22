public class EventRecord {
    private Day[] events = new Day[5];
    private int currentDay = 0;

    public void addEvent(Day newEvent){
        events[currentDay] = newEvent;
        currentDay++;
        Tools.readerln("Your actions will have consequences...");
    }

    public String Inventory(){
        String output = "";
        for(int i = 0; i < currentDay; i++){
            output += events[i].getItem();
            if(i != currentDay-1){
                output += ", ";
            }
        }
        return output;
    }
}
