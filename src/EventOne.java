import java.util.InputMismatchException;
import java.util.Scanner;

public class EventOne {

    public static void Start(Scanner scnr, Day event, EventRecord timeline){
        if(timeline.FindLocation("TOWN")){

        }
    }

    public static void Town1(Scanner scnr, Day event, EventRecord timeline){
        Tools.readerln("""
                You begin your trek towards the distant town, taking you through untouched plains.
                The patter of feet crushing grass and the rushing wind is all you have to occupy
                yourself, while the sun beats down. After what feels like hours, the undeveloped
                plains turn to wheat fields, and the town has multiplied in size. With the town
                so close and the fatigue catching up to you, your reprieve has led you to fall
                into a deep slumber...
                """);

        Tools.readerln("""
                You awaken in a furnished room, atop a soft bed. You feel the expected pains in
                your legs, although your upper back is awfully sensitive, like it was rubbed raw.
                You are close enough to the wall on your right to touch it, with a door beyond
                your feet and the last rays of the sunset shining through the window to your left.
                The small drawers in the room are all empty but a bible, meaning that this is
                likely an inn! As you come to the realization that you have acquired some form
                of safety, there is a light rapping upon the wooden door.
                
                """);

        Tools.readerln("""
                "Hi there, you awake yet? If you are, you better come down and eat!"
                
                It seems to be the voice of young girl, probably a relative of whoever owns the building.
                The haste in her voice and the quick patters upon a wooden staircase tell you that she has
                left in quite the hurry. The food she spoke about is likely ready, and you note that
                your stomach is being rather vocal.
                
                You head out of your room to see a large space in the floor below you, filled with
                roughed-up men and women, all eating and drinking merrily. The smell of rich meats
                and well-seasoned soups drags you downstairs, revealing the bar that was hidden underneath
                your hall upstairs. Here, an older woman with brunette hair and a villager's apron
                notions towards you, pushing your serving onto the bar while a young girl with matching
                appearance places a wooden mug.
                
                "Finally awake? We were beginning to wonder if you were ever gonna wake up. My daughter
                found you sleeping like a babe by the fields, so the husband up and dragged you back.
                Hope sliding over didn't rough you up too bad, Haha! Anyhow, grab your food and take a
                seat. Sorry there's no room in the place, although it just proves my worth as a chef!
                Ya' can use the room for the night, although by the looks of it, we'll need you out
                tomorrow unless you can pay the rent."
                
                Thinking on it, you reach in your pockets and find five gold coins!
                """);
        timeline.addMoney(5);
        timeline.printMoney();
        System.out.println();

        Tools.readerln("""
                Grabbing your food, you begin looking around for open seats. You see one near a hooded
                fellow, who is probably as interesting a conversationalist as his appearance is friendly.
                However, you may find some information about that strange wizard from such a source.
                Elsewhere, you spot a young man who has clearly seen his share of hard labor, judging
                from his wide shoulders and calloused hands. His conversations also seem to be
                incredibly friendly will all those in attendance, so he may be a local. Otherwise, the
                room is rather packed, with your only option being to return to your room.
                """);

        Tools.readerln("Who will you sit with? (Type 1-Cloaked figure, 2-Strong man, 3-Alone)");
        int userInt = scnr.nextInt();
        while (userInt < 1 || userInt > 3){
            Tools.readerln("Unrecognized input. Who will you sit with? (Type 1-Cloaked figure, 2-Strong man, 3-Alone)");
            userInt = scnr.nextInt();
        }
        if(userInt == 1){
            event.setAlly("ALISON");
        } else if(userInt == 2){
            event.setAlly("MAGNUS");
        } else{
            event.setAlly("ALONE");
        }
    }

