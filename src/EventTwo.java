
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EventTwo {
    public static void Start(Scanner scnr, EventRecord timeline){

        if(timeline.findLocation("CHURCH")){
            ChurchPath(scnr, timeline);
        }else if(timeline.getAlly(1).equalsIgnoreCase("Magnus")){
            MagnusPath(scnr, timeline);
        }else{
            TownAlone(timeline);
            TownMarket(scnr, timeline);
            AloneFinal();
        }
    }

    public static void ChurchPath(Scanner scnr, EventRecord timeline){

        ChurchTown();
        ChurchArmory(timeline);
        ChurchBuy(scnr, timeline);

    }

    public static void MagnusPath(Scanner scnr, EventRecord timeline){

        TownMagnus();
        TownMagnusDecide(scnr, timeline);
        TownMarket(scnr, timeline);
        MagnusFinal();
    }



    public static void ChurchTown(){
        Tools.readerln("""
                As you rise from your slumber, you can see the first few rays
                of sunlight peeking through your window. Recalling your plans
                with the mysterious figure, you grab your belongings and head
                out. As you move downstairs, you see the proprietress preparing
                for the day, allowing you the chance to thank her for all the
                help she's given you.
                
                "Ah don't mention it! We had an empty room anyways. I wish you
                well on your journeys, and don't go collapsing on your own
                again!"
                
                Moving out of the inn, you head out west, away from the rising
                sun. That lady said to come this way, and so far there isn't much
                to be suspicious of, just your run-of-the-mill town center.
                As the town gate appears in the distance, you note a small
                stable with three horses grazing at their troughs. Alongside it, you
                see just two people, the strange lady, now armed with a
                uniquely decorated bow and a covered quiver revealing a single
                arrow, and a wagon driver in a black traveling cloak with an
                empty scabbard.
                
                "Took you long enough! At this rate, we needed to drop the cart
                we wanted for you. Let's not waste any time and move out."
                
                Now on the road, it is just the three of you riding westward.
                As you ride, you begin to realize. You don't know either of
                their names! After taking a moment to fully feel how foolish
                you were, you decide to ask.
                
                "Ah, my name is Alison, and this fellow is Sebast- Sebas.
                Just Sebas. He's a good friend of mine, who is helping me in my
                run to take out Alatar."
                
                It seems that she still has her own secrets, but as long as your
                objectives align, she can keep a few. Meanwhile, this Sebas fellow
                has been quiet as a mouse as he scans the surroundings every few
                minutes. You make small talk with Alison as you can, but the
                conversation is lacking in substance and filled with pauses.
                
                Finally, you arrive at The Church, which can barely be called a
                church. It appears to be a full blown garrison, armed to the
                teeth with crusaders. Guards are awaiting at the front gate.
                
                "Seems like we made good time, the sun still hasn't reached
                noon. Now, I need to ask the head apostle for assistance, so
                go look for anything useful that they offer in the armory.
                They know Sebas' face, so they should give you the good stuff.
                Sebas, pass him some coins so he can prepare himself as well.
                With the church's experience hunting evil, surely they have
                an excess in anti-magical armaments."
                
                You see her leave, led by a pair of crusaders to go deeper
                into the religious fortress. Left with her horse and the
                companion, Sebas finally speaks.
                
                "Come along sir, we have to be ready by the time Madam
                Alison returns. Let us drop off our horses and peruse
                the armory."
                """);
    }

    public static void ChurchArmory(EventRecord timeline){
        Tools.readerln("""
                As you enter the armory, you see nothing more than a window
                with who you presume to be the armorer on the other side.
                Before you approach, Sebas puts his hand ahead of you,
                balled up.
               
                "Put your hand out, I have your funds prepared. Ensure that
                you put them to good use."
                
                It seems that you have 5 more gold coins to spend!
                """);

        timeline.addMoney(5);
        timeline.printMoney();
        System.out.println();

        Tools.readerln("""
                "Well, if it isn't Sebastian! And with a new friend?" He seems
                to pause, as if he needs to recompose himself. "Odd to see you
                without Alison, you're almost always together. Anyways, what can
                am I prepping you for today?"
                
                "You know how I feel about using my full name. I'd like for
                you to just stick to Sebas, at all times. We have Alatar in
                our reach, so the lady is asking about receiving aid. Also,
                we need your best mage-hunting tools."
                
                "Gotcha, I'll have the selection brought out. Anything I
                should know about the mysterious new friend?"
                
                "Cursed by that wretched wizard, so his goals aligned with
                ours. With the info he got us, our weeks long trip shorted
                to a few days. He also seems of the fighting sort, so it
                may be for the best to have them along."
                
                Behind the armorer, there appears to be a curtain, which is
                now rustling. A small tray appears, with a piece of jewelery
                and a block of steel.
                
                "Well now, let's get you sorted out. First is the classic:
                an amulet that for a mana shield."
                
                He pulls out a small amber amulet.
                
                "Should a magical object come near you,
                whatever mana animates it should solidify and harden,
                causing it to fall to the ground harmlessly."
                
                "The other is a unique one. If you look here, there's actually
                a barrel pointing out."
                
                You notice the barrel, along with a small button on the wide
                section of the square. The armorer then pulls out a small bag
                filled with beads that shine cobalt, before holding down the
                button and pushing one in.
                
                "See, if you pop one in while you hold down the button, the
                next time you push it, you get a little-"
                
                Suddenly, the bead he pushed in comes shooting out, with
                enough force to make a hole in you. Luckily, it flies to
                the side, where it collides with a straw training dummy.
                
                "-Action! I call it the CoBolt. It makes use of some new
                magical technology we've come to comprehend. Also these
                beads are made of Cobalt and enchanted, so you should
                have no trouble pushing through magical defenses."
                
                You ask him how much your money can buy you.
                
                "With that much, You can get one and prep your gear to be
                in tip-top shape. I would keep you from getting both, as the
                amulet would probably keep you from firing the CoBolt. Also,
                the amulet would probably keep anyone wearing it from actually
                casting mana-based magic, although our clerics are perfectly
                fine casting it!"
                """);
    }

    public static void ChurchBuy(Scanner scnr, EventRecord timeline){
        boolean decideLoop = true;
        int userInt = 0;
        Tools.readerln("""
                The CoBolt is undoubtedly great for striking from afar, yet
                the defensive properties of that amulet are also great. However,
                the amulet seems to be quite unwanted near mages.
                
                Will you take the amulet or the CoBolt?
                (1 - Amulet, 2 - CoBolt)
                """);
        while(decideLoop){
            try{
                userInt = scnr.nextInt();
                if(userInt == 1){
                    timeline.addItem("Amulet");
                    timeline.loseMoney(10);
                    decideLoop = false;
                } else if(userInt == 2){
                    timeline.addItem("CoBolt");
                    timeline.loseMoney(10);
                    decideLoop = false;
                } else{
                    Tools.readerln("Bad input. (1 - Amulet, 2 - CoBolt)");
                    scnr.nextLine();
                }
            }catch (InputMismatchException e){
                Tools.readerln("Bad input. (1 - Amulet, 2 - CoBolt)");
                scnr.nextLine();
            }
        }
        Tools.readerln("Your purchase may come in handy...");

        if(timeline.userClass.getClassType().equalsIgnoreCase("CLERIC")){
            Tools.readerln("""
                    CLERIC CHECK
                    
                    As you accept your purchased goods, you see the armorer
                    squint in your direction, reassessing you.
                    
                    "Say, you're actually a cleric aren't you? I'm too used to the
                    colors of our sect that I thought you were just some gaudy
                    warrior. I actually have another item that you might want,
                    and don't mind the price for this one. Just make sure you
                    stamp out Alatar for good with this."
                    
                    He pulls out a sword with engravings running from tip to
                    hilt, along with a small yellow gem placed in the cross
                    guard. As you reach out to grab it, you realize immediately
                    that this isn't just a blade, nor is it enchanted. This
                    has been forged to channel holy light, although you can't
                    decipher its exact use.
                    
                    "He's been able to avoid all of our strike forces so far,
                    before hiding elsewhere. I don't think he'll run from you
                    though, if he really has that much interest in his research.
                    I want to make sure that you're as strong as possible against
                    him.
                    
                    "And since you knew what the blade was for, there's no doubt you
                    really are a cleric, so I can trust you with that. It's been
                    blessed to smite evil, so it should work wonders on a man as
                    cruel as him."
                    
                    You gained the blessed blade!
                    """);

            timeline.addItem("Blessed Blade");
        }
        Tools.readerln("""
                "Thank you for your patronage. All of your stuff is in the
                usual spot Sebas.", says the armorer.
                
                You and Sebas leave the armorer, when Sebas takes the lead of
                your walk. You approach a decrepit shed, which seems to have
                outlasted its own usefulness. In front waits Alison, with a
                new determination in her eyes.
                
                "We got them Sebas! We were able to get some troops to assist
                us in the fight! Now all that's left is the goods. Are they
                here yet?"
                
                "They should be, lady Alison."
                
                You all walk in, seeing an empty room aside from a single table
                with a cloth over it. Sebas walks over to it, pulling aside the
                cloth to reveal the trinkets and baubles within.
                
                "We have our connections to get what we need, don't you worry."
                chimes Alison. "Let us grab our things, then we'll be on our way
                back to deal with Alatar. The Apostle said the crusader battalion
                would be waiting at the southern edge of the forest. That places
                it a bit north of the city. We should be able to make it in good
                time, so there's no need to skip sleep. Let's ride back to town,
                then we can rest out there."
                
                The return to town was as uneventful as the ride from it, although
                Alison and Sebas seemed to open up a bit more, offering snacks
                and openly quipping about how they'll defeat the wizard. You gather
                that Alison is an archer, with a equipment that can be called
                an enchanter's masterpiece. Meanwhile, Sebas reveals to be a
                retired cleric that specialized in self-enhancement. Finally, the
                town's gates approach.
                
                You return to the Inn, where the three of you purchase a night's
                stay, promising to wake each other before the fight with the wizard.
                """);
    }


    public static void TownMagnus(){
        Tools.readerln("""
                As you rise from your slumber, you can see the first few rays
                of sunlight peeking through your window. Recalling your plans
                with Magnus, you grab your belongings and head out. As you
                move downstairs, you see the proprietress preparing for the
                day, allowing you the chance to thank her for all the
                help she's given you.
                
                "Ah don't mention it! We had an empty room anyways. I heard
                from Magnus that you're heading out together and should be
                back later, so he already paid for your room tonight. He should
                be waiting for you outside, so don't keep him waiting!"
                
                As you walk outside, you see Magnus leaning against the wall
                of the building.
                
                "Finally, you're up! Let's start walking, and I'll tell you
                what we need to do today. First, We ought to talk with the town
                guards, they'll help us out to break into that forest. Then,
                we should go explore the market for anything useful. Here,
                people find a lot of odd baubles from their travels, but
                most of them don't actually know their worth and just look
                for a quick coin."
                
                The two of you walk towards the edge of town, where you see
                the gate. To the right is the guardhouse, where you can see
                people coming and going. Magnus begins to shout to a guard
                with unique dark blue accents to his armor.
                
                "Hendrickson! Hey, get this. I got a lead on our problem in
                the forest and a guy to help us out with it! Can you send out
                a group of our men to join us tomorrow?"
                
                "Captain, tell me what the damn cause is first! You ought to
                know that you can't just use the town's resources without
                explaining it first."
                
                He turns to you now.
                
                "I'm sorry about the captain, he has a habit of skipping the
                most important parts."
                
                "Okay, so get this. There's this really strong wizard guy
                in the forest, and he cursed this guy for some experiment,
                and now he has to take out the wizard or else he dies.
                Plus, the wizard is probably what's making all those
                monsters in the forest!"
                
                "Is this true? Then we need to go get the church to help
                take him out..."
                
                "No time, they're gonna die by tomorrow night, and you
                know how the church takes time to mobilize for us normal
                folk. Makes you wish you were either royalty or revered
                so that they'd work a bit faster. Now, are you going to
                just let this guy die or help us out? He has a lot of
                potential, even to my level!"
                
                Hendrickson is deep in thought. After a moment of thinking,
                he calls out to the remaining guards in the building.
                
                "Men, I got some new information that can connect to our
                monster problem. There's a wizard in the forest that seems
                to be cursing people for some kind of testing. The captain,
                this person he deemed as strong as him, and I are going to
                head out tomorrow to deal with it. It seems that we don't
                have time past tomorrow to save someone's life, so we're
                going to deal with this one without the church. Any who
                want to join us in the fight are free to do so."
                
                "Yes, Vice-Captain!!" shout the men.
                
                "We'll meet you two at the north of town tomorrow morning"
                Says Hendrickson.
                
                "Thanks. Well, now that we got that done, what should we
                do next? The market is still opening, so let's see if we
                can earn you some money for equipment!"
                """);
    }
    public static void TownMagnusDecide(Scanner scnr, EventRecord timeline){
        int userChoice = 0;
        boolean decideLoop = true;

        Tools.readerln("""
                As you walk around town, Magnus gave you two good
                options to make a quick coin or two. Some shops can always
                use a strong hand to move goods around, while some stores
                just want people to help spread the word.
                
                """);
        while (decideLoop){
            try{
                Tools.readerln("(1 - Provide an extra hand, 2 - Spread the word");
                userChoice = scnr.nextInt();
                if(userChoice > 0 && userChoice < 3){
                    decideLoop = false;
                }
            } catch (InputMismatchException e) {
                Tools.readerln("Bad Input.");
                scnr.nextLine();
            }
        }

        if(userChoice == 1){
            Tools.readerln("""
                    Heading to a blacksmith's shop, Magnus is able to set
                    you up to work for some money. You help carry around
                    wooden crates, filled with various armaments, ores,
                    tools, etc. By the end, you've ended up rather sooty,
                    but you feel like you've gotten a good stretch in.
                    """);
        } else{
            Tools.readerln("""
                    Heading to the town square, you see many stands being
                    set up for business. Seeing Magnus, one asks him to
                    show off a new style of outfit he had made. Instead
                    of accepting, Magnus pushes the job onto you in
                    exchange for some money. The two of you then wander
                    around town, you in the outfit, for an hour, until
                    returning to the tailor for your reward.
                    """);
        }
        Tools.readerln("""
                After your hard work, you were paid a handful of coins.
                
                """);
        timeline.addMoney(5);
        timeline.printMoney();
        System.out.println();

        Tools.readerln("""
                With new funds and the sun well in the sky, you and
                Magnus now head to inspect the market.
                
                "Hey, I'm gonna pop away to talk with some friends
                for a bit, let them know about tomorrow in case it
                goes bad. Here, that shop right there should be full
                of scavenged goods, see if any are magical or useful."
                """);
    }

    public static void MagnusFinal(){
        Tools.readerln("""
                As you walk out of the shop, you see Magnus begin to
                approach you.
                
                "Well damn, it seems like you got a lot! I finished all
                of my business, so lets hit the hay early. We do have a
                wizard to hunt."
                
                The two of you return to the inn, where you are able to
                rest with a good meal and a soft bed.
                """);
    }

    public static void TownMarket(Scanner scnr, EventRecord timeline){
        boolean decideLoop = true;
        boolean buyLoop = true;
        int userChoice = 0;

        ArrayList<String> shopItems = new ArrayList<>();
        ArrayList<Integer> shopCosts = new ArrayList<>();
        shopItems.add("Grey Potion");
        shopCosts.add(2);
        shopItems.add("Rusty Blade");
        shopCosts.add(3);
        shopItems.add("Agility Potion");
        shopCosts.add(4);
        shopItems.add("Defense potion");
        shopCosts.add(4);
        shopItems.add("Strength Potion");
        shopCosts.add(4);
        shopItems.add("Red Ring");
        shopCosts.add(5);
        shopItems.add("Blue Ring");
        shopCosts.add(5);

        if (timeline.userClass.getClassType().equalsIgnoreCase("WIZARD")){
            shopItems.add("Rune Stone");
            shopCosts.add(1);
            shopItems.add("Bad of stones");
            shopCosts.add(1);
            shopItems.add("Stick");
            shopCosts.add(5);
            shopItems.add("Book");
            shopCosts.add(5);
        }

        Tools.readerln("""
                As you approach the shop's door, you see the sign.
                
                G o l d e n     G o o d s
                       'No Haggling'
                       
                Entering the building, you see rows of tables with
                various objects, with small stands describing price.
                It seems objects are sorted by their price, none of
                which go over five gold pieces. A clerk is sitting
                in the back of the room, behind the counter. An
                elderly man, he gives you a small "Welcome".
                
                You walk around the store, perusing the various objects.
                Of what you can find, these are the things that catch
                your eye and their prices.
                
                1) -Nothing for this price
                2) Bottle of strange grey liquid
                3) Rusty engraved blade
                4) Expired off color potions
                     -Agility
                     -Defense
                     -Strength
                5) Strange Red Ring
                   Strange Blue Ring
                
                """);
        if(timeline.userClass.getClassType().equalsIgnoreCase("WIZARD")){
            Tools.readerln("""
                    WIZARD CHECK
                    
                    Your sensitivity to mana allows to you see the mana
                    coalescing around some objects. Some more objects
                    appear to be useful.
                    
                    1) Small stone (Likely a spell rune)
                       Bag of stones (Each has a symbol of a weapon)
                    5) Very thin coiled twig (Wand? Unbelievably rich in mana, yet fragile)
                       Book of jokes (Why is it magical?)
                    """);
        }

        Tools.readerln("You feel that any money you save will go to waste...");


        while(buyLoop) {
            while (decideLoop) {
                try {
                    for (int i = 0; i < shopItems.size(); i++) {
                        System.out.print((i + 1) + ") " + shopItems.get(i));
                        if (i < shopItems.size() - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                    System.out.println("Or input 0 to leave.");

                    userChoice = scnr.nextInt();
                    scnr.nextLine();

                    if (userChoice > -1 && userChoice <= shopItems.size()) {
                        decideLoop = false;
                    } else {
                        Tools.readerln("Bad input.");
                    }
                } catch (InputMismatchException e) {
                    Tools.readerln("Bad input.");
                    scnr.nextLine();
                }
            }


            try {
                if(shopCosts.get(userChoice-1) > timeline.getMoney()){
                    Tools.readerln("Insufficient funds.");
                }else {
                    timeline.addItem(shopItems.get(userChoice - 1));
                    timeline.loseMoney(shopCosts.get(userChoice - 1));
                    System.out.println("You bought " + shopItems.get(userChoice - 1));
                    shopItems.remove(userChoice - 1);
                    shopCosts.remove(userChoice - 1);

                    if (timeline.getMoney() < 1 && timeline.userClass.getClassType().equalsIgnoreCase("WIZARD")) {
                        buyLoop = false;
                    } else if (timeline.getMoney() < 2 && !(timeline.userClass.getClassType().equalsIgnoreCase("WIZARD"))) {
                        buyLoop = false;
                    }
                }
                decideLoop = true;
            } catch (IndexOutOfBoundsException e){
                buyLoop = false;
            }

        }
        Tools.readerln("""
                "Thank you for your purchase"
                
                You walk out of the shop with your goods packed away.
                """);

    }

    public static void TownAlone(EventRecord timeline){
        Tools.readerln("""
                You wake up in the inn, only to find that it's already
                noon. Upon rising and leaving your room, you see
                that some bustle is already forming for lunch, so
                you decide not to say goodbye to the innkeepers.
                
                As you walk outside, you begin to walk around town as
                you think to yourself. You recall there being guards
                inside the inn last night, so maybe you can convince
                some of them to help you out? It also isn't a bad
                idea to explore the town and find items that may be
                useful to you.
                
                After some wandering and asking for directions, you
                are right outside the guardhouse. Inside, you see a
                man with more blue in his armor than the others,
                giving the impression that he is leadership. You
                approach him and ask him for assistance with
                your wizard problem, sparing no details.
                
                "A wizard you say? We really would like to help,
                but we're getting reports of monsters of our own
                to deal with, and our captain isn't exactly in a
                position to aid soon..."
                
                You look past him to see the large man from last
                night, now clad in armor, and looking as miserable
                as a rotten tomato. Seems like he's hungover, and
                badly.
                
                "We really are sorry, but we have a duty to help
                the people here first. Here, I can at least spare
                you a few coins."
                
                You gained 3 coins.
                """);
        timeline.addMoney(3);
        timeline.printMoney();
        System.out.println();

        Tools.readerln("""        
                Pushed away by the guards, you make your way to a
                street of shops. Considering your lack of wealth,
                you decide to look within a discount shop. They
                pawn off objects from the deceased and odd baubles
                from ruins, so you never know if they're hiding
                something valuable.
                """);
    }

    public static void AloneFinal(){
        Tools.readerln("""
                Now outside with a few new goods, you make your
                way back to the inn, to see if you might be able
                to spend another night. However, it seems it's
                even more full than the night before, and you
                are told that every room is in use. With no
                other options, you move to a small clearing at
                the edge of town. The guards by the gate were
                helpful in telling you where you could camp,
                and you spend the night under the sky.
                """);
    }
}
