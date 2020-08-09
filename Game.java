import java.util.*;
//import java.io.IOException;
public class Game
{

    public static void main(String[] args)
    {

        Random gen = new Random();
        Scanner s = new Scanner(System.in);
        int health = 100;
        int points = 10;
        String powerup = "None";
        String [] power = new String [5];
        while(health > 0){
            //Random gen = new Random();
            ln("Hi I'm very glad you want to play my game");
            ln("What is your name?");
            String name = s.next();
            ln("Hi " + name + " Let's get started!");
            wait(1000);
            clear();
            moveConfig("AN EXPERIMENT GONE WRONG", 65);
            System.out.println("You are the child of two scientists. Like usual after dinner, you head to your room to sleep."); 
            System.out.println ("And like usual your parents are busy with their scientific research in the laboratory");
            System.out.println("Just as you are about to fall asleep, you here a big boom underneath you");
            System.out.println("You sit up straight in your bed and there is rumbling underneath you");
            System.out.println("There is a flash of bright light and you fall through a portal that has opened up under your bed");
            System.out.println("You tumble through the portal onto a cold surface of crystals and this is");
            System.out.println(""); 
            try
            {
                Thread.sleep(12000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            move("WHERE YOUR STORY BEGINS...");
            int time = 2;
            System.out.println(""); 

            moveConfig("             ,.,.", time);
            moveConfig("           ((((^))", time);
            moveConfig("           d e_# b", time);
            moveConfig("            \\._./", time);
            moveConfig("        ,---i`-'i---.", time);
            moveConfig("       /  |  `-'  |  |", time);
            moveConfig("       |__|       |__|", time);
            moveConfig("        \\ |        | |", time);
            moveConfig("         \\______ | |", time);
            moveConfig("          \\/ )   \\|| |", time);
            moveConfig("          |-  |   |'//\"", time);
            moveConfig("          |___|___|", time);
            moveConfig("           |  |  |", time);
            moveConfig("           (  |  )", time);
            moveConfig("           {_ |__|", time);
            moveConfig("           (__|__}", time);
            moveConfig("          _>= | =<_", time);
            moveConfig("         (__._|_.__)", time);

            moveConfig("                 =/;;/-", time);
            moveConfig("                +:    //", time);
            moveConfig("               /;      /;", time);
            moveConfig("              -X        H.", time);
            moveConfig(".//;;;:;;-,   X=        :+   .-;:=;:;%;.", time);
            moveConfig("M-       ,=;;;#:,      ,:#;;:=,       ,@", time);
            moveConfig(":%           :%.=/++++/=.$=           %=", time);
            moveConfig(" ,%;         %/:+/;,,/++:+/         ;+.", time);
            moveConfig("   ,+/.    ,;@+,        ,%H;,    ,/+,", time);
            moveConfig("      ;+;;/= @.  .H##X   -X :///+;", time);
            moveConfig("      ;+=;;;.@,  .XM@$.  =X.//;=%/.", time);
            moveConfig("   ,;:      :@%=        =$H:     .+%-", time);
            moveConfig(",%=         %;-///==///-//         =%,", time);
            moveConfig(";+           :%-;;;;;;;;-X-           +:", time);
            moveConfig("@-      .-;;;;M-        =M/;;;-.      -X", time);
            moveConfig(" :;;::;;-.    %-        :+    ,-;;-;:==", time);
            moveConfig("              ,X        H.", time);
            moveConfig("               ;/      %=", time);
            moveConfig("                //    +;", time);
            moveConfig("                 ,////,", time);
            wait(1000);
            clear();

            //Scene 1

            getInfo(health, points, "None");
            String answer1;

            move("This is the first start of your journey. You are in a narrow passageway lined with crystals and");
            move(" there is a small door wooden door that leads to the end. You also notice that there is a red switch");
            move(" next to that door. Do you decide to press the red switch next to the door or go into to the wooden door ");
            move(" directly? Answer \"press\" or \"go\"");
            answer1 = s.next();

            if(answer1.equalsIgnoreCase("press")){
                move("A trapdoor opens up underneath you and you fall");
                move("over 50 feet. You lose 50 health");
                health = health - 50;
                getInfo(health, points, "None");
            }else if(answer1.equalsIgnoreCase("go")){
                move("A stoney path is lit up by torches going downhill. After walking 100 feet");
                move("You find a treasure chest of a 50 coins and continue to walk for another 100 feet");
                points = points + 50;
                getInfo(health, points, "None");

            }else{
                while(answer1 != "press" || answer1 != "go"){
                    ln("Invalid. Try Again. Answer \"press\" or \"go\"");    
                    answer1 = s.next();
                    if(answer1.equalsIgnoreCase("press")){
                        move("A trapdoor opens up underneath you and you fall");
                        move("over 50 feet. You lose 50 health");
                        health = health - 50;
                        getInfo(health, points, "None");
                        break;
                    }else if(answer1.equalsIgnoreCase("go")){
                        move("A stoney path is lit up by torches going downhill. After walking 100 feet");
                        move("You find a treasure chest of a 50 coins and continue to walk for another 100 feet");
                        points = points + 50;
                        getInfo(health, points, "None");
                        break;

                    }
                }

            }
            wait(500);
            clear();
            move("");

            //Scene 2

            getInfo(health, points, "None");
            String answer2;

            move("You are now in a tall cold circular room and you see two corridors ");
            move("One emits a neon blue glow and the other one emits a fiery red light");
            move("Do you decide to go into the blue or red corridor? ");
            move(" Answer \"red\" or \"blue\"");
            answer2 = s.next();

            if(answer2.equalsIgnoreCase("red")){
                move("A small floating wizard appears before you and will guide you through your journey");
                move("The points system allows you to unlock the level to the final castle ");
                move("You will need a minimum of 300 points. Here is a gift of points to you.");
                int pointsadd = gen.nextInt(50) + 1;
                points = points + pointsadd;
                move("You get " + pointsadd + " points.");
                

                getInfo(health, points, "None");
            }else if(answer2.equalsIgnoreCase("blue")){
                move("A small floating wizard appears before you and will guide you through your journey");
                move("The health bar must stay above 0. Once it reaches 0 the game ends");
                move("Here is a gift of health to you.");
                int healthadd = gen.nextInt(30) + 1;
                move("You get " + healthadd + " health");
                health = health + healthadd;
                getInfo(health, points, "None");

            }else{
                while(answer2 != "red" || answer2 != "blue"){
                    ln("Invalid. Try Again. Answer \"red\" or \"blue\"");    
                    answer2 = s.next();
                    if(answer2.equalsIgnoreCase("red")){
                        move("A small floating wizard appears before you and will guide you through your journey");
                        move("The points system allows you to unlock the level to the final castle ");
                        move("You will need a minimum of 500 points. Here is a gift of points to you.");
                        int pointsadd = gen.nextInt(50) + 1;
                        move("You get " + pointsadd + " points.");
                        points = points + pointsadd;

                        getInfo(health, points, "None");
                        break;
                    }else if(answer2.equalsIgnoreCase("blue")){
                        move("A small floating wizard appears before you and will guide you through your journey");
                        move("The health bar must stay above 0. You had 100 health to start with. Once it reaches 0 the game ends");
                        move("Here is a gift of health to you.");
                        int healthadd = gen.nextInt(50) + 1;
                        move("You get " + healthadd + " health");
                        health = health + healthadd;
                        getInfo(health, points, "None");
                        break;

                    }

                }
            }
            move("");
            wait(500);
            clear();
            move("");

            //Scene 3-----------------------------------
            getInfo(health, points, "None");
            String answer3;

            // move("After you continue walking past the corridor");
            move("You come out into a huge new world. It is filled with flowers and an open meadow");
            move("Further into the distance, there is a huge castle with stone walls and covered by a dead forest and fogged trees");
            move("Wizard: Welcome to the realm of Gapel. This once peaceful land is now encroached by an evil dark lord named Dark Master");
            move("Wizard: A human was prophesized to save our wizard and sorcerer kind and now you are chosen to defeat the evil master.");
            move("Wizard: But you need some food first");
            move("There are some red berries in a bush, a round doughy stone, and a blue apple on the ground next to that.");

            moveConfig("             ,.,.", time);
            moveConfig("           ((((^))", time);
            moveConfig("           d e_# b", time);
            moveConfig("            \\._./", time);
            moveConfig("        ,---i`-'i---.", time);
            moveConfig("       /  |  `-'  |  |", time);
            moveConfig("       |__|       |__|", time);
            moveConfig("        \\ |        | |", time);
            moveConfig("         \\______ | |", time);
            moveConfig("          \\/ )   \\|| |", time);
            moveConfig("          |-  |   |'//\"", time);
            moveConfig("          |___|___|", time);
            moveConfig("           |  |  |       _ \'-_,#     \\ | /            ,--./,-.", time);
            moveConfig("           (  |  )      _\'--','`|   '-.;;;.-         / #      \\", time);
            moveConfig("           {_ |__|       \\Berries/  -==;Stone==-     |   apple  |", time);
            moveConfig("           (__|__}      \\`---`  /    .-';;;'-.      \\        /", time);
            moveConfig("          _>= | =<_                                  --()------", time);
            moveConfig("         (__._|_.__)", time); 
            moveConfig("_______________________________________________________________________________________", time);

            move("Which item do you choose? Answer \"berries\", \"stone\", or \"apple\"");
            answer3 = s.next();
            if(answer3.equalsIgnoreCase("berries")){
                move("You ate berries that gave you strength and were delicious to eat");
                // move("The points system allows you to unlock the level to the final castle ");
                move("You get 30 health and 40 points");

                points = points + 40;
                health = health + 30;

                getInfo(health, points, "None");
            }else if(answer3.equalsIgnoreCase("stone")){
                move("The stone was not food but a powerup that shields you from some of Dark Master's moves in the final battle");
                move("You now have the shield powerup");
                powerup = "Shield";
                power[1] = "shield";
                getInfo(health, points, powerup);

            }else if(answer3.equalsIgnoreCase("apple")){
                move("Oh no! That apple had been cursed by the dark master with a spell that causes you to faint");
                move("This debalitating spell causes you to lose 25 health");
                health = health - 25;
                getInfo(health, points, powerup);
            }
            else{
                while(answer3 != "berries" || answer3 != "stone" || answer3 != "apple"){
                    ln("Invalid. Try Again. Answer \"berries\" or \"stone\" or \"apple\"");    
                    answer3 = s.next();
                    if(answer3.equalsIgnoreCase("berries")){
                        move("You ate berries that gave you strength and were delicious to eat");
                        // move("The points system allows you to unlock the level to the final castle ");
                        move("You get 30 health and 40 points");

                        points = points + 40;
                        health = health + 30;

                        getInfo(health, points, "None");
                        break;
                    }else if(answer3.equalsIgnoreCase("stone")){
                        move("The stone was not food but a powerup that shields you from some of Dark Master's moves in the final battle");
                        move("You now have the shield powerup");
                        powerup = "Shield";
                        power[1] = "shield";
                        getInfo(health, points, powerup);
                        break;
                    }else if(answer3.equalsIgnoreCase("apple")){
                        move("Oh no! That apple had been cursed by the dark master with a spell that causes you to faint");
                        move("This debalitating spell causes you to lose 25 health");
                        health = health - 25;
                        getInfo(health, points, powerup);
                        break;
                    }

                }
            }
            move("");
            wait(500);
            clear();
            move("");

            //Scene 4----------------
            getInfo(health, points, powerup);
            String answer4;

            move("After eating, you are in a huge field of tall grasses. The forest, called Door of Worlds, leading to the castle approaches but you can't see anything beyond the grass");
            move("You continue tred on in the muddy ground but suddenly get stuck. Then out of nowhere one of Dark Master's minions come flying out of nowhere");
            move("It is a winged lizard, the size of a dog, and it has red eyes and a red body. It's highly sharp claws can rip through anything and is preparing to attack while your stuck");
            move("Wizard: Such winged demons called Landers have been set out to counter any resistance to his rule.");
            move("Wizard: Us Wizards and Sorcerers have tried but our build and nature is very weak to combat the landers. ");
            move("Wizard: You must defeat this Lander, he is the first of many more. Their weakness is their speed");
            move("Do you try to attack, defend, or talk to the Lander? ");        

            answer4 = s.next();
            if(answer4.equalsIgnoreCase("attack")){
                move("You punch the Lander and grab hold of one of his wings");
                move("The Lander tries to fly away and pulls you out of the grass. You can now proceed with a reward of 100 points");
                points = points + 100;
                getInfo(health, points, powerup);
            }else if(answer4.equalsIgnoreCase("defend")){
                move("Oh No! The Lander dives straight at you and knocks you off balance");
                move("But after diving, the Lander swoops right past you as you dodge him");
                move("You get 50 points but lose 10 health;");
                points = points + 50;
                health = health - 10;

            }else if(answer4.equalsIgnoreCase("talk")){
                move("This was not a good descision considering the agression of the Lander");
                move("Right as you are about to move your mouth.the Lander dives in and pushes you down");
                move("You lose 45 health");
                health = health - 45;
                getInfo(health, points, powerup);
            }
            else{
                while(answer4 != "attack" || answer4 != "defend" || answer4 != "talk"){
                    ln("Invalid. Try Again. Answer \"attack\" or \"defend\" or \"talk\"");    
                    answer4 = s.next();
                    if(answer3.equalsIgnoreCase("attack")){
                        move("You punch the Lander and grab hold of one of his wings");
                        move("The Lander tries to fly away and pulls you out of the grass. You can now proceed with a reward of 100 points");
                        points = points + 100;
                        getInfo(health, points, powerup);
                        break;
                    }else if(answer4.equalsIgnoreCase("defend")){
                        move("Oh No! The Lander dives straight at you and knocks you off balance");
                        move("But after diving, the Lander swoops right past you as you dodge him");
                        move("You get 50 points but lose 10 health;");
                        points = points + 50;
                        health = health - 10;
                        break;
                    }else if(answer4.equalsIgnoreCase("talk")){
                        move("This was not a good descision considering the agression of the Lander");
                        move("Right as you are about to move your mouth.the Lander dives in and pushes you down");
                        move("You lose 45 health");
                        health = health - 45;
                        getInfo(health, points, powerup);
                        break;
                    }

                }
            }
            move("");
            wait(500);
            clear();
            move("");

            //Scene 5----------------
            getInfo(health, points, powerup);
            String answer5;
            move("You run away from the field of tall grasses and head towards the Door of Worlds forest ");
            move("But unfortunately there is a river blocking your path");
            move("On the river bank there is a hut, and few meters beyond that is a docked unattended boat");
            move("Do you choose to go in the hut or in the boat? Answer \"hut\" or \"boat\"");

            moveConfig("                                        |",time);
            moveConfig("                                      \\ - /", time);
            moveConfig("                                    -= (-) =-", time);
            moveConfig("   .\\/.                               /   \\", time);
            moveConfig(".\\\\//o\\\\                      ,\\/.      | ", time);
            moveConfig("//o\\\\|,\\/.   ,.,.,   ,\\/.  ,\\//o\\\\                     |\\", time);
            moveConfig("  |  |//o\\  /###/#\\  //o\\  /o\\\\|                      /| \\", time);
            moveConfig("^^|^^|^~|^^^|' '|:|^^^|^^^^^|^^|^^^\"\"\"\"\"\"\"\"(\"~~~~~~~~/_|__\\~~~~~~~~~~", time);
            moveConfig(" .|'' . |  '''\"\"'\"''. |`===`|''  '\"\" \"\" \" (\" ~~~~ ~ ~======~~  ~~ ~", time);
            moveConfig(" ^^^^   ^^^ ^ ^^^ ^^^^ ^^^ ^^ ^^ \"\" \"\"\"( \" ~~~~~~ ~~~~~  ~~~ ~", time);

            answer5 = s.next();
            if(answer5.equalsIgnoreCase("hut")){
                move("You go into a hut and you find a powerup. This powerup is in a vial labeled Speed and you drink the potion ");
                move("While the potion gives you a speed boost for the final battle it also takes away health from you");
                move("You lose 15 health, but you cross the river and reach the edge of the Door of Worlds the huge spooky forest ");
                health = health - 15;
                powerup = "Speed";
                boolean sped = true;
                power[2] = "speed";
            }else if(answer5.equalsIgnoreCase("boat")){
                move("You rush into the boat and start to paddle towards the other side");
                move("Immediatley small waves hit the boat causing to disintegrate");
                //move("But your expert maneuvering skills allow you to make it safely to the other side");
                move("Your boat diassambles right as you reach the edge and your feet get wet");
                move("You gain 50 points");
                points = points + 50;
            }else{
                while(answer5 != "hut" || answer5 != "boat"){
                    ln("Invalid. Try Again. Answer \"hut\" or \"boat\"");    
                    answer5 = s.next();
                    if(answer5.equalsIgnoreCase("boat")){
                        move("You go into a hut and you find a powerup. This powerup is in a vial labeled Speed and you drink the potion ");
                        move("While the potion gives you a speed boost for the final battle it also takes away health from you");
                        move("You lose 15 health");
                        health = health - 15;
                        powerup = "Speed";
                        power [2] = "speed";
                        break;
                    }else if(answer5.equalsIgnoreCase("hut")){
                        move("You rush into the boat and start to paddle towards the other side");
                        move("Immediatley small waves hit the boat causing it to disintegrate");
                        //move("But your expert maneuvering skills allow you to make it safely to the other side");
                        move("Your boat diassambles right as you reach the edge and your feet get wet");
                        move("You gain 50 points");
                        points = points + 50;
                        break;
                    }

                }
            }
            move("");
            wait(500);
            clear();
            move("");

            //Scene 6-----------
            getInfo(health, points, powerup);

            move("Wizard: Welcome to........the Door of Worlds");
            moveConfig("                                            .__ ._       \\_", time);
            moveConfig("                                     _, _.  '  \\/   \\.-  /", time);
            moveConfig("                     .-\"\"\"\"-.          \\.   '   \\`. ||  \\.-'  /", time);
            moveConfig("                    F        Y        .-.`-(   _/\\ V/ \\\\//,-' >-'   ._,", time);
            moveConfig("                   F          Y   .__/   `. \\.   ' J   ) ./  / __._/", time);
            moveConfig("                  J         \\, I    '   _/ \\  \\  | |  / /  .'-'.-' `._,", time);
            moveConfig("           (       L   \\_.--.| \\_.      ' .___ `\\: | / .--'.-'\"     \\", time);
            moveConfig("         \\ '\\    .  L   /    \\\\/        ._/`-.`  \\ .'.' .'---./__   '", time);
            moveConfig("    \\__  '\\ ) \\._/   `-.__. ` \\\\_. '   .---.  \\     /  /  ,   `  `", time);
            moveConfig("  --'  \\\\  ): // \\,            `-.`__.'     `- \\  /   / _/-.---.__.- .", time);
            moveConfig("     _.-`.'/ /'\\_, ._     >--.-\"\"'____.--\"`_     '   /.'..' \\   \\   _/`", time);
            moveConfig(" _ .---._\\ \\'/ '__./__.-..  / .-|(    x_.-'___  |   :' /    _..---_' \\", time);
            moveConfig(" .:' /`\\ `. `..'.--'\\      /.' /`-`._  `-,'   ` '   I '_.--'__--..___.--._.-", time);
            moveConfig("     `  `. `\\/'/  _.   _.-'      _.____./ .-.--\"\"-. .-\"    ' _..-.---'   \\", time);
            moveConfig("  -._ .--.\\ / /-./     /   .---'-//.___. .-'       \\__ .--.  `    `.     '`-", time);
            moveConfig(" ,--'/.-. ^.   .-.--.  ` _/    _//     ./   _..   .'  `.    \\ \\    |_.", time);
            moveConfig("    /' | >.   ' | \\._.-       '    _..'  `.' . `.       )    | |\\  `", time);
            moveConfig("  ./ \\ \\'  ) c| /  \\     \\_..  .--'    ,\\ \\_/`  :    )  (`-. `.|`\\\\", time);
            moveConfig("   \\'  / ,-.  | ` ./`  ._/ `\\\\'.--.,-((  `.`.__ |   _/   \\    |)  `--._/`", time);
            moveConfig("______'\\   |  < __________  //'  //  _)   )/-._`.  (,-')  )  / \\_.    /\\. _____", time);
            moveConfig("a:f        |  |        .__./    //  '\\  |//    `.\\ '\\ (  (  <`   ._  '", time);
            moveConfig("           >  |      _.  /   ..-\\ _    _/ \\_.  \\ `\\    \\_ `---.-'__", time);
            moveConfig("        . /  `-   _.'        /   `   _/|       J  /`     `-,,-----.`-.", time);
            moveConfig("            '  .:'          '`      '          < `   f  I //        `­\\_,", time);
            moveConfig("              '                         \\.     J        I/\\_.        ./", time);
            moveConfig("         __/                            `:     I  .:    K  `          `", time);
            moveConfig("         \\/ )                            `,   J         L", time);
            moveConfig("          )_(_                             .  F  .-'    J", time);
            moveConfig("         /    `.                           .  I  (.   . I _.-.._", time);
            moveConfig("   '    <'    \\ )                     _.---.J/      :'   L -'", time);
            moveConfig(" .:.     \\. _.->/                        _.-'_.)     ` `-.`---.,_.", time);
            moveConfig(":<        (    \\                    .--\"\"   .F' J) `.`L.__`-.___", time);
            moveConfig(".:        |-'\\_.|                          Y ..Z     ))   `--'  `-", time);
            moveConfig(".         ) | > :                            . '    :'", time); 
            moveConfig("          / ) L_J                            .x,.", time); 
            moveConfig("          L_J .,                             .:<.,", time); 
            moveConfig("        .'`   `                               :J.,`", time); 

            wait(100);

            move("Wizard: You will find a swarm of Landers and a pool of lava that you will have to cross");
            move("Wizard: Stay safe human...Stay safe");
            move("You venture deeper into the forest and cross over dead branches");
            move("You pass by many dead trees and stumble upon an invisibility powerup");
            move("Do you take it?");
            String p = s.next();
            if(p.equalsIgnoreCase("Yes")){
                powerup = "Invisibility";
                boolean invis = true;
            }
            //move("Your Powerups: Invisibility: " + invis + " ");
            
            
            move("The swarm of Landers are approaching. Here you will quickly have to combat many landers in a series of attacks");
            move("Let's Begin");
            String [] landers;
            String ansStreak;
            String [] landers1 = {"Agility", "Flight", "Speed", "Punch", "Vision", "Reasoning", "Reflexes", "Speed", "Vision", "Talons"};
            for(int i = 0; i < 10; i++){
                move("Lander " + (i+1) + ": Weakness - " + landers1[i]);
                move("Do you choose to fight, defend, duck, or talk? Answer \"fight\", \"defend\", \"duck\" or \"talk\" " );
                ansStreak = s.next();
                if(ansStreak.equalsIgnoreCase("fight") && (landers1[i].equalsIgnoreCase("Speed")|| landers1[i].equalsIgnoreCase("Talons") || landers1[i].equalsIgnoreCase("Agility") || landers1[i].equalsIgnoreCase("Flight") )){
                    move("You beat Lander " + (i + 1) + ". You get 75 points and 35 health");
                    points = points + 75;
                    health += 35;
                    getInfo(health, points, powerup);
                    wait(100);
                }else if(ansStreak.equalsIgnoreCase("fight")){
                    move("You beat Lander " + (i + 1) + ", but with great difficulty. You get 50 points and lose 15 health");
                    points = points + 50;
                    health -= 15;
                    getInfo(health, points, powerup);
                    wait(100);
                }
                if(ansStreak.equalsIgnoreCase("Defend") && (landers1[i].equalsIgnoreCase("Vision") || landers1[i].equalsIgnoreCase("Reflexes") || landers1[i].equalsIgnoreCase("Punch") )){
                    move("You beat Lander " + (i + 1) + ". You get 75 points and 50 health");
                    health += 50;
                    points = points + 75;
                    getInfo(health, points, powerup);
                    wait(100);
                }else if(ansStreak.equalsIgnoreCase("Defend")){
                    move("You lost to Lander " + (i + 1) + ", but with great difficulty. You get 30 points and lose 10 health");
                    points = points + 30;
                    health -= 10;
                    getInfo(health, points, powerup);
                    wait(100);
                }
                if(ansStreak.equalsIgnoreCase("Duck") && (landers1[i].equalsIgnoreCase("Reflexes") || landers1[i].equalsIgnoreCase("Vision") || landers1[i].equalsIgnoreCase("Talons") )){
                    move("You beat Lander " + (i + 1) + ". You get 75 points and 50 health");
                    health = health + 50;
                    points = points + 75;
                    getInfo(health, points, powerup);
                    wait(100);
                }else if(ansStreak.equalsIgnoreCase("Duck")){
                    move("You lost to Lander " + (i + 1) + ", but with great difficulty. You get 10 points and lose 20 health");
                    points = points + 10;
                    health -= 20;
                    getInfo(health, points, powerup);
                    wait(100);
                }
                if(ansStreak.equalsIgnoreCase("Talk") && (landers1[i].equalsIgnoreCase("Reasoning"))){
                    move("You beat Lander " + (i + 1) + ". You get 60 points");
                    points = points + 75;
                    getInfo(health, points, powerup);
                    wait(100);
                }else if(ansStreak.equalsIgnoreCase("Talk")){
                    move("You lost to Lander " + (i + 1) + " with great difficulty. You get 10 points and lose 25 health");
                    points = points + 10;
                    health -= 25;
                    getInfo(health, points, powerup);
                    wait(100);
                }

                //getInfo(health, points, powerup);
                wait(500);
                clear();

            }
            //Scene 8--------
            getInfo(health, points, powerup);
            String answer8;
            move("Wizard: You made it. Now how do you wish to cross the lava lake? Answer \"boat\" or \"zipline\"");
            answer8 = s.next();
            if(answer8.equalsIgnoreCase("boat")){
                move("The boat melts in the lava lake and you barely manage to jump across with a loss of 10 health");
                health = health - 10;
                getInfo(health, points, powerup);
            }else if(answer8.equalsIgnoreCase("zipline")){
                move("You safely reach across. You get 100 points");
                points = points + 100;
                getInfo(health, points, powerup);
            }
            wait(500);
            clear();

            //Scene Final Battle
            getInfo(health, points, powerup);

            move("You have reached the final castle and must battle the Dark Master");
            move("Wizard: Go in the castle and save Gapel!");
            move("You go into the castle and you see the Dark Master in the center of a room of dark blue torches");
            move("Dark Master: I've been expecting you. We must battle for control of this realm");
            move("Dark Master: I also have the portal you desire");
            move("Say something back to the Dark Master >>>");
            String dialogue = s.next();
            move("Fine Let's Begin");
            move("You find a health boost of 150");
            health = health + 150;
            moveConfig("   ,    ,    /\\   /\\", time);
            moveConfig("  /( /\\ )\\  _\\ \\_/ /_", time);
            moveConfig("  |\\_||_/| < \\_   _/ >", time);
            moveConfig("  \\______/  \\|0   0|/", time);
            moveConfig("    _\\/_   _(_  ^  _)_", time);
            moveConfig("   ( () ) /`\\|V\"\"\"V|/`\\", time);
            moveConfig("     {}   \\  \\_____/  /", time);
            moveConfig("     ()   /\\   )=(   /\\", time);
            moveConfig("     {}  /  \\_/\\=/\\_/  \\", time);
            move("Make your moves...Get Ready...");

            int dh = 350;
            String finalb;
            int at;
            int st;
            if(points > 300){
                while(dh > 0){
                    move("Make your move >>>");
                    
                    move("Your Moves: Attack, Defend, Powerup");
                    finalb = s.next();
                    if(finalb.equalsIgnoreCase("Attack")){
                        at = gen.nextInt(40) + 1;
                        move("You: You did " + at + " damage to the Dark Master");
                        st = gen.nextInt(25) + 1;
                        move("Dark Master: He did " + st + " damage to you");
                        dh = dh - at;
                        health = health - st;
                        move("Dark Master Health: " + dh);
                        getInfo(health, points, powerup);
                    }else if(finalb.equalsIgnoreCase("Defend")){
                        st = gen.nextInt(15) + 1;
                        move("You blocked his move and only took " + st + " damage");
                        health = health - st;
                        at = gen.nextInt(25) + 1;
                        move("You dealt " + at + " damage");
                        dh = dh - at;
                        move("You also get 5 health");
                        health = health + 5;
                        move("Dark Master Health: " + dh);
                        getInfo(health, points, powerup);
                    }else if(finalb.equalsIgnoreCase("Powerup")){
                        if(powerup.equalsIgnoreCase("shield")){
                            move("You get 50 health");
                            health = health + 50;
                            powerup = "None";
                            getInfo(health, points, powerup);
                        }else if(powerup.equalsIgnoreCase("speed")){
                            move("You do 40 damage and get 30 health");
                            health = health + 30;
                            dh = dh - 40;
                            powerup = "None";
                        }else if(powerup.equalsIgnoreCase("invisibility")){
                            move("With invisibility, you creep past him and attack. You do 60 damage");
                            dh = dh - 60;
                            move("Dark Master Health: " + dh);
                            powerup = "None";
                            getInfo(health, points, powerup);
                        }else{
                            move("No powerup");
                        }
                    }
                }
                move("Finally you reach the portal and your back in your bedroom.");
                move("You fall right back to asleep like it was a dream all along");
                move("The End. Thank You For Playing!");
                wait(10000);
                System.exit(0);
            }else{
                move("You get a 100 points");
                points = points + 100;
                while(dh > 350){
                    move("Make your move >>>");
                    finalb = s.next();
                    move("Your Move: Attack, Defend, Powerup");
                    if(finalb.equalsIgnoreCase("Attack")){
                        at = gen.nextInt(40) + 1;
                        move("You: You did " + at + " to the Dark Master");
                        st = gen.nextInt(25) + 1;
                        move("Dark Master: He did " + st + " damage to you");
                        dh = dh - at;
                        health = health - st;
                        move("Dark Master Health: " + dh);
                        getInfo(health, points, powerup);
                    }else if(finalb.equalsIgnoreCase("Defend")){
                        st = gen.nextInt(15) + 1;
                        move("You blocked his move and only took " + st + " damage");
                        health = health - st;
                        at = gen.nextInt(25) + 1;
                        move("You dealt " + at + " damage");
                        dh = dh - at;
                        move("You also get 5 health");
                        health = health + 5;
                        move("Dark Master Health: " + dh);
                        getInfo(health, points, powerup);
                    }else if(finalb.equalsIgnoreCase("Powerup")){
                        if(powerup.equalsIgnoreCase("shield")){
                            move("You get 50 health");
                            health = health + 50;
                            powerup = "None";
                            getInfo(health, points, powerup);
                        }else if(powerup.equalsIgnoreCase("speed")){
                            move("You do 40 damage and get 30 health");
                            health = health + 30;
                            dh = dh - 40;
                            powerup = "None";
                        }else if(powerup.equalsIgnoreCase("invisibility")){
                            move("You do 60 damage");
                            dh = dh - 60;
                            move("Dark Master Health: " + dh);
                            powerup = "None";
                            getInfo(health, points, powerup);
                        }else{
                            move("No powerup");
                        }
                    }
                }
                move("Finally you reach the portal and your back in your bedroom.");
                move("You fall right back to asleep like it was a dream all along");

            }

        }//while
        move("You Lost! Better luck next time");
    }

    public static void ln(String l){
        System.out.println(l);
    }

    public static void print(String l){
        System.out.print(l);
    }

    public static void feed(){
        System.out.print("\n");
    }
    static char test [] = new char[100000];
    public static void move(String l){

        test = l.toCharArray();
        for(int k = 0; k < l.length(); k++){

            System.out.print(test[k]);

            try
            {
                Thread.sleep(40);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

        }
        System.out.println("");
    }

    public static void moveConfig(String l, int q){

        test = l.toCharArray();
        for(int k = 0; k < l.length(); k++){

            System.out.print(test[k]);

            try
            {
                Thread.sleep(q);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

        }
        System.out.println("");
    }

    public static void clear(){

        System.out.print("\u000c");
    }

    public static void wait(int q){

        try
        {
            Thread.sleep(1500 + q);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }
    static int Config = 10;
    public static void getInfo(int health, int points, String powerup){
        ln("");
        moveConfig("Health: " + health, Config);
        moveConfig("points: " + points, 10);
        moveConfig("Powerup: " + powerup, 10);
        ln("");
    }

}