    public static void TownDecision1(Scanner scnr, Day event, EventRecord timeline){
        int archerChoice = 0;
        boolean decideLoop = true;


        if(event.getAlly().equals("ALISON")){
            Tools.readerln("""
                    
                    You move towards the hooded figure and pull up a seat. Thanks to the inn's
                    capacity, it isn't out of the ordinary to squeeze in wherever one can.
                    The hooded figure doesn't recognize your presence in the slightest.
                    As you start eating, you can't help but silently express your awe at the
                    flavor. There is a clear reason for the inn's spike in business near supper.
                    
                    After relishing some of your meal, you decide to speak up to the hooded figure.
                    All you can glance is a small brooch with a crescent moon.
                    
                    """);

            if(timeline.userClass.getClassType().equals("ARCHER")){
                System.out.println("ARCHER CHECK");

                Tools.readerln("""
                        With your training to recognize people from much farther distances than
                        a dinner table, you recognize the body type of a lady. Additionally,
                        that brooch is not just a moon, but an eclipse. More specifically, the
                        eclipse seen in the not-oft seen outlaw guild. Not all members are
                        bloodthirsty criminals, but all want to avoid the public eye. Noting
                        your clear informational advantage, you decide to complement "Milady's"
                        eclipse brooch.
                        
                        "Wha-" She startles, straightening her back from eating and spilling
                        her soup. Your own lack of a brooch signals that you aren't one of her
                        compatriots, making her response justified. Clearly attempting to
                        recompose herself, she proceeds to whisper:
                        
                        "What do you want from me? Coin? Information?"
                        
                        Do you accept her offer of coin and information? Or only take the
                        information? (1- Coin & Info, 2- Info only)
                        """);
                while(decideLoop) {
                    try {
                        archerChoice = scnr.nextInt();
                        if(archerChoice > 2 || archerChoice < 1){
                            decideLoop = true;
                        } else{
                            decideLoop = false;
                        }
                    } catch (InputMismatchException e){
                        Tools.readerln("Bad Input. (1- Coin & Info, 2- Info only)");
                        scnr.nextLine();
                    }
                }
                if(archerChoice == 1){
                    Tools.readerln("""
                            
                            "Fine, take it, you !@#$"
                            
                            You can tell she didn't appreciate it. But money!!!
                            """);
                    timeline.addMoney(10);
                }
            } else{
                Tools.readerln("""
                        You greet the figure, although to no response. Unfortunate, but
                        you won't quit quite yet. You inform them that you had a run in
                        with what seemed to be a wizard in the forest, yet the figure's
                        hood falls slightly, revealing a young lady with eyes wide in
                        surprise.
                        
                        "Did you just say wizard? Did he happen to be dressed as though
                        he should be handling money for a trading company?"
                        
                        You confirm her inquiry, along with asking for any information
                        that she has on this figure. At first, she seems to be mumbling
                        to herself, before remembering the conversation and raising her
                        hood once again in a haste.
                        """);

            }
            Tools.readerln("""
                    "Anyways, it's information you want? On that wretched man in the forest? If you've
                    wrapped yourself up with him, you've certainly suffered enough. I happen
                    to have gotten wrapped up with him as well, although it was moreso my
                    kingd-"
                    
                    She stops herself and appears almost in a rage, before taking a moment to
                    recompose herself. After a moment, she raises her head and continues.
                    
                    "I also have my reasons to hunt that scurrying rat Alatar."
                    """);
            if(timeline.getMoney() > 5){
                Tools.readerln("""
                        "However, I won't be doing it with a sub-human parasite such as yourself."
                        
                        She spits in your direction and leaves. At the very least, it seems the lady is
                        learned in revealing one's disapproval. Although your information was certainly
                        lacking, perhaps these newfound funds could help bankroll your travel?
                        """);
                event.setAlly("ALONE");
            }
            else{
                Tools.readerln("""
                        "He is a wizard who has traded all his moral's for advancements in his magics.
                        All is fair game for him, from relocating mountains to live experimentation.
                        At this point, it isn't unreasonable to believe that the Church has a bounty
                        on his head. My plan is to gather their support and finally end him, and I
                        wouldn't be opposed to your participation..."
                        
                        You inform her upon your interaction with the wizard and the curse that he
                        placed upon you.
                        
                        "Oh dear, well you're in luck. The Church has a chapel half a day's ride,
                        so we can inform them and return with time to keep you from... however
                        you might die. Care to join me in this escapade?"
                        
                        With how late it is and the number of obnoxious drunks rising, it appears
                        this roguish lady is your only chance at aid. You take up her offer, and
                        agree to meet again tomorrow morning outside the inn at daybreak.
                        """);
            }

        }else if (event.getAlly().equals("MAGNUS")){
            Tools.readerln("""
                    
                    You move towards the young man and pull up a seat. Thanks to the inn's
                    capacity, it isn't out of the ordinary to squeeze in wherever one can.
                    The young man throws you a wave, but is still mid-conversation with another.
                    As you start eating, you can't help but silently express your awe at the
                    flavor. There is a clear reason for the inn's spike in business near supper.
                    
                    
                    """);
        }else{
            Tools.readerln("""
                    
                    You return to your room to eat quietly. This place seems quite nice, making it
                    all the more a shame that you only have a few days to live. On that note, it
                    seems like you weren't able to get all that much information today, as by the
                    time you finish your food, the building has quieted down, with many having left
                    the inn while the others laid on the tables in booze-fueled slumbers. Not much
                    left for you to do but sleep.
                    """);
        }
    }


}
