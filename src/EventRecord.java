public class EventRecord {
    private Day[] events = new Day[5];
    private int money = 0;
    private int currentDay = 0;
    public UserCharacter userClass;

    public void addClass(UserCharacter input){
        userClass = input;
    }
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

    public boolean FindLocation(String key){
        for(int i = 0; i < currentDay; i++){
            if(events[i].getLocation().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public void addMoney(int newFund){
        money += newFund;
    }

    public int getMoney(){
        return money;
    }

    public void printMoney(){
        Tools.readerln("Current funds: " + getMoney());
    }

}
