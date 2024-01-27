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


}