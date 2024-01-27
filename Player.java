public class Player {
    Pokemon pokemon;
    int wins;

    public Player(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.wins = 0;
    }

    void setWins(int num) {
        this.wins = 0;
        if (num > 0) {
            this.wins = num;
        }
    }

}
