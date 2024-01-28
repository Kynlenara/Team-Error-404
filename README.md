# Team-Error-404
Repository for Reverse Engineering class.  Contains Cyber Storm challenge code for a Pokemon-style Rock Paper Scissors game.

Reminder: to compile and run java code normally, navigate to the file's location, run javac "filename.java", then java "filename"
    
-To Do: check how to compile java code all the way to Assembly instructions.

Pokemon Type Chart: https://pokemondb.net/type

Player can choose any pokemon from the following two groups to play on any given turn:

(Group 1)
Chimchar - fire type
Treecko - grass type  
Squirtle - water type

(Group 2)
Golbat - flying type
Geodude - rock type
Lucario - fighting type


Game Rules:

Player will first choose a pokemon. 
Bot will then choose a different pokemon from the player that is also in the same group (In order for the player to always either win or loose. All pokemon from both groups have a weakness and strength in their respective group). 
For the sake of the reverse engineering challenge, the bot will always choose the pokemon that is super effective against the players. 
For the player to win, they must win three rounds in a row (win = the pokemon they choose is super effective against the bot's pokemon). 




