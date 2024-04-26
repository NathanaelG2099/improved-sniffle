import java.util.ArrayList;
public class EventRecord {
    private Day[] events = new Day[3];
    private int money = 0;
    private int currentDay = 0;
    private ArrayList<String> inventory = new ArrayList<>();
    public UserCharacter userClass;

    public void addClass(UserCharacter input){
        userClass = input;
    }
    public void addEvent(Day newEvent){
        events[currentDay] = newEvent;
        currentDay++;
    }

    public void addItem(String newItem){
        inventory.add(newItem);
    }

    public String getAlly(int day){
        return events[day].getAlly();
    }

    public String getInventory(){
        String output = "Inventory: ";
        for(int i = 0; i < inventory.size(); i++){
            output += inventory.get(i);
            if(i != inventory.size()-1){
                output += ", ";
            }
        }
        return output;
    }

    public boolean findInventory(String key) {
        if (inventory.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < inventory.size(); i++) {
                if (inventory.get(i).equalsIgnoreCase(key)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean findLocation(String key){
        for(int i = 0; i < currentDay; i++){
            if(events[i].getLocation().equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }

    public void addMoney(int newFund){
        money += newFund;
    }
    public void loseMoney(int newFund){
        money -= newFund;
    }

    public int getMoney(){
        return money;
    }

    public void printMoney(){
        Tools.readerln("Current funds: " + getMoney());
    }

}
