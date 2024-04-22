import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Testing character creation
        UserCharacter charInfo = new UserCharacter(scnr);
        System.out.println(charInfo.getClassType());






        //testing Day System
        Day day1 = new Day("Forest", "Sword", "Alone");
        Day day2 = new Day("Town", "Basket of Fruit", "Morgan");

        EventRecord timeline = new EventRecord();
        timeline.addEvent(day1);
        timeline.addEvent(day2);

        System.out.println(timeline.Inventory());
    }
}
