package ss.labs.pokemon.character;

/**
 * Created by jerry on 2017/3/7.
 */
public class NPC extends AbstractCharacter {

    //TODO more attributes are needed
    String quote;
    //TODO solve the error
    public NPC(String name,String job,String quote){
        //TODO call super constructor
        super(name, job);
        //TODO assign attribute
        this.quote = quote;
    }

    public void interact()
    {
        speak();
    }

    public void speak(){
        showInformation();
    }
    @Override
    public void showInformation(){
        System.out.print(toString());
    }

    //TODO override toString()
    @Override
    public String toString(){
        return "name: "+name+"\njob: "+job+"\nquote: "+quote+'\n';
    }
}
