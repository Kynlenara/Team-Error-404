// basic class for pokemon.  We might want to swap strong and weak to be arrays.
// I don't recommend using any libraries right now, as it might make it harder to reverse engineer?

public class Pokemon {
    String name;
    String type;
    String strong;
    String weak;

    public Pokemon(String name, String type, String strong, String weak) {
        this.name = name;
        this.type = type;
        this.strong = strong;
        this.weak = weak;
    }

}
