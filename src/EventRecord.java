import java.util.ArrayList;
public class EventRecord {
    private Day[] events = new Day[3];
    private int money = 0;
    private int currentDay = 0;
    private ArrayList<String> inventory = new ArrayList<>();
    public UserCharacter userClass;

    //Add the userClass
    public void addClass(UserCharacter input){
        userClass = input;

    }

    //Add a new day to events
    public void addEvent(Day newEvent){
        events[currentDay] = newEvent;
        currentDay++;
    }

    //Add a new item to inventory
    public void addItem(String newItem){
        inventory.add(newItem);
    }

    //Get the ally given a day
    public String getAlly(int day){
        return events[day].getAlly();
    }

    //Get a string of current inventory
    public String getInventory(){
        String output = "Inventory: ";
        for(int i = 0; i < inventory.size(); i++){
            output += (i+1) + ") " + inventory.get(i);
            if(i != inventory.size()-1){
                output += ", ";
            }
        }
        return output;
    }

    //Get the current inventory size
    public int InventorySize(){
        return inventory.size();
    }

    //Get boolean of (Is Inventory Empty)
    public boolean InventoryIsEmpty(){
        return inventory.isEmpty();
    }

    //Remove an item from inventory
    public void loseItem(int index){
        inventory.remove(index);
    }

    //Get a string of inventory given the index
    public String getInventoryIndex(int index){
        return inventory.get(index-1);
    }

    //Get boolean of (Is key In Inventory)
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

    //Get boolean of (Is key In Events(As a location))
    public boolean findLocation(String key){
        for(int i = 0; i < currentDay; i++){
            if(events[i].getLocation().equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }

    //Add newFund to money
    public void addMoney(int newFund){
        money += newFund;
    }

    //Remove newFund from money
    public void loseMoney(int newFund){
        money -= newFund;
    }

    //Return money as int
    public int getMoney(){
        return money;
    }

    //Print the current funds
    public void printMoney(){
        Tools.readerln("Current funds: " + getMoney());
    }

}
