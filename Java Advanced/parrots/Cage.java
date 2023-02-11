package parrots;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {
    private List<Parrot> data;
    private String name;
    private int capacity;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Parrot parrot) {
        if (this.data.size() < this.capacity) {
            this.data.add(parrot);
        }
    }

    public boolean remove(String name) {
        return this.data.removeIf(parrot -> parrot.getName().equals(name));
    }

    public Parrot sellParrot(String name) {
        for (Parrot parrot : this.data) {
            if (parrot.getName().equals(name)) {
                parrot.setAvailable(false);
                return parrot;
            }
        }
        return null;
    }

    public List<Parrot> sellParrotBySpecies(String species) {
        List<Parrot> sellParrots = this.data.stream()
                .filter(parrot -> parrot.isAvailable()).filter(parrot -> parrot.getSpecies().equals(species)).collect(Collectors.toList());
        return sellParrots;
    }

    public int count() {
        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parrots available at " + this.name + ":").append(System.lineSeparator());
        for (Parrot parrot : this.data) {
            if (parrot.isAvailable()){
            sb.append(parrot).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
