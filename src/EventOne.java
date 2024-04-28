import java.util.InputMismatchException;
import java.util.Scanner;

public class EventOne {


    public static void Town1(Scanner scnr, Day event, EventRecord timeline){
        int userInt;
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
                
                This may decide how you spend tomorrow, as well.
                """);

        Tools.readerln("Who will you sit with? (Type 1-Cloaked figure, 2-Strong man, 3-Alone)");

        boolean decideLoop = true;

        while (decideLoop) {
            try {
                userInt = scnr.nextInt();
                while (userInt < 1 || userInt > 3) {
                    Tools.readerln("Unrecognized input. Who will you sit with? (Type 1-Cloaked figure, 2-Strong man, 3-Alone)");
                    userInt = scnr.nextInt();
                }
                if (userInt == 1) {
                    event.setAlly("ALISON");
                    decideLoop = false;
                } else if (userInt == 2) {
                    event.setAlly("MAGNUS");
                    decideLoop = false;
                } else {
                    event.setAlly("ALONE");
                    decideLoop = false;
                }
            } catch (InputMismatchException e){
                Tools.readerln("Bad input. Who will you sit with? (Type 1-Cloaked figure, 2-Strong man, 3-Alone)");
                scnr.nextLine();
            }
        }

        TownDecision1(scnr, event,timeline);
    }

    public static void TownDecision1(Scanner scnr, Day event, EventRecord timeline){
        int userChoice = 0;
        boolean decideLoop = true;

        Day day2 = new Day();


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
                        userChoice = scnr.nextInt();
                        if(userChoice > 2 || userChoice < 1){
                            decideLoop = true;
                        } else{
                            decideLoop = false;
                        }
                    } catch (InputMismatchException e){
                        Tools.readerln("Bad Input. (1- Coin & Info, 2- Info only)");
                        scnr.nextLine();
                    }
                }
                if(userChoice == 1){
                    Tools.readerln("""
                            
                            "Fine, take it, you !@#$"
                            
                            You can tell she didn't appreciate it. But money!!!
                            """);
                    timeline.addMoney(15);
                }
            } else{
                Tools.readerln("""
                        You greet the figure, although to no response. Unfortunate, but
                        you won't quit quite yet. You inform them that you had a run in
                        with what seemed to be a wizard in the forest, and the figure's
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
                        lacking, perhaps these newfound funds could help bankroll your travel? With
                        the inn dying down, you decide to return to your room and slumber.
                        
                        
                        
                        
                        
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
                        
                        You inform her upon your interaction's result of the curse that he
                        placed upon you.
                        
                        "Oh dear, well you're in luck. The Church has a chapel half a day's ride,
                        so we can inform them and return with time to keep you from... however
                        you might die. Care to join me in this escapade?"
                        
                        With how late it is and the number of obnoxious drunks rising, it appears
                        this roguish lady is your only chance at aid. You take up her offer, and
                        agree to meet again tomorrow morning outside the inn at daybreak. You may
                        even find more about their past while you're at it.
                        """);
            }
            if (event.getAlly().equals("ALISON")) {
                day2.setAlly("ALISON");
                day2.setLocation("CHURCH");
            } else{
                day2.setLocation("TOWN");
            }

        }else if (event.getAlly().equals("MAGNUS")){

            Tools.readerln("""
                    
                    You move towards the young man and pull up a seat. Thanks to the inn's
                    capacity, it isn't out of the ordinary to squeeze in wherever one can.
                    The young man throws you a wave, but is still mid-conversation with another.
                    As you start eating, you can't help but silently express your awe at the
                    flavor. There is a clear reason for the inn's spike in business near supper.
                    
                    "Well I'll be, just look at that reaction!" You suddenly feel a strong force
                    connect with your back, leading you to a small coughing fit. "Oh, sorry about
                    that, I just can't help but be glad when I see a traveler appreciate the food
                    for the masterpiece that it is. The name's Magnus, pleasure to meet 'cha! Now,
                    what brings you to Bethel?"
                    
                    You explain to him the circumstances of your stay.
                    
                    "Ah, I see. Well, the town hasn't heard of no wizard, but there has been a
                    rise in monster attacks from that forest for the last few months. Wait, it
                    wasn't marked on your map? No, there's definitely a forest marked, but it
                    wasn't supposed to be until another half day's walk, and certainly not that
                    large. I guess it seems pretty clear that the two might be connected, eh?
                    
                    Anyhow, that encounter sounds crazy! The wizard sounds like he doesn't play
                    fair, but you don't look like a total pushover either. Say, mind if we go
                    out back for a skirmish? I'm actually quite the battle-junkie, shamed as I
                    am to say it, and you seem like you want the practice given how that wizard
                    schooled you. So, what do you say, down for a brawl?
                    """);
            Tools.readerln("""
                    
                    Will you take on the young fighter in a fight? (1 - Accept, 2 - Decline)
                    """);

            while(decideLoop){
                try{
                    userChoice = scnr.nextInt();
                    if(userChoice > 0 && userChoice < 3){
                        decideLoop = false;
                    } else{
                        Tools.readerln("Bad Input. (1 - Accept, 2 - Decline)");
                    }
                } catch (InputMismatchException e){
                    Tools.readerln("Bad Input. Will you take on the young fighter? (1 - Accept, 2 - Decline)");
                    scnr.nextLine();
                }
            }

            if(userChoice == 2){
                Tools.readerln("""
                        "Ah, that's a cryin' shame. Well, I can't blame you for wanting to conserve your
                        strength, considering the troubles you probably have ahead. Here, take a few
                        coins, in the worst case they'll help you grab something nice in your time.
                        Ah would you look at that, usually I'm the first drunkard sleeping on the tables!
                        Well, I really should head on home to my folks. Good luck with your Wizard!"
                        
                        As Magnus leaves, you take note of a few gold coins on the table for you.
                        It makes sense why he has so many acquaintances here.
                        """);
                timeline.addMoney(5);
                timeline.printMoney();
                System.out.println();
                Tools.readerln("""
                        With new funds acquired, you make your way to the room for a new day.
                        """);
                event.setAlly("ALONE");
            } else {
                Tools.readerln("""
                        "That's the spirit! Meet me outside once you finish eating"
                        
                        After finishing your meal, you head outside, where Magnus leads you around
                        to the back with an unusually large wooden sword in his hands. Here, you
                        see a large dirt area in an oval, prepared for games and brawls.
                        
                        "Here's how it's gonna go: We both start at the ends of the field. I'm going
                        to throw a rock in the air, and whenever it hits the ground, we start.
                        Go ahead and make your way over!"
                        
                        You walk to the edge of the field and find an array of wooden weapons.
                        After picking one up, you motion to him. He gives you a thumbs-up
                        and reaches towards the ground, tossing a rock before shouting back.
                        
                        "Remember, when the rock hits the ground!!"
                        
                        He throws the rock into the air. You both are silent and motionless, staring
                        up at the small object. Upon hitting the ground, you see him speed forward.
                        What do you do?
                        """);


                decideLoop = true;
                while(decideLoop){
                    if(timeline.userClass.getClassType().equals("WARRIOR")){
                        Tools.readerln("""
                            WARRIOR CHECK
                            
                            Given your strength, you can't imagine this battle going badly for you:
                            (1 - Fearlessly clash swords, 2 - Aim to disarm him)
                            """);
                    }else if(timeline.userClass.getClassType().equals("ARCHER")){
                        Tools.readerln("""
                            Considering his strength, prevent him from getting to strike:
                            (1 - Aim to knock him down, 2 - Deliberately let him close, then strike)
                            """);
                    }else if(timeline.userClass.getClassType().equals("WIZARD")){
                        Tools.readerln("""
                            You magic spells should allow you to safely immobilize him:
                            (1 - Freeze his approach, 2 - Quietly prepare a close-range shock)
                            """);
                    }else{
                        Tools.readerln("""
                            This man is no evildoer, rendering offensive prayers harmless:
                            (1 - Attempt to empower yourself, 2 - Utilize your spellbook differently)
                            """);
                    }

                    try{
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
                    if(timeline.userClass.getClassType().equals("WARRIOR")){
                        Tools.readerln("""
                                Your swords clash with the hard 'Thump' of wood striking each other.
                                With your current strength, the two of you are at a standstill. Magnus
                                quickly removes his sword and strikes again, with you quickly moving to
                                clash in turn. With you both looking for a small opening in the other's
                                defense, you note that his form is impeccable.
                                
                                "All right, all right, lets call it!"
                                
                                With neither side able to push through to victory, Magnus acknowledges
                                your ability as high enough to be his equal.
                                
                                "Good work, you did pretty damn good! Not many can take me in a fair fight,
                                so few that the town actually gave me a little present for whoever can."
                                
                                He pulls out a small amulet that seems to...glisten...?
                                
                                "They said that it was enchanted with a bit of protection from magic.
                                Really, it's only supposed to be for the town guard capitan, but I think
                                you could really use it now."
                                
                                You got the 'Defense Amulet'!
                                """);
                        timeline.addItem("Defense Amulet");
                    } else if(timeline.userClass.getClassType().equals("ARCHER")){
                        Tools.readerln("""
                                Your arrows have been swapped out for blunt tips, trading their piercing
                                ability for a harder blow. Seeing him sprinting forward, you think that
                                a solid blow to his knee or shin should send him rolling. With your arrows
                                nocked, you begin firing your volley. He jumps around in an attempt to
                                dodge, slowing himself and buying yourself time. In a spark of ingenuity,
                                you recall the wooden blade you also grabbed, and that it can be used for
                                more than close quarters combat.
                                                                
                                You fire a few more arrows, then grab your blade instead of another arrow.
                                With a bow in one hand and the sword in the other, you throw your blade
                                as hard as you can towards his feet. His one-footed hopping was unsuited
                                for the wide blow, sending his face to meet the dirt.
                                                                
                                "Argh, God's damn ye!" he says, with an accent coming heavier than usual.
                                "Ah, that's my loss, and an overwhelming one at that! My bad with the
                                language, I just don't usually get hit. Plus, I didn't think you'd chuck
                                the whole damn sword at me!
                                                                
                                "Considering your overwhelming win and damning circumstance, allow this
                                guard capitan to grant you a small reward!"
                                
                                He pulls out a small amulet that seems to...glisten...?
                                
                                "They said that it was enchanted with a bit of protection from magic.
                                Really, it's only supposed to be for the town guard capitan, but I think
                                you could really use it now."
                                
                                You got the 'Defense Amulet'!
                                
                                """);
                        timeline.addItem("Defense Amulet");
                    }else if(timeline.userClass.getClassType().equals("WIZARD")){
                        Tools.readerln("""
                                Deeming a far range approach is your best bet, you decide to strike
                                at him from afar with your non-lethal spells. Shooting large blobs of
                                water, your attacks actually end up getting slashed or dodged by him.
                                However, the water trails left behind provide the perfect cover to freeze
                                him in his tracks. As you cast to freeze, you notice something strange...
                                The water approaching him is freezing, yet he easily dodges its approach.
                                However, it should also be freezing on him as well, considering the splashes
                                from your attacks. With your mind racing from the shock, you don't realize
                                that he has already closed the distance, with his wooden blade at your throat.
                                
                                "Sorry mage, but that's wraps. Don't kick yourself too hard, I have my own
                                defenses against tricky casters."
                                
                                He removes his blade, and begins to stretch himself out.
                                
                                "Damn, that was a good fight! I hope you aren't kicking yourself too hard,
                                because not many can win against the guard capitan of Bethel! Although
                                you were definitely skilled, so maybe you could have won with a different
                                strategy."
                                """);
                    }else{
                        Tools.readerln("""
                                As the battle begins, you close your eyes and begin chanting. You can feel the
                                holy force flowing into you, strengthening your power and speed. By no means a
                                small man yourself, this may be the edge you need to win. When you open your eyes,
                                you see that the distance as halved, and he is preparing to strike. Faster than the
                                eye can see, the two of you are locked in a flurry of blows. However, even your mind
                                was sped up, allowing you to see a small opening in the strikes. With a lightning
                                fast punch, you utilize your off-hand to punch at his gut, ending the bout.
                                
                                "Argh, God's damn ye!" he says, with an accent coming heavier than usual.
                                "Ah, that's my loss, and an overwhelming one at that! My bad with the
                                language, I just don't usually get hit. Ouch, my guts really wishes I didn't
                                eat so much earlier... Ugh..."
                                
                                He takes a moment to recompose himself before taking on an honorable tone.
                                                                
                                "Considering your overwhelming win and damning circumstance, allow this
                                guard capitan to grant you a small reward!"
                                
                                He pulls out a small amulet that seems to...glisten...?
                                
                                "They said that it was enchanted with a bit of protection from magic.
                                Really, it's only supposed to be for the town guard capitan, but I think
                                you could really use it now."
                                
                                You got the 'Defense Amulet'!
                                """);
                        timeline.addItem("Defense Amulet");
                    }
                } else{
                    if(timeline.userClass.getClassType().equals("WARRIOR")){
                        Tools.readerln("""
                                With a strategy in mind, you rush towards him. His build is similar to yours,
                                so it makes sense that his strikes should be just as fast. As his sword begins
                                to come down on you, you swiftly dodge to your left and strike at his hand.
                                With a 'THWACK' his sword comes falling down, with Magnus wincing in pain.
                                
                                "Argh, God's damn ye!" he says, with an accent coming heavier than usual.
                                "Ah, that's my loss, and an overwhelming one at that! My bad with the
                                language, I just don't usually get hit! Cockiness aside, I really thought
                                I could win since we look to be at similar strengths, but I guess your
                                mind is just faster than mine.
                                
                                "Considering your overwhelming win and damning circumstance, allow this
                                guard capitan to grant you a small reward!"
                                
                                He pulls out a small amulet that seems to...glisten...?
                                
                                "They said that it was enchanted with a bit of protection from magic.
                                Really, it's only supposed to be for the town guard capitan, but I think
                                you could really use it now."
                                
                                You got the 'Defense Amulet'!
                                """);

                        timeline.addItem("Defense Amulet");

                    } else if(timeline.userClass.getClassType().equals("ARCHER")){
                        Tools.readerln("""
                                Your arrows have been swapped out for blunt tips, trading their piercing
                                ability for a harder blow. Your sword was also switched for a wooden one,
                                turning it into more of a blunt weapon. Rather than fire as you usually
                                do, you opt to feint and take a sneaky attack.
                                
                                Firing away while he advances, your arrows are swatted away or dodged.
                                As he approaches you, he begins to bring his blade down. Expecting this,
                                you dodge towards him, jumping between his legs and rolling behind him.
                                As you bring your own sword to strike him, he whips around and clashes
                                blades with yours. Unable to compete with the strength, your blade goes
                                flying, and you are forced to surrender.
                                
                                "Damn, that was a good fight! I hope you aren't kicking yourself too hard,
                                because not many can win against the guard capitan of Bethel! Although
                                you were definitely skilled, so maybe you could have won with a different
                                strategy."
                                """);

                    }else if(timeline.userClass.getClassType().equals("WIZARD")){
                        Tools.readerln("""
                                With his speed being shown in full force, it seems your target is willing
                                to close the distance as fast as possible. A good strategy against a spell
                                caster, although you've prepared your own strategy against it. As he
                                approaches, you begin firing rocks and water spouts, which are all dodged
                                or slashed away. As the distance is nearly closed, you summon a tailwind
                                behind yourself, speeding yourself and slightly blinding your foe's sight.
                                Dashing around him, you channel a light shock to your fingertips, which are
                                now crackling with lighting and at his back. You call the bout your victory.
                                
                                With a whistle, Magnus exclaims, "Damn, would you look at that! I didn't
                                think any spellcasters had the gall to take on a toe-to-toe with a fighter!
                                And hell, you had luck on your side to boot. Truthfully, I have an amulet
                                that weakens any spells cast on me, but it must be different if you're
                                just using magic to blow wind in my face. Maybe I need to reconsider my
                                opinion of you wizards..."
                                
                                "Considering your overwhelming win and damning circumstance, allow this
                                guard capitan to grant you a small reward!"
                                
                                He pulls out a small amulet that seems to...glisten...?
                                
                                "They said that it was enchanted with a bit of protection from magic.
                                Really, it's only supposed to be for the town guard capitan, but I think
                                you could really use it now."
                                
                                You got the 'Defense Amulet'!
                                """);
                        timeline.addItem("Defense Amulet");
                    }else{
                        Tools.readerln("""
                                You begin charging him in response. In your run, you prepare a flash of light
                                in the palm of your hand in order to blind him, allowing you to strike with ease.
                                As the distance is nearly closed, you reveal your hand, shining a brilliant light
                                in his face, forcing him to close his eyes. However, it seems he also has the
                                mental fortitude to match his strength, as he doesn't let this slow his advance.
                                Striking wildly, you are forced into a defensive position. As his sight returns
                                with wet eyes, his wooden sword finally finds its way through, halting at your
                                neck.
                                
                                "Damn, that was a sneaky move. I didn't think a cleric like yourself even had
                                the freedom to do so! Anyways, I hope you aren't kicking yourself too hard,
                                because not many can win against the guard capitan of Bethel! Although
                                you were definitely skilled, so maybe you could have won with a different
                                strategy."
                                """);
                    }

                }
                Tools.readerln("""
                            "Say, I interested in your fighting style. If you're right about this Wizard,
                            I wouldn't mind giving him a piece of my own mind too. Let me join you,
                            plus there's a chance that we also deal with all of the recent monsters
                            that the town's been seeing lately! Let's meet up tomorrow, we can look for
                            fresh gear at some of the shops tomorrow.
                            """);
            }

            if (event.getAlly().equals("MAGNUS")) {
                day2.setAlly("MAGNUS");
                day2.setLocation("TOWN");
            }


        }else{
            Tools.readerln("""
                    
                    You return to your room to eat quietly. This place seems quite nice, making it
                    all the more a shame that you only have a few days to live. On that note, it
                    seems like you weren't able to get all that much information today, as by the
                    time you finish your food, the building has quieted down, with many having left
                    the inn while the others laid on the tables in booze-fueled slumbers. Not much
                    left for you to do but sleep.
                    """);

            day2.setLocation("TOWN");
        }

        timeline.addEvent(day2);
    }


}
