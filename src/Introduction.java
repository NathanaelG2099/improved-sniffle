public class Introduction {
    public static void Start(){
        Tools.reader("Welcome to the land of Noct, named for the continent's shape resembling a crescent moon." + "\n" +
                "The land is hailed as the cradle of Mana, with no shortage of trailblazing adventurers seeking its treasure." +"\n"+
                "In this story, we come across one such adventurer near the southern edge, where hardship is common" + "\n" +
                "and outside information is scarce. ", 25);
        Tools.readerln("Here, no one could ascertain their past...", 75);
    }

    public static void Start2(UserCharacter userClass){
        Tools.readerln("As a " + userClass.getClassType() + " you have made your way to the Southern Land. ");
        switch (userClass.getClassType()) {
            case ("WARRIOR"):
                Tools.readerln("""
                        Whether you served a king or only yourself does not matter. Here, you aim to\s
                        find further power than you could seek in your homeland. Pursue the strength that you\s
                        crave and allow none to block the path.""");
                break;

            case ("ARCHER"):
                Tools.readerln("""
                        Whether you served a king or only yourself does not matter. In this world,\s
                        the strong eat the weka, yet you are determined to keep yourself as part of the former.
                        Here, you can sense that danger has a habit of providing powerful relics.""");
                break;

            case ("WIZARD"):
                Tools.readerln("""
                        Regardless of allegiance, you have always taken the path that promised improvement
                        in the pursuit of magic. Grimoires, tomes, and spells are your driving force, and their
                        quality is best seen in their dangers. With this many magical forces, these lands are
                        surely rich in hidden treasures.""");
                break;

            case ("CLERIC"):
                Tools.readerln("""
                        As God's chosen apostle, you have always sought to act as His rightous hammer.
                        Filled with monsters, dangers, and unchecked magic, you have deemed this land
                        the recipient of God's blessings. The land will be restored in the holy light,
                        cleansed of all evil-doers.""");
                break;
        }
    }
}
