import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Introduction.Start();
        UserCharacter userClass = new UserCharacter(scnr);
        Introduction.Start2(userClass);
    }
}