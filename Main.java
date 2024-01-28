import java.util.Scanner;
import java.text.MessageFormat;

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
        Player pc = new Player("PC", null);
        Player npc = new Player("NPC", null);

        // game is used to run the battle between player and npc
        Game game = new Game(pc, npc);

        // create scanner to take in user input
        Scanner scanner = new Scanner(System.in);

        while ((pc.wins < 3) && (npc.wins < 3)) {

            // make sure to start with fresh pokemon each time
            pc.pokemon = null;
            npc.pokemon = null;

            // begin pokemon selection process
            String message = MessageFormat.format("Select your pokemon!\n|{0}|\t\t|{1}|\t\t|{2}|\n|{3}|\t\t|{4}|\t|{5}| ", group1[0], group1[1], group1[2], group2[0], group2[1], group2[2]);
            System.out.println(message);

            // player selecting pokemon.  Must choose a valid pokemon to continue the program.
            while (pc.pokemon == null) {
                String input = scanner.nextLine();
                game.choosePokemon(pc, group1, group2, input);

                //invalid pokemon typed in
                if (pc.pokemon == null) {
                    System.out.println(message);
                }
            }

            // npc picks its pokemon
            game.counterpick(pc, npc, group1, group2);

            // rock paper scissors battle
            game.comparePokemon(pc, npc);

            //print battle statistics
            System.out.println(pc);
            System.out.println(npc);
            System.out.println();
        }

        System.out.print("The winner is...\n");
        // if the player won
        if (pc.wins == 3) {
            System.out.println("PC!");
        }
        // if the computer won
        else if(npc.wins == 3) {
            System.out.println("Your rival!");
        }

        // don't forget to close the scanner for input
        scanner.close();
    }
}
