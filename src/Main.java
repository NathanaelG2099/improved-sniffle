import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        EventRecord timeline = new EventRecord();

        Day day1 = new Day();
        Day day2 = new Day();
        Day day3 = new Day();

        Introduction.Start();
        UserCharacter userClass = new UserCharacter(scnr);
        Introduction.Start2(userClass);
        Introduction.StartDecision(scnr, day1, timeline);


    }
}