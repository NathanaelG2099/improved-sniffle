import java.util.Scanner;
public class Introduction {
    public static void Start(){
        Tools.reader("Welcome to the land of Noct, named for the continent's shape resembling a crescent moon." + "\n" +
                "The land is hailed as the cradle of Mana, with no shortage of trailblazing adventurers seeking its treasure." +"\n"+
                "In this story, we come across one such adventurer near the southern edge, where hardship is common" + "\n" +
                "and outside information is scarce. ", 25);
        Tools.readerln("Here, no one could ascertain their past...", 75);
    }

    public static void Start2(UserCharacter userClass, Day day, EventRecord timeline){
        Tools.readerln("As a " + userClass.getClassType() + " you have made your way to the Southern Land. ");
        switch (userClass.getClassType()) {
            case ("WARRIOR"):
                Tools.readerln("""
                        Whether you served a king or only yourself does not matter. Here, you aim to
                        find further power than you could seek in your homeland. Pursue the strength that you\s
                        crave and allow none to block the path.""");
                break;

            case ("ARCHER"):
                Tools.readerln("""
                        Whether you served a king or only yourself does not matter. In this world,
                        the strong eat the weak, yet you are determined to keep yourself as part of the former.
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
                        As God's chosen apostle, you have always sought to act as His righteous hammer.
                        Filled with monsters, dangers, and unchecked magic, you have deemed this land
                        the recipient of God's blessings. The land will be restored in the holy light,
                        cleansed of all evil-doers.""");
                break;
        }
        Tools.readerln("""
                As you travel, you come across a forest that is unmarked upon your map. Such a
                strange place surely requires deeper investigation, as it may bring you closer
                to your goals. The trees are taller than normal, and are shaded a remarkably
                deep green, as if they have been growing for eons. As you press on, you realize
                that the forest is silent. Not even the whistling wind is present. Finally, you
                see a small clearing with a log cabin built in the center and flowerbeds
                surrounding it in strange patterns.
                """);
        switch (userClass.getClassType()){
            case ("WIZARD"):
                Tools.readerln("""
                        With your experience manipulating mana, you realize that these patterns
                        are actually casting circles! However, it's too late...
                        """);
                break;
            case("CLERIC"):
                Tools.readerln("""
                        Your past has shown you many evil wizards, along with their methods of
                        hiding their nefarious magics. The flowerbeds are for casting! However,
                        it's too late...
                        """);
                break;
        }
        Tools.readerln("""
                You notice a man of medium height, bespectacled with a buttoned white shirt,
                a leather vest, and dark brown pants, clearly ready for gardening. His white
                hair is cut short, making him appear as though he works in a trading house.
                """);
        if(userClass.getClassType().equals("WIZARD") || userClass.getClassType().equals("CLERIC")) {
            Tools.readerln("""
                    You ready your guard. No good wizard would bother hiding their spells unless
                    they planned on inflicting harm. Were you being seen as a trespasser or a
                    test subject?
                                        
                    "Hello there! My, you look dressed to the nines! Hmm, and like you don't
                    carry very much goodwill for one such as myself."
                    """);
            Tools.readerln("Did he just read your mind...?", 100);
        }else{
            Tools.readerln("""
                    You greet the man, who seems as though he doesn't belong in a forest like this.
                    Upon your introduction, the man rises from a flowerbed and gives you a great
                    toothy smile that puts you on edge.
                    
                    "Oh hello there! I would shake your hand but... you know..."
                    
                    He shows you his palms that were covered in dirt.
                    
                    "Here, let me wash them real quick."
                    
                    As he goes to a small basin by the side of the house, you notice the area he was
                    working in. Inside you see... a skull...?
                    Suddenly, the voice returns from behind you...
                    """);
        }


        Tools.readerln("""
                "Well, no point in keeping up this masquerade now is there? Here's how it's
                going to go down. You are now my test subject! Lucky you. There's 2 outcomes:
                You can become the key to time travelling... or you die a horrible death! I
                believe it should give you about 3 days. Do come back and let me know the result..."
                
                Your body refuses to heed your command as the wizard begins his incantation.
                The spell sounds both otherworldly and like gargles, with no sign of recognizable
                sounds. A blinding light sends your world into darkness, yet a small hourglass
                hovers ahead of you. Suddenly, cracks begin to appear. What fate have you
                found yourself battling?
                
                
                
                
                
                
                
                You awaken at the edge of the woods, your possessions together. Seems they weren't deemed
                valuable to that well-dressed mage. You recall that strange spell and your limited time,
                which seems to remain 5 days by the setting sun. If you could defeat the mage, you
                could find something to cleanse this curse, although you seem to be outclassed right now.
                In the distance, you can just barely sight a town. Perhaps they can enlighten you on the
                strange man in the woods?
                """);

        day.setLocation("TOWN");
        timeline.addEvent(day);

        Tools.readerln("You make your way to the town.");
    }

    public static void StartDecision(Scanner scnr, Day day, EventRecord timeline){
        String input;
        Tools.readerln("""
                Will you travel to the (Town) or the (Crossroads)?
                """);
        input = scnr.next();
        while(!input.equalsIgnoreCase("town") && !input.equalsIgnoreCase("crossroads")){
            Tools.readerln("Please Try again.");
            Tools.readerln("Will you travel to the (Town) or the (Crossroads)?");
            input = scnr.next();
        }

        if(input.equalsIgnoreCase("town")){
            day.setLocation("TOWN");
        }else{
            day.setLocation("CROSSROADS");
        }

        timeline.addEvent(day);

        Tools.readerln("You make your way to the " + day.getLocation());
    }
}
