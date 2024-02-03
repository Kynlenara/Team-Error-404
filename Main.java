import java.util.Scanner;

// the main gameplay loop
class Main {
    public static void main(String[] args)
    {
        // instantiating group1 pokemon
        Pokemon chimchar = new Pokemon("Chimchar", "Fire", 1, 3);
        Pokemon treecko = new Pokemon("Treecko", "Grass", 2, 1);
        Pokemon squirtle = new Pokemon("Squirtle", "Water", 3, 2);

        // instantiating group2 pokemon
        Pokemon golbat = new Pokemon("Golbat", "Flying", 4, 6);
        Pokemon lucario = new Pokemon("Lucario", "Fighting", 5, 4);
        Pokemon geodude = new Pokemon("Geodude", "Rock", 6, 5);
        

        Pokemon[] group1 = {chimchar, treecko, squirtle};
        Pokemon[] group2 = {golbat, lucario, geodude};

        // instantiate player and computer
        Player pc = new Player("Player", null);
        Player npc = new Player("Rival", null);

        // game is used to run the battle between player and npc
        Game game = new Game(pc, npc);

        // create scanner to take in user input
        Scanner scanner = new Scanner(System.in);
        String input = null;
        boolean cont = false;


        Game.startImage();
        scanner.nextLine();

        System.out.print("Would you like to read the rules? y/n ");
        input = scanner.nextLine();

        if (game.rules(input))
        {
            scanner.nextLine();
        }


        // allow the player to play multiple times without having to restart the program
        do {

        while ((pc.wins < 3) && (npc.wins < 3)) {

            // make sure to start with fresh pokemon each time
            pc.pokemon = null;
            npc.pokemon = null;

            // begin pokemon selection process
            System.out.println("\n════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
            String message = "Select your pokemon!\n|" + group1[0] + "|\t\t|" + group1[1] + "|\t\t|" + group1[2] + "|\n|" + group2[0] + "|\t\t|" + group2[1] + "|\t|" + group2[2] + "| ";
            System.out.println(message);

            // player selecting pokemon.  Must choose a valid pokemon to continue the program.
            while (pc.pokemon == null) {
                input = scanner.nextLine();
                game.choosePokemon(pc, group1, group2, input);

                //invalid pokemon typed in
                if (pc.pokemon == null) {
                    System.out.println(message);
                }
            }

            System.out.println();

            // npc picks its pokemon
            game.counterpick(pc, npc, group1, group2);

            // rock paper scissors battle
            game.comparePokemon(pc, npc);
            game.printStats(pc, npc);
        }

        game.displayResults(pc, npc);

        System.out.print("Would you like to play again? y/n ");
        input = scanner.nextLine();
        if ((input.equals("y")) || (input.equals("yes"))) {
            cont = true;
            pc.wins = 0;
            npc.wins = 0;

            // clear the screen (kinda), used code from https://stackoverflow.com/questions/2979383/how-to-clear-the-console-using-java
            System.out.println(System.lineSeparator().repeat(10));
        }
        else {
            cont = false;
        }
    }
    while (cont);

        System.out.println("Thank you for playing!");

        // don't forget to close the scanner for input
        scanner.close();
    }
}
