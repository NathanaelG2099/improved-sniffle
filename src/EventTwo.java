import java.util.InputMismatchException;
import java.util.Scanner;

public class EventTwo {
    public static void Start(Scanner scnr, EventRecord timeline){
        Day day3 = new Day("Forest", timeline.getAlly(1));
        if(timeline.findLocation("CHURCH")){
            ChurchPath(scnr, day3, timeline);
        }else if(timeline.getAlly(1).equalsIgnoreCase("Magnus")){
            TownMagnus(scnr, day3, timeline);
        }else{
            TownAlone(scnr, day3, timeline);
        }
    }

    public static void ChurchPath(Scanner scnr, Day day, EventRecord timeline){

        ChurchTown();
        ChurchArmory(timeline);
        ChurchBuy(scnr, day, timeline);



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

    public static void ChurchBuy(Scanner scnr, Day day, EventRecord timeline){
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


    public static void TownMagnus(Scanner scnr, Day day, EventRecord timeline){

    }

    public static void TownAlone(Scanner scnr, Day day, EventRecord timeline){

    }
}
