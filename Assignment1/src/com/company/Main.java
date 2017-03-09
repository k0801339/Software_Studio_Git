package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(Strin[] args) {
        //ready for input
        Scanner console = new Scanner(System.in);
        //pokeList: an ArrayList used to store Pokemon data user loads in
        ArrayList<PokemonData> pokeList = new ArrayList<>();
        //catchMap: a HashMap used to store Pokemons which have been catched
        HashMap<String,Integer> catchMap = new HashMap<>();

        System.out.println("Load the data...");

        //load the number of Pokemons
        int number = console.nextInt();
        //load the Pokemon data, including name, type and move's name
        for(int i=0;i<number;i++){
            String name = console.next();
            //input type -> always convert to lowercase
            String type = console.next().toLowerCase();
            String move = console.next();
            //new a Pokemon object and add it to the pokeList
            PokemonData data = new PokemonData(name, type, move);
            pokeList.add(data);

        }

        System.out.printf("----------%nGame Start!%n----------%n");
        int score = 0;

        //index: randomly select a Pokemon
        int index = (int)(Math.random()*number);
        PokemonData tmp = pokeList.get(index);

        System.out.printf("name: %s, type: %s, move: %s%n", tmp.name, tmp.type, tmp.move);
        System.out.print("Enter your reaction: ");
        while(true){
            //get the input command
            String cmd = console.next();
            switch (cmd){
                case "catch":
                    System.out.printf("......%nYou catch %s !%n", tmp.name);
                    if(tmp.type.equals("grass"))   ++score;
                    else    --score;
                    //record the catched pokemon
                    if(catchMap.containsKey(tmp.type))
                        catchMap.put(tmp.type, catchMap.get(tmp.type)+1);
                    else
                        catchMap.put(tmp.type, 1);
                    break;
                case "run":
                    System.out.printf("......%nRun away successfully!%n");
                    if(tmp.type.equals("grass"))   --score;
                    else    ++score;
                    break;
                case "quit":
                    break;
                default:
                    System.out.printf("You type the wrong command! %s runs away!%n", tmp.name);
                    break;
            }
            //input "quit" -> game over
            if(cmd.equals("quit"))  break;
            //create index and selected Pokemon again
            index = (int)(Math.random()*number);
            tmp = pokeList.get(index);

            System.out.println();
            System.out.printf("name: %s, type: %s, move: %s%n", tmp.name, tmp.type, tmp.move);
            System.out.print("Enter your reaction: ");
        }
        //Game over
        System.out.printf("----------%nYou quit the game!%n----------%n");
        System.out.printf("Score: %d%n", score);

        //iterate through the catchMap
        for(Map.Entry<String,Integer> entry: catchMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

        console.close();
    }
}
