import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        EventRecord timeline = new EventRecord();

        Day day1 = new Day();

        Introduction.Start();
        UserCharacter userClass = new UserCharacter(scnr);
        timeline.addClass(userClass);
        Introduction.Start2(userClass);
        Introduction.StartDecision(scnr, day1, timeline);

        EventOne.Start(scnr, day1, timeline);

    }
}