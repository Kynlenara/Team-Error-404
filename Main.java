// Some basic code testing out a class (see Pokemon.java)

//To Do list

class Main {
    public static void main(String[] args)
    {
        //System.out.println("Hello World!");

        Pokemon chimchar = new Pokemon("Chimchar", "Fire", 1, 3);
        Pokemon treecko = new Pokemon("Treecko", "Grass", 2, 1);
        Pokemon squirtle = new Pokemon("Squirtle", "Water", 3, 2);

       // System.out.println(chimchar.name);
      //  System.out.println(chimchar.type);
       // System.out.println(chimchar.strong);
       // System.out.println(chimchar.weak);

        Player pc = new Player(chimchar);
        Player npc = new Player(treecko);

        Game game = new Game(pc, npc);

        //System.out.println(pc.pokemon.name);
      //  System.out.println(npc.pokemon.name);


        while ((pc.wins < 3) && (npc.wins < 3)) {
            game.comparePokemon(pc, npc);
            System.out.print("Pc wins: ");
            System.out.println(pc.wins);
            System.out.print("NPC wins: ");
            System.out.println(npc.wins);

            System.out.println();
        }

        System.out.print("The winner is...\n");
        if (pc.wins == 3) {
            System.out.println("PC!");
        }
        else if(npc.wins == 3) {
            System.out.println("Your rival!");
        }

        System.out.println("Finish");
    }
}
