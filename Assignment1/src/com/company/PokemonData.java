package com.company;
//only class in the same package 'com.company' can access class Pokemon
class PokemonData {
    String name;
    String type;
    String move;

    PokemonData(String name, String type, String move){
        this.name = name;
        this.type = type;
        this.move = move;
    }
}
