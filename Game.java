

public class Game {
    Player pc;
    Player npc;

    // constructor
    Game(Player pc, Player npc) {
        this.pc = pc;
        this.npc = npc;
    }


    public void comparePokemon(Player pc, Player npc) {

        if (pc.pokemon.strong == npc.pokemon.weak) {
            System.out.println("Your pokemon won!");
            pc.wins++;
            //System.out.println(pc.wins);
        }
        else if (pc.pokemon.weak == npc.pokemon.strong) {
            System.out.println("Your rival's pokemon won!");
            npc.wins++;
            //System.out.println(npc.wins);
        }
        else {
            System.out.println("You and your rival's pokemon tied!");
        }
    }


    public void choosePokemon(Player pc, Pokemon[] choices, String input) {
        for (int i = 0; i < choices.length; i++) {
            if (input.toLowerCase().equals(choices[i].name.toLowerCase())) {
                pc.pokemon = choices[i];
            }
        }
        if (pc.pokemon == null) {
            System.out.println("Please pick a valid pokemon.  Check your spelling!\n");
        }
    }

    // npc chooses its pokemon
    public void counterpick(Player pc, Player npc, Pokemon[] choices) {
        if (pc.pokemon.weak == 1) {
            npc.pokemon = choices[0];
        }
        else if (pc.pokemon.weak == 2) {
            npc.pokemon = choices[1];
        }
        else if (pc.pokemon.weak == 3) {
            npc.pokemon = choices[2];
        }
    }


}