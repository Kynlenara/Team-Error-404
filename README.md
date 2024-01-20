# Team-Error-404
Repository for Reverse Engineering class.  Contains Cyber Storm challenge code for a Pokemon-style Rock Paper Scissors game.

Reminder: to compile and run java code normally, navigate to the file's location, run javac "filename.java", then java "filename"
    
-To Do: check how to compile java code all the way to Assembly instructions.

I looked at the list of pokemon interactions that have complete immunity to other types.
I don't recommend using Normal, Ghost, or Dragon types because:
      Normal is not super effective against any type.
      Ghost is super effective against Ghost.
      Dragon is super effective against Dragon.

This leaves these types behind:
Electric, Ground, Poison, Steel, Flying, Psychic, Dark, Fairy, Fighting


 ........NO EFFECT........
Electric -> Ground = no effect
Poison -> Steel = no effect
Ground -> Flying = no effect
Psychic -> Dark = no effect
Dragon -> Fairy = no effect


 ........SUPER EFFECTIVE........
Electric -> Flying = super effective
Ground -> Electric = super effective
Ground -> Poison = super effective
Ground -> Steel = super effective
Poison -> Fairy = super effective
Steel -> Fairy = super effective
Flying -> Fighting = super effective
Psychic -> Poison = super effective
Psychic -> Fighting = super effective
Dark -> Psychic = super effective
Fairy -> Dark = super effective
Fairy -> Fighting = super effective
Fighting -> Dark = super effective
Fighting -> Steel = super effective

Of course, we can pick whatever types we want, they don't have to be super effective or no effect.
