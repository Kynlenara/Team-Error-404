import java.lang.Thread;

public class Game {
    Player pc;
    Player npc;

    // constructor for initializing game
    Game(Player pc, Player npc) {
        this.pc = pc;
        this.npc = npc;
    }


    // ##### Gameplay Functions ####
        // what of these actually needs to be public?
        // check for reverse engineering (reflection, cutter)

    // battle pokemon
    public void comparePokemon(Player pc, Player npc) {

        if (pc.pokemon.strong == npc.pokemon.weak) {
            String message = "The " + pc.pokemon.name + " attacks!";
            System.out.print(message);
            wait(1000);
            
            System.out.println("\tIt's super effective!");
            wait(1000);
            System.out.println("Your pokemon won!");
            pc.wins++;
        }
        else if (pc.pokemon.weak == npc.pokemon.strong) {
            String message = "The " + npc.pokemon.name + " attacks!";
            System.out.print(message);
            wait(1000);
            System.out.println("\tIt's super effective!");
            wait(1000);
            System.out.println("Your rival's pokemon won!");
            npc.wins++;
        }
        else {
            System.out.println("You and your rival's pokemon tied!");
        }
    }


    // player chooses their pokemon
    public void choosePokemon(Player pc, Pokemon[] choices1, Pokemon[] choices2, String input) {
        for (int i = 0; i < choices1.length; i++) {
            if (input.toLowerCase().equals(choices1[i].name.toLowerCase())) {
                pc.pokemon = choices1[i];
            }
        }

        for (int i = 0; i < choices2.length; i++) {
            if (input.toLowerCase().equals(choices2[i].name.toLowerCase())) {
                pc.pokemon = choices2[i];
            }
        }

        if (pc.pokemon == null) {
            System.out.println("Please pick a valid pokemon.  Check your spelling!\n");
        }
    }

    // npc chooses its pokemon.  It will always choose the winning pokemon
    public void counterpick(Player pc, Player npc, Pokemon[] choices1, Pokemon[] choices2) {

        // in assembly, could potentially beat the if check by changing je to jne
            // pc.pokemon.weak != 1, then npc.pokemon.choices[0]

        if (pc.pokemon.weak == 1) {
            npc.pokemon = choices1[0];
        }
        else if (pc.pokemon.weak == 2) {
            npc.pokemon = choices1[1];
        }
        else if (pc.pokemon.weak == 3) {
            npc.pokemon = choices1[2];
        }

        else if (pc.pokemon.weak == 4) {
            npc.pokemon = choices2[0];
        }
        else if (pc.pokemon.weak == 5) {
            npc.pokemon = choices2[1];
        }
        else if (pc.pokemon.weak == 6) {
            npc.pokemon = choices2[2];
        }

        System.out.print("Your rival chooses: ");
        System.out.println(npc.pokemon.name);
        wait(1000);
        System.out.println();

    }

