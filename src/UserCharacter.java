import java.util.Scanner;
public class UserCharacter {
    private String classType;

    public UserCharacter(Scanner scnr){
        boolean confirm = false;
        char input;
        Tools.reader("Input your class (Warrior, Archer, Wizard, Cleric): ");
        String newClass = scnr.next().toUpperCase();
        while(!confirm) {
            switch (newClass) {
                case ("WARRIOR"):
                    Tools.reader("\t" + "A close-range fighter seen in all ages. Holding loyalty to no land, this soldier " +"\n" +
                            "is donned in steel armor and wields sword and shield in deadly unison. Although at a " + "\n"+
                            "disadvantage against spell-casters and archers, the only blockade to victory is the distance.", 25);
                    Tools.reader("Confirm? (Y/N)");
                    input = scnr.next().charAt(0);
                    if(input == 'y' || input == 'Y'){
                        Tools.reader("Class: Warrior");
                        classType = "WARRIOR";
                        confirm = true;
                    } else{
                        Tools.reader("Input your class (Warrior, Archer, Wizard, Cleric): ", 25);
                        newClass = scnr.next();
                        newClass = newClass.toUpperCase();
                    }
                    break;

                case("ARCHER"):
                    Tools.reader("\t" + "A mid to long range sniper, commonly seen over ramparts and the rears of armies." + "\n" +
                            "Wearing highly mobile and padded leather armor with a bow slung around their shoulder and a dagger " + "\n" +
                            "at their side. On a lone adventure, a hunting dog is essential for all archers. In battle, " + "\n" +
                            "the only alternative to distance is ingenuity.", 25);
                    Tools.reader("Confirm? (Y/N)");
                    input = scnr.next().charAt(0);
                    if(input == 'y' || input == 'Y'){
                        Tools.reader("Class: Archer");
                        classType = "ARCHER";
                        confirm = true;
                    } else{
                        Tools.reader("Input your class (Warrior, Archer, Wizard, Cleric): ", 25);
                        newClass = scnr.next();
                        newClass = newClass.toUpperCase();
                    }
                    break;

                case("WIZARD"):
                    Tools.reader("\t" + "While magic is open to all who seek it, only those willing to die for knowledge are truly" + "\n" +
                            "able to unlock the secrets of mana. The recognizable wizard's robe and staff are results of endless research, " + "\n" +
                            "preventing ambient mana loss and acting as a conduit for spells, respectively. However, an unequipped " + "\n" +
                            "wizard should not be underestimated. In the hunt for knowledge, everyone knows the best grimoires " + "\n" +
                            "are the most heavily protected.", 25);
                    Tools.reader("Confirm? (Y/N)");
                    input = scnr.next().charAt(0);
                    if(input == 'y' || input == 'Y'){
                        Tools.reader("Class: Wizard");
                        classType = "WIZARD";
                        confirm = true;
                    } else{
                        Tools.reader("Input your class (Warrior, Archer, Wizard, Cleric): ", 25);
                        newClass = scnr.next();
                        newClass = newClass.toUpperCase();
                    }
                    break;

                case("CLERIC"):
                    Tools.reader("\t" + "The Cleric is no average church priest. Trained in battle tactics and smiting evil, " + "\n" +
                            "a cleric is a god-blessed force to be reckoned with. With sturdy chain-mail underneath the white- " + "\n" +
                            "and-crimson tabard, a silver mace in one hand and a holy prayer book in the other, the only check" + "\n" +
                            "to their power is their oath to uphold God's grace. Holy light and rightous fire follows the " + "\n" +
                            "path of these preachers.", 25);
                    Tools.reader("Confirm? (Y/N)");
                    input = scnr.next().charAt(0);
                    if(input == 'y' || input == 'Y'){
                        Tools.reader("Class: Cleric");
                        classType = "CLERIC";
                        confirm = true;
                    } else{
                        Tools.reader("Input your class (Warrior, Archer, Wizard, Cleric): ", 25);
                        newClass = scnr.next();
                        newClass = newClass.toUpperCase();
                    }
                    break;

                default:
                    Tools.reader("That class isn't recognized.");
                    Tools.reader("Input your class (Warrior, Archer, Mage, Cleric): ", 25);
                    newClass = scnr.next();
                    newClass = newClass.toUpperCase();

            }

        }
    }

    public String getClassType() {
        return classType;
    }
}
