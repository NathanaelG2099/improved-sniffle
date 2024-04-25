import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        UserCharacter charInfo = new UserCharacter("WARRIOR");

        EventRecord timeline = new EventRecord();
        timeline.addClass(charInfo);

        Day day1 = new Day();


        //Testing Event 1
        day1.setLocation("TOWN");
        timeline.addEvent(day1);
        day1.setAlly("MAGNUS");

        EventOne.TownDecision1(scnr, day1, timeline);
        //EventOne.Town1(scnr, day1, timeline);







        //Testing character creation
        System.out.println(charInfo.getClassType());


        //testing Day System

        System.out.println(timeline.Inventory());
    }
}