    // found at https://stackoverflow.com/questions/24104313/how-do-i-make-a-delay-in-java
    // allowing the program to wait without having to write a try except every time.
    private static void wait(int ms) {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void startImage()
    {
        System.out.println("\n" +
                           "\t\t\t\t\t        ▄█████████████████▄        \r\n" + //
                           "\t\t\t\t\t     ▄███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▄     \r\n" + //
                           "\t\t\t\t\t    ███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███    \r\n" + //
                           "\t\t\t\t\t   ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██   \r\n" + //
                           "\t\t\t\t\t  ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██  \r\n" + //
                           "\t\t\t\t\t ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \r\n" + //
                           "\t\t\t\t\t██▓▓▓▓▓▓▓▓▓▓▓█████████▓▓▓▓▓▓▓▓▓▓▓██\r\n" + //
                           "\t\t\t\t\t██▓▓▓▓▓▓▓▓▓▓██░░░░░░░██▓▓▓▓▓▓▓▓▓▓██\r\n" + //
                           "\t\t\t\t\t██▓▓▓▓▓▓▓▓▓██░░█████░░██▓▓▓▓▓▓▓▓▓██\r\n" + //
                           "\t\t\t\t\t█████████████░░█████░░█████████████\r\n" + //
                           "\t\t\t\t\t██░░░░░░░░░██░░█████░░██░░░░░░░░░██\r\n" + //
                           "\t\t\t\t\t██░░░░░░░░░░██░░░░░░░██░░░░░░░░░░██\r\n" + //
                           "\t\t\t\t\t██░░░░░░░░░░░█████████░░░░░░░░░░░██\r\n" + //
                           "\t\t\t\t\t ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██ \r\n" + //
                           "\t\t\t\t\t  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░██  \r\n" + //
                           "\t\t\t\t\t   ██░░░░░░░░░░░░░░░░░░░░░░░░░██   \r\n" + //
                           "\t\t\t\t\t    ███░░░░░░░░░░░░░░░░░░░░░███    \r\n" + //
                           "\t\t\t\t\t     ▀███░░░░░░░░░░░░░░░░░███▀     \r\n" + //
                           "\t\t\t\t\t        ▀█████████████████▀        ");
        
        System.out.println("\n\n" +
                           "\t\t\t\t\t\t ╔═══════════════╗\n" +
                           "\t\t\t\t\t\t ║  Press ENTER  ║\n" +
                           "\t\t\t\t\t\t ╚═══════════════╝");
    }

    public void printStats(Player pc, Player npc) {
        wait(1000);

        System.out.println();
        //print battle statistics
        System.out.println(pc);
        System.out.println(npc);
        System.out.println();

        wait(2000);
    }

    public void displayResults(Player pc, Player npc) {
        System.out.print("The winner is...");
        // if the player won
        if (pc.wins == 3) {
            System.out.println(pc.name + "!");
            image(1);
        }
        // if the computer won
        else if(npc.wins == 3) {
            System.out.print("Your rival!");
            image(2);
        }
    }

    private static void image(int num){
        String image1 = " \n" +
"              .\"-,.__ \n" +
"              `.     `.  , \n" +
"           .--'  .._,'\"-' `. \n" +
"           .    .'         `' \n" +
"           `.   /          ,' \n" +
"             `  '--.   ,-\"' \n" +
"              `\"`   |  \\ \n" +
"                  -. \\, | \n" +
"                   `--Y.'      ___. \n" +
"                        \\     L._, \\ \n" +
"               _.,        `.   <  <\\                _ \n" +
"             ,' '           `, `.   | \\            ( ` \n" +
"          ../, `.            `  |    .\\`.           \\ \\_ \n" +
"         ,' ,..  .           _.,'    ||\\l            )  '\". \n" +
"        , ,'   \\           ,'.-.`-._,'  |           .  _._`. \n" +
"      ,' /      \\ \\        `' ' `--/   | \\          / /   ..\\ \n" +
"    .'  /        \\ .         |\\__ - _ ,'` `        / /     `.`. \n" +
"    |  '          ..         `-...-\"  |  `-'      / /        . `. \n" +
"    | /           |L__           |    |          / /          `. `. \n" +
"   , /            .   .          |    |         / /             ` ` \n" +
"  / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \\ \n" +
" / .           \\\"`_/. `-_ \\_,.  ,'    +-' `-'  _,        ..,-.    \\`. \n" +
"  '         .-f    ,'   `    '.       \\__.---'     _   .'   '     \\ \\ \n" +
"' /          `.'    l     .' /          \\..      ,_|/   `.  ,'`     L` \n" +
"|'      _.-\"\"` `.    \\ _,'  `            \\ `.___`.'\"`-.  , |   |    | \\ \n" +
"||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .| \n" +
"||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   || \n" +
"|| '              V      / /           `   | `   ,'   ,' '.    !  `. || \n" +
"||/            _,-------7 '              . |  `-'    l         /    `|| \n" +
" |          ,' .-   ,' ||               | .-.        `.      .'     || \n" +
" `'        ,'    `\".'    |               |    `.        '. -.'       `' \n" +
"          /      ,'      |               |,'    \\-.._,.'/' \n" +
"          .     /        .               .       \\    .'' \n" +
"        .`.    |         `.             /         :_,'.' \n" +
"          \\ `...\\   _     ,'-.        .'         /_.-' \n" +
"           `-.__ `,  `'   .  _.>----''.  _  __  / \n" +
"                .'        /\"'          |  \"'   '_ \n" +
"               /_|.-'\\ ,\".             '.'`__'-( \\ \n" +
"                / ,\"'\"\\,'               `/  `-.|\" \n";
        

        String image2 = " \n" +
"                                      ████ \n" +
"                                    ██▓▓▓▓██            ████ \n" +
"                                  ██▓▓▓▓▓▓▓▓████████  ██▓▓▓▓██ \n" +
"                                  ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓██ \n" +
"                                ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"                                ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"                              ██▓▓  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"                              ██    ▓▓▓▓▓▓▓▓▓▓      ▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"                            ██        ▓▓▓▓              ▓▓▓▓▓▓▓▓▓▓██ \n" +
"                            ██▓▓                          ▓▓▓▓▓▓▓▓██ \n" +
"                            ██  ██            ████▓▓        ▓▓▓▓▓▓██ \n" +
"                            ██            ▓▓██              ▓▓▓▓▓▓██ \n" +
"                              ██            ░░            ░░▓▓▓▓▓▓██ \n" +
"                              ██▓▓        ░░  ██        ░░░░▓▓▓▓██ \n" +
"                          ████▓▓    ▓▓████████      ░░░░░░▓▓▓▓▓▓██ \n" +
"                      ████▓▓▓▓                    ░░░░░░▓▓▓▓▓▓██ \n" +
"                    ██▓▓▓▓▓▓▓▓██                        ▓▓▓▓▓▓▓▓██ \n" +
"                  ██▓▓▓▓▓▓▓▓▓▓██                      ██▓▓▓▓▓▓▓▓▓▓██ \n" +
"                  ██▓▓▓▓▓▓▓▓▓▓██                  ████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"                  ██▓▓▓▓▓▓▓▓  ██              ████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"                    ██  ▓▓  ██              ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"                  ██  ██████              ██  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"                  ██                        ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"                ██                          ██  ▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██ \n" +
"                ██                            ██  ▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"      ████    ██▓▓                              ████████    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"  ████  ▒▒████▓▓▓▓                                          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"██  ▒▒    ▒▒  ██▓▓▓▓                          ████        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"  ██    ▒▒▒▒    ██▓▓▓▓                      ██▒▒  ██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"  ██              ██▓▓▓▓                  ████    ██▒▒  ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"    ██            ██▓▓▓▓▓▓▓▓▓▓▓▓        ██    ▒▒▒▒▒▒  ▒▒██████▓▓▓▓▓▓▓▓▓▓▓▓██ \n" +
"    ██  ▒▒▒▒      ░░██▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ██            ▒▒▒▒    ██▓▓▓▓▓▓▓▓▓▓██ \n" +
"      ██▒▒░░▒▒  ░░░░██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██            ░░▒▒  ▒▒██▓▓▓▓▓▓▓▓▓▓██ \n" +
"        ██▒▒░░▒▒░░░░██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██      ▒▒▒▒▒▒░░░░░░▒▒██▓▓▓▓▓▓▓▓▓▓██ \n" +
"          ████▒▒░░▓▓████████▓▓▓▓▓▓▓▓██    ▒▒▒▒░░░░▒▒░░░░░░██▓▓▓▓▓▓████ \n" +
"              ██████        ██████████    ▒▒░░░░░░▒▒░░░░██▓▓▓▓████ \n" +
"                                    ██  ░░▒▒░░░░▒▒▒▒░░░░██████ \n" +
"                                      ██░░░░▒▒▒▒▒▒░░░░██ \n" +
"                                        ██░░░░░░░░████ \n" +
"                                          ████████";

        if (num == 1) {System.out.println(image1);}
        if(num == 2) {System.out.println(image2);}   
    }

    // display the game rules
    public boolean rules(String input) {
        input.toLowerCase();
        boolean value = false;

        if ((input.equals("y")) || (input.equals("yes"))) {
            value = true;
            //clear the screen      found here https://www.javatpoint.com/how-to-clear-screen-in-java

            System.out.println("\n\n" +
                               "\t\t\t\t\t\t ╔═══════════════╗\n" +
                               "\t\t\t\t\t\t ║     RULES     ║\n" +
                               "\t\t\t\t\t\t ╚═══════════════╝\n\n");
                                
            System.out.println("You are a Pokemon trainer!\n" +
                                "You must defeat your rival in a Pokemon battle!  You battle until someone wins three rounds.\n\n" +
                                "Each round, both you and your rival choose a Pokemon.  Choose the Pokemon by typing its name!\n" +
                                "\t-If your Pokemon is super effective against your rival's Pokemon, you win the round.\n" +
                                "\t-If your rival's Pokemon is super effective against your Pokemon, your rival wins the round.\n\n" +
                                "If you win three rounds, you win the battle!\n\n" +
                                "Note: super effective is based on each Pokemon's type!\n\n" +
                                "\t\t\t\t\t   ╔═════════════════════════════╗\n" +
                                "\t\t\t\t\t   ║          Let's go!          ║\n" +
                                "\t\t\t\t\t   ║     Press ENTER to exit     ║\n" +
                                "\t\t\t\t\t   ╚═════════════════════════════╝");
        } 
        return value;
    }

}