import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        UserCharacter charInfo = new UserCharacter("WIZARD");

        EventRecord timeline = new EventRecord();
        timeline.addClass(charInfo);

        Day day1 = new Day();
        Day day2 = new Day("Church", "Alison");


        //Testing Event 1
        day1.setLocation("TOWN");
        timeline.addEvent(day1);
        day1.setAlly("MAGNUS");
        timeline.addMoney(10);
        timeline.printMoney();


        timeline.addItem("Amulet");
        timeline.addItem("CoBolt");
        timeline.addItem("Blessed Blade");

        Finale.WizardFight(scnr, timeline);


        //EventTwo.TownMarket(scnr, timeline);
        //EventOne.TownDecision1(scnr, day1, timeline);
        //EventOne.Town1(scnr, day1, timeline);

        //EventTwo.Start(scnr, timeline);

        //timeline.addItem("Item1");

        //timeline.addItem("Item2");





        //Testing character creation
        System.out.println(charInfo.getClassType());

        //Testing days
        System.out.println(timeline.getInventory());


        //testing Day System

        System.out.println(timeline.getInventory());
    }
}
