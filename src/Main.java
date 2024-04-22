

public class Main {


    public static void main(String[] args) {
        Day day1 = new Day("Forest", "Sword", "Alone");
        Day day2 = new Day("Town", "Basket of Fruit", "Morgan");

        EventRecord timeline = new EventRecord();
        timeline.addEvent(day1);
        timeline.addEvent(day2);

        System.out.println(timeline.Inventory());
    }
}