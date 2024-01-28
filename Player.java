public class Player {
    String name;
    Pokemon pokemon;
    int wins;

    public Player(String name, Pokemon pokemon) {
        this.name = name;
        this.pokemon = pokemon;
        this.wins = 0;
    }

    void setWins(int num) {
        this.wins = 0;
        if (num > 0) {
            this.wins = num;
        }
    }

    public String toString() {
        return "Name: " + name + "\t"+ pokemon + "\tWins: " + wins;
    }

}
