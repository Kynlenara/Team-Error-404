// Chimchar: beats Treecko
// Treecko: beats Squirtle
// Squirtle: beats Chimchar


//parameters set up like this for comparing pokemon in battle
    // see comparePokemon function in Game.java for specifics

//chimchar = 1
//treecko = 2
//squirtle = 3
//golbat = 1
//lucario = 2
//geodude = 3

// chimchar.strong = 1
// chimchar.weak = 3

// treecko.strong = 2
// treecko.weak = 1

// squirtle.strong = 3
// squirtle.weak = 2

// golbat.strong = 4
// golbat.weak = 6

// lucario.strong = 5
// lucario.weak = 4

// geodude.strong = 6
// geodude.weak = 5


public class Pokemon {
    String name;
    String type;
    int strong;
    int weak;

    // constructor
    Pokemon(String name, String type, int strong, int weak) {
        this.name = name;
        this.type = type;
        this.strong = strong;
        this.weak = weak;
    }

    // string printed when you print a pokemon
    public String toString() {
        return "Pokemon: " + name + "  Type: " + type;
    }

}
