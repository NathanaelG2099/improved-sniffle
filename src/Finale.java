import javax.tools.Tool;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Finale {

    public static void Start(Scanner scnr, EventRecord timeline){
        if(timeline.findLocation("CHURCH")){
            AlisonPath();
            WizardFight(scnr, timeline);
        }else if(timeline.getAlly(1).equalsIgnoreCase("Magnus")){
            MagnusPath();
            WizardFight(scnr, timeline);
        }else{
            AlonePath(scnr, timeline);
        }

    }

    public static void AlisonPath(){
        Tools.readerln("""
                Awakening in the inn, you meet up with Alison and Sebas
                for your battle in the forest. This will determine if you
                live or die, there is no room for mistakes.
                
                The party has a quiet determination about them. No one
                says a word, only a silent nod to each other as you each
                mount a steed and ride towards the forest.
                
                As you finally approach the crusaders, Alison breaks the
                silence. "When we get there, I'll rally the troops and
                explain our plan. We're going to end him."
                
                She moves ahead of you and Sebas, climbing atop a large
                rock. With here cloak's hood down, she calls out to the
                battalion of holy knights before her.
                
                "Men! In this forest is the evil wizard Alatar. He is
                responsible for countless deaths and atrocities, which
                he does in the name of some twisted science. He is known
                for monstrous testing on living creatures and a wide
                array of magic. Should his test subjects appear,
                clear a path for my companions and I. We will avenge
                those lost to his madness!"
                
                As the crusaders cheer away, Alison returns to you and
                Sebas.
                
                "Let's move out!"
                
                
                
                Your group begins to enter the forest. At first, it seems
                normal, with the occasional game animals appearing.
                However, the forest slowly turns to that abnormal shade
                of green, signifying your entrance to the wizards
                domain. Your first obstacle now approaches.
                
                The creatures can only be described as abominations.
                Sick amalgamations of flesh stand before you, 5 in
                total. Each holds the head of a different animal,
                consisting of Bear, Wolf, Hawk, Spider, and Tiger.
                The remaining body is stitched together remains
                of the other creatures, reanimated with some vile
                magic.
                
                They approach your group, clearly seeing you as a herd
                of prey, rather than a threat. Your rallied soldiers
                move forward to engage them, creating a small opening
                for your smaller squad to move deeper in the forest.
                
                A familiar sight lies ahead of you. A clearing with a
                house in the center, although the flowerbeds have since
                vanished. Alison is the first to speak.
                
                "Is this where Alatar is?"
                
                The door of the house slowly opens, squeaking all the
                way. Instead of revealing anything, the now open door
                looks like a wall of shadow, completely obstructing
                a deeper look. From this shadow, the wizard walks
                out, looking exactly the same as he did the last
                time.
                
                "Why yes, it is. Such a pleasure to see you again,
                Alison. Thank you for bringing my toy back to me,
                but I simply don't have time for you and Sebastian
                today."
                
                He begins to turn around to reenter the building.
                
                "You don't get to run!" Screams Alison, as she
                begins to fire a volley of arrows. As you fear that
                she is going to be paralyzed like you were before,
                you see something strange.
                
                The wizard dodges the attack, whipping around to her.
                With a scowl, he begins to shoot fire and icicles
                in response. You know that he can end this easily,
                so why does he waste the time?
                
                Before you can finish your thought, Sebas appears
                before him, blade ready to part the wizard in two.
                Suddenly, a wave of purple emits from the wizard,
                launching Sebas towards Alison. The wizard seems
                to be breathing heavily, eyes filled with anger.
                He moves towards the pair, who are disoriented
                from the blast and the collision.
                
                Wanting to help, you realize that this is a golden
                opportunity to strike.
                """);
    }

    public static void WizardFight(Scanner scnr, EventRecord timeline){
        boolean decideLoop = true;
        int userInt = 0;

        Tools.readerln("What item do you use?");

        while(decideLoop){
            System.out.println(timeline.getInventory());
            try{
                userInt = scnr.nextInt();
                scnr.nextLine();
                if(userInt > 0 && userInt <= timeline.InventorySize()){
                    decideLoop = false;
                } else {
                    System.out.println("Bad input.");
                }
            } catch (InputMismatchException e){
                System.out.println("Bad input.");
                scnr.nextLine();
            }
        }

        String userItem = timeline.getInventoryIndex(userInt);
        switch (userItem){
            case("Amulet"):
                Tools.readerln("""
                        With the church amulet equipped, you strike at Alatar.
                        His knee-jerk reaction is to blast you away, but the
                        amulet muddles his attacks to nothing more than a
                        drizzle of water.
                        
                        Your attacks land, and the wizard collapses in a truly
                        disappointing manor. He had no combat sense, beyond
                        his magical defenses. He failed to recognize that you,
                        his experiment of a whim, could actually prepare
                        in time to safe your own life. It seems his evil
                        was in his creations and willingness to do horrific
                        things for science.
                        
                        Surprisingly, you can feel a strange sensation, like
                        a film is removed. The curse has been lifted.
                        
                        You Survived!!
                        """);
                break;
            case("CoBolt"):
                Tools.readerln("""
                        With the CoBolt in your hands, you take the shot at
                        Alatar. He attempts to brush it away with magic, but
                        the nature of the shot pierces through the magical veil.
                        """);
                if(timeline.userClass.getClassType().equalsIgnoreCase("ARCHER")){
                    Tools.readerln("""
                            Using your experience of aiming and shooting bows, you
                            align the lightning fast bead right between his eyes.
                            He falls, slain, as you recompose yourself. Surprisingly,
                            you can feel a strange sensation, like a film is removed.
                            The curse has been lifted.
                            
                            You Survived!!
                            """);
                } else{
                    Tools.readerln("""
                            Although your shot strikes him, your lack of experience
                            in ranged weapons meant it was non-fatal. Alatar raises
                            his hand towards the sky, then shoots it down to point
                            at you. The last thing you saw was a storm cloud above
                            you, and a flash of light.
                            
                            You died.
                            """);
                }
                break;
            case("Blessed Blade"):
                Tools.readerln("""
                        Brandishing the blessed blade you were given at The
                        Church, you charge at the wizard. Raising his hand
                        at you, a ball of fire grows from his fingertip.
                        Growing as you make your charge, it has grown
                        horizontally, becoming a wave of fire. Now released,
                        you see it racing towards you. In your moment of
                        danger, the blade shines bright, and from a lack
                        of other options, you slash. The wall of flames
                        parts cleanly, with a golden trim where you cut.
                        It begins to eat away at the remaining flames,
                        dissipating until there is no trace of the fire.
                        
                        Eyes wide, the wizard fires all he can think of.
                        Ice, lightning, earth itself, and it all turns to
                        gold. With the distance closed, all that is left is
                        to end him. The fight is ended with a slash, and a
                        prayer for those he has used.
                        
                        Surprisingly, you can feel a strange sensation, like
                        a film is removed. The curse has been lifted.
                        
                        You Survived!!
                        """);
                break;
            case("Grey Potion"):
                Tools.readerln("""
                        With the potion in your hand, you can't help but
                        feel that it is more malicious than it is helpful.
                        Instead of imbibing it, you throw it at the wizard.
                        
                        Seeing your attempt at harm, he shoots a fireball,
                        breaking the bottle. However, the liquid within is
                        now released, splashing over him. Beginning from the
                        impact points, his body rapidly turns to stone. He
                        has been defeated.
                        
                        However, you feel no difference in yourself regarding
                        the curse he placed.
                        """);
                if(timeline.userClass.getClassType().equalsIgnoreCase("WIZARD")){
                    Tools.readerln("""
                            Looking at the stone statue of the mage, you can still
                            detect his mana. Although he is stone, the magic that
                            he once commanded is still there.
                            """);
                    if(timeline.findInventory("Rune Stone")){
                        Tools.readerln("""
                                You cannot just break the statue, as the pieces would still
                                be magical. Instead, you see your rune stone, and hope that
                                the spell within is a useful one.
                                
                                Upon pouring a drop of your mana to it, you can feel
                                yourself becoming weaker, as if your own essence is draining.
                                The stone is now glowing, and you think your mana is being
                                absorbed! Before it is too late, you place the stone atop
                                the statue. It glows for a time longer, before pattering
                                out and growing dim. The wizard's mana is now gone.
                                
                                You can feel the strange sensation of lifting a curse, like
                                a film is removed. The curse has been lifted.
                                
                                You survived!!
                                """);
                    } else{
                        Tools.readerln("""
                                You cannot just break the statue, as the pieces would still
                                be magical. Without another method of repurposing the mana,
                                you fear your death is unavoidable...
                                
                                You died.
                                """);
                    }
                } else{
                    Tools.readerln("""
                            Unsure on the status of your curse, you begin
                            to return to your companions. Before you get far,
                            your vision grows dim and you body grows weak...
                            
                            You died.
                            """);
                }

                break;
            case("Rusty Blade"):
                Tools.readerln("""
                        You move to attack the wizard, but he quickly
                        moves to stop your actions. Before you have
                        the opportunity to stop him, he has sent a
                        fireball your way. Not wanting to stop
                        yourself, you throw the rusty blade into the
                        flame, in an effort to stop the attack. As
                        the blade enters the fire, the rust is
                        burned off it seems to glow?
                        
                        However, your hopes for some magical effect
                        were unfounded, as it was just melting.
                        Reduced to a liquid, the blade did nothing
                        to stop the ball of flame. It reaches you,
                        and your journey is put to an end.
                        
                        You died.
                        """);
                break;
            case("Agility Potion"):
                Tools.readerln("""
                        Hoping that the potion will help you to avoid
                        incoming attacks, you imbibe it. Although it
                        certainly didn't go down easy, you do feel as
                        though you are faster than usual.
                        
                        You prepare your attacks against the wizard.
                        However, the wizard still holds the power of
                        lightning. Before any of your attacks can
                        hit him, he raises his finger, and a flash
                        of yellow emits from it.
                        
                        Before you know it, you have fallen.
                        
                        You died.
                        """);

                break;
            case("Defense potion"), ("Strength potion"):
                Tools.readerln("""
                        Hoping that the potion will help you to avoid
                        incoming attacks, you imbibe it. Although it
                        certainly didn't go down easy, you do feel as
                        though you are stronger than usual.
                        
                        You prepare your attacks against the wizard.
                        However, the wizard still has his tricks.
                        Although you are able to take the wizard's
                        first strike, you still cannot close the
                        distance. Your own attacks are swatted away
                        like a minor annoyance.
                        
                        He strikes you with spell after spell, stopping
                        any counter attacks as they come. Finally,
                        you can take no more.
                        
                        You died.
                        """);

                break;

            case("Red Ring"):
                Tools.readerln("""
                        With your red ring equipped, you move to attack
                        the wizard. He takes notice, and strikes in return.
                        As a fireball approaches, you narrowly dodge it,
                        and are launched into a tree. However, you notice
                        that the collision didn't hurt at all. Does the
                        ring prevent damage?
                        
                        Redoubling your efforts, you try again to attack,
                        with a renewed confidence. A new attack, a zap
                        of lightning, approaches, and you find something
                        out.
                        
                        The ring only protects from physical damage.
                        
                        You died.
                        """);

                break;
            case("Blue Ring"):
                Tools.readerln("""
                        With your red ring equipped, you move to attack
                        the wizard. He takes notice, and strikes in return.
                        As a fireball approaches, you narrowly dodge it,
                        and are launched into a tree. However, you notice
                        that the collision didn't hurt at all. Does the
                        ring prevent damage?
                        
                        Redoubling your efforts, you try again to attack,
                        with a renewed confidence. A new attack, a zap
                        of lightning, approaches, and you find something
                        out.
                        
                        The ring kept you safe!
                        
                        Moving to finish the wizard, your strike ends him,
                        and he goes still and lifeless.
                        
                        Surprisingly, you can feel a strange sensation, like
                        a film is removed. The curse has been lifted.
                        
                        You survived!!
                        """);

                break;
            case("Rune Stone"):
                Tools.readerln("""
                        Pulling out the small rune stone, you begin to
                        channel some of your mana into it. Whatever spell
                        placed within begins to make the stone glow in
                        a spiral pattern. You raise it towards the
                        wizard and-
                        
                        You feel tired. Unbearably so. It feels like your
                        very essence is draining away, and you realize
                        that it is your mana getting sucked away! You
                        throw the stone to the side, cursing your
                        bad luck.
                        
                        Before you get the chance to attempt another
                        strike on the wizard, your vision goes black
                        and your consciousness fades. He struck you while
                        you were distracted.
                        
                        You died.
                        """);
                break;

            case("Book"):
                Tools.readerln("""
                        Pulling out the book, you flip through to the page
                        that has the most magical energy, and read it
                        aloud.
                        
                        "Live is so funny
                        Look how the turns are tabled
                        Laugh eternally"
                        
                        The mage is about to release his spell. If the
                        effect doesn't prove significant, you will almost
                        certainly die here. As he is finishing a chant,
                        you suddenly hear... Laughter?
                        
                        Most magic needs a chant to cast, so you've
                        effectively silenced him with the book! Now free
                        to take the finishing blow, you channel your spell
                        and deliver the killing joke.
                        
                        You can feel the strange sensation of lifting a curse, like
                                a film is removed. The curse has been lifted.
                                
                                You survived!!
                        """);

                break;

            case("Defense Amulet"):
                Tools.readerln("""
                        With the church amulet equipped, you strike at the wizard.
                        His knee-jerk reaction is to blast you away, but the
                        amulet muddles his attacks to nothing more than a
                        drizzle of water.
                        
                        Your attacks land, and the wizard collapses in a truly
                        disappointing manor. He had no combat sense, beyond
                        his magical defenses. He failed to recognize that you,
                        his experiment of a whim, could actually prepare
                        in time to safe your own life. It seems his evil
                        was in his creations and willingness to do horrific
                        things for science.
                        
                        Surprisingly, you can feel a strange sensation, like
                        a film is removed. The curse has been lifted.
                        
                        You Survived!!
                        """);
                break;
        }


    }

    public static void MagnusPath(){
        Tools.readerln("""
                Awakening in the inn, you meet up with Magnus
                for your battle in the forest. This will determine if you
                live or die, there is no room for mistakes.
                
                The two of you head to the edge of town, where you
                meet up with Hendrickson and the other guards. After
                checking your equipment, Magnus moves to the front of
                the group, and begins a speech.
                
                "Men! Our mission is to head to the forest and quell
                one of the forest threats. We know that there is a
                wizard residing in the forest, and he has proven to
                be a threat for those that encounter him. He may also
                be the cause of the recent monster attacks, so be on your
                guard. Should that wizard create interruptions, I want
                you all to cover us three, being this person right here,
                Hendrickson, and me. We will move forward to slay the
                wizard, then return to you all.
                
                "Now then, lets move out!"
                
                The trip to the forest is surprisingly light-hearted.
                These men are clearly all close with one another, yet
                you can tell that they are still paying attention to
                the smaller details for signs of threats.
                
                Your group begins to enter the forest. At first, it seems
                normal, with the occasional game animals appearing.
                However, the forest slowly turns to that abnormal shade
                of green, signifying your entrance to the wizards
                domain. Your first obstacle now approaches.
                
                The creatures can only be described as abominations.
                Sick amalgamations of flesh stand before you, 5 in
                total. Each holds the head of a different animal,
                consisting of Bear, Wolf, Hawk, Spider, and Tiger.
                The remaining body is stitched together remains
                of the other creatures, reanimated with some vile
                magic.
                
                They approach your group, clearly seeing you as a herd
                of prey, rather than a threat. Your rallied soldiers
                move forward to engage them, creating a small opening
                for your smaller squad to move deeper in the forest.
                
                A familiar sight lies ahead of you. A clearing with a
                house in the center, although the flowerbeds have since
                vanished. Hendrickson is the first to speak.
                
                "Is it safe to assume the wizard is here?"
                
                The door of the house slowly opens, squeaking all the
                way. Instead of revealing anything, the now open door
                looks like a wall of shadow, completely obstructing
                a deeper look. From this shadow, the wizard walks
                out, looking exactly the same as he did the last
                time.
                
                "Why yes, it is. Say, aren't you folks the guards
                from the village? Thank you for bringing my toy back to me,
                but I simply don't have time for you today."
                
                The wizard begins to cast his spell, when small lights
                begin to gather around his hands. They then begin to smoke,
                and you can see disdain in the wizards eyes.
                
                "You. Blue one." He seems to be referring to Hendrickson.
                "How do you know counter magic? It's practically a lost
                art."
                
                Hendrickson pulls out a sword, keeping his offhand free.
                
                "That's a secret that you aren't going to live to discover."
                
                "Nice one-liner Hendrickson" chimes Magnus.
                
                The two of them both begin charging at the wizard, spells
                being countered or dodged. Just as they get near, however,
                the wizard throws a feint, disguising a punch as a shockwave.
                Being so close, the two of them are launched and dazed,
                their ears clearly their largest pains.
                
                However, the wizard seems to be breathing heavily, eyes
                filled with anger. He moves towards the pair, who are disoriented
                from the blast and the collision.
                
                Wanting to help, you realize that this is a golden
                opportunity to strike.
                """);

    }

    public static void AlonePath(Scanner scnr, EventRecord timeline){
        Tools.readerln("""
                Awakening early in your encampment, you only have the goal
                to free yourself from this curse. For this means, you
                begin your day by gathering your weapons and tools,
                before making your way to the forest.
                
                As you do, the forest feels like a normal forest so far.
                However, the forest slowly turns to that abnormal shade
                of green, and animals begin to go silent. This must be
                signifying your entrance to the wizards domain. Your
                first obstacle now approaches.
                
                The creatures can only be described as abominations.
                Sick amalgamations of flesh stand before you, 5 in
                total. Each holds the head of a different animal,
                consisting of Bear, Wolf, Hawk, Spider, and Tiger.
                The remaining body is stitched together remains
                of the other creatures, reanimated with some vile
                magic.
                
                However, they all kneel down, making a distinct path
                for you to follow deeper into the woods. Now, a
                familiar sight lies ahead of you. A clearing with a
                house in the center, although the flowerbeds have since
                vanished.
                
                The wizard is standing before you, clearly eager to meet
                you again.
                
                "Ah, I'm so glad you returned! I always love to directly
                see the results of my experiments. Before we do that
                though, show me your little goodie you brought to
                take me down. I want to laugh at your effort. Then
                you can make your feeble attempt to kill me."
                
                It seems you need to reveal one of your items to even
                earn a fight. If you don't have any, however, you'll
                surely have a repeat of last time, ending with your
                death.
                """);

        boolean decideLoop = true;
        int userInt = 0;

        Tools.readerln("What item do you reveal?");

        while(decideLoop){
            System.out.println(timeline.getInventory());
            try{
                userInt = scnr.nextInt();
                scnr.nextLine();
                if(userInt > 0 && userInt <= timeline.InventorySize()){
                    decideLoop = false;
                } else {
                    System.out.println("Bad input.");
                }
            } catch (InputMismatchException e){
                System.out.println("Bad input.");
                scnr.nextLine();
            }
        }
        timeline.loseItem(userInt);

        Tools.readerln("""
                Upon seeing your item, the wizard laughs, so hard that
                he has tears in his eyes.
                
                "You were planning on killing me with this? Please,
                just be a good research toy and die. Experiments one
                through 5, you're good to keep patrolling the forest!
                This one's no threat at all."
                
                The abominations begin to leave, and after a few
                seconds, you can only sense the presence of the wizard
                left.
                
                If there's a time to pull out a secret trump card, it's
                now.
                """);

        if(timeline.InventoryIsEmpty()){
            Tools.readerln("""
                    Without a secret to pull, you go to directly attack the
                    wizard. However, it's futile, and you freeze up like
                    before.
                    
                    "Alright! Time to see the results."
                    
                    You feel a chill run down your body, before your eyes
                    can't stay open any longer. The last thing you hear is:
                    
                    "Aw, I guess I need to rework that magic circle..."
                    
                    You died.
                    """);
        } else{
            WizardFight(scnr, timeline);
        }

    }


}
