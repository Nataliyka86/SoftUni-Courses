package Advanced.Classes.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges = 0;
    private List<Pokemon> pokemonList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void incrementNumberOfBadges() {
        this.numberOfBadges++;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public Trainer(String name, List<Pokemon> pokemonList) {
        this.name = name;
        this.pokemonList = pokemonList;
    }
    public boolean hasPokemon(String element){
        return pokemonList.stream().anyMatch(pokemon -> pokemon.getElement().equals(element));
    }
    public void decreaseHealth(){
        pokemonList.forEach(pokemon -> pokemon.decreaseHealthPokemon());
    }
    public void noHealth(){
        this.pokemonList.removeIf(pokemon -> pokemon.getHealth() <=0);

    }

    @Override
    public String toString() {
       return String.format("%s %d %d", this.name, this.numberOfBadges, this.pokemonList.size());
    }
}
