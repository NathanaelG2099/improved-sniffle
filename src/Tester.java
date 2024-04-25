import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        UserCharacter charInfo = new UserCharacter("CLERIC");

        EventRecord timeline = new EventRecord();
        timeline.addClass(charInfo);

        Day day1 = new Day();


        //Testing Event 1
        day1.setLocation("TOWN");
        timeline.addEvent(day1);
        day1.setAlly("MAGNUS");

        EventOne.Start(scnr, day1, timeline);
        //EventOne.Town1(scnr, day1, timeline);







        //Testing character creation
        System.out.println(charInfo.getClassType());

        //Testing days
        System.out.println(timeline.Inventory());


        //testing Day System

        System.out.println(timeline.Inventory());
    }
}
