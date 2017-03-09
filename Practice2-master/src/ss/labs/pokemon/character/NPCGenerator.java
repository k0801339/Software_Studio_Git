package ss.labs.pokemon.character;

import ss.labs.pokemon.PokemonData;

import java.util.ArrayList;

/**
 * Created by jerry on 2017/3/7.
 * In this practice you will see the power of polymorphism
 * practice to inherit and
 */
public class NPCGenerator {
    //no modifier is private
    private ArrayList<NPC> npcTemplates;
    public NPCGenerator()
    {
        npcTemplates = new ArrayList<>();
        //TODO create some NPC and put into the template list. At least one for each type of character
        NPC npc1 = new NPC("John", "Villager", "Have a nice day!");

        PokemonData data1 = new PokemonData(1, "Pikachu", "Electric", "thunderbolt");
        NPC trainer1 = new PokemonTrainer("Mary", "Pokemon Trainer", "Let's battle!", data1);

        npcTemplates.add(npc1);
        npcTemplates.add(trainer1);
    }

    //Try ctrl-N or command-N, click on Getter, you will see something useful
    //TODO write a public method to return npctemplates
    public ArrayList<NPC> getNpcTemplates(){
        return npcTemplates;
    }

}
