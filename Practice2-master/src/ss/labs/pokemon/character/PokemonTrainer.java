package ss.labs.pokemon.character;

import ss.labs.pokemon.PokemonData;

import javax.lang.model.type.PrimitiveType;

/**
 * Created by jerry on 2017/3/7.
 */
public class PokemonTrainer extends NPC{
    protected PokemonData pokemonData;

    //TODO solve the error
    public PokemonTrainer(String name, String job, String quote, PokemonData data)
    {

        //TODO call super constructor
        super(name, job, quote);
        //TODO assign attributes
        this.pokemonData = data;
    }

    //TODO override toString()
    @Override
    public String toString(){
        return "name: "+name+"\njob: "+job+"\nquote: "+quote
                +"\npokedata:\n"+"\tid: "+pokemonData.getId()+"\n\tname: "+pokemonData.getName()
                +"\n\ttype: "+pokemonData.getType()+"\n\tmove: "+pokemonData.getMove()+'\n';
    }


}
