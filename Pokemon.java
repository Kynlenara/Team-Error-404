// basic class for pokemon.  We might want to swap strong and weak to be arrays.
// I don't recommend using any libraries right now, as it might make it harder to reverse engineer?


// I looked at the list of pokemon interactions that have complete immunity to other types.
// I don't recommend using Normal, Ghost, or Dragon types because:
//      Normal is not super effective against any type.
//      Ghost is super effective against Ghost.
//      Dragon is super effective against Dragon.

// This leaves these types behind:
// Electric, Ground, Poison, Steel, Flying, Psychic, Dark, Fairy, Fighting


// ........NO EFFECT........

// Electric -> Ground = no effect
// Poison -> Steel = no effect
// Ground -> Flying = no effect
// Psychic -> Dark = no effect
// Dragon -> Fairy = no effect


// ........SUPER EFFECTIVE........

// Electric -> Flying = super effective
// Ground -> Electric = super effective
// Ground -> Poison = super effective
// Ground -> Steel = super effective
// Poison -> Fairy = super effective
// Steel -> Fairy = super effective
// Flying -> Fighting = super effective
// Psychic -> Poison = super effective
// Psychic -> Fighting = super effective
// Dark -> Psychic = super effective
// Fairy -> Dark = super effective
// Fairy -> Fighting = super effective
// Fighting -> Dark = super effective
// Fighting -> Steel = super effective

// Of course, we can pick whatever types we want, they don't have to be super effective or no effect.
// -------------------------------------------------------------------------------------------------------------------------


// Chimchar: beats Treecko
// Treecko: beats Squirtle
// Squirtle: beats Chimchar

//chimchar = 1
//treecko = 2
//squirtle = 3

// chimchar.strong = 1
// chimchar.weak = 3

// treecko.strong = 2
// treecko.weak = 1

//squirtle.strong = 3
//squirtle.weak = 2


public class Pokemon {
    String name;
    String type;
    int strong;
    int weak;

    Pokemon(String name, String type, int strong, int weak) {
        this.name = name;
        this.type = type;
        this.strong = strong;
        this.weak = weak;
    }

}
