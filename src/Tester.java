import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        UserCharacter charInfo = new UserCharacter("WIZARD");

        EventRecord timeline = new EventRecord();
        timeline.addClass(charInfo);

        Day day1 = new Day();
        Day day2 = new Day();
        Day day3 = new Day();


        //Testing Event 1
        day1.setLocation("TOWN");
        timeline.addEvent(day1);
        day1.setAlly("ALISON");

        EventOne.TownDecision1(scnr, day1, timeline);
        //EventOne.Town1(scnr, day1, timeline);







        //Testing character creation
        System.out.println(charInfo.getClassType());


        //testing Day System

        timeline.addEvent(day1);
        timeline.addEvent(day2);

        System.out.println(timeline.Inventory());
    }
}
