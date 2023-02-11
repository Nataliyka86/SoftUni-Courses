package Advanced.Classes.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();
        Trainer trainer;
        Pokemon pokemon;

        while (!input.equals("Tournament")) {
//"{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}"
            String[] inputArr = input.split("\\s+");
            String trainerName = inputArr[0];
            String pokemonName = inputArr[1];
            String pokemonElement = inputArr[2];
            int pokemonHealth = Integer.parseInt(inputArr[3]);
            pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            List<Pokemon> pokemonList = new ArrayList<>();
            pokemonList.add(pokemon);
            trainer = new Trainer(trainerName, pokemonList);
            if (!trainerMap.containsKey(trainerName)) {
                trainerMap.put(trainerName, trainer);
            } else {
                trainerMap.get(trainerName).getPokemonList().add(pokemon);
            }
            input = scanner.nextLine();
        }
        String command = scanner.nextLine();


        while (!command.equals("End")) {
            final String commandCopy = command;
            trainerMap.values().forEach(trainer1 -> {
                if (trainer1.hasPokemon(commandCopy)) {
                    trainer1.incrementNumberOfBadges();
                } else {
                    trainer1.decreaseHealth();
                    trainer1.noHealth();
                }
            });
            command = scanner.nextLine();

        }

        trainerMap.values().stream().sorted((a, b) -> Integer.compare(b.getNumberOfBadges(), a.getNumberOfBadges()))
                .forEach(trainer1 -> System.out.println(trainer1.toString()));

    }
}
