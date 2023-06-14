package aquariumDebug;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishInPool;
    private String name;
    private int capacity;
    private int size;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new ArrayList<>();
    }

    public int getFishInPool() {
        return this.fishInPool.size();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public void add(Fish fish) {
        if (this.fishInPool.size() < this.capacity && !this.fishInPool.contains(fish)) {
            this.fishInPool.add(fish);
        }
    }
    public boolean remove(String name){
      return this.fishInPool.removeIf(fish -> fish.getName().equals(name));
    }
    public Fish findFish(String name){
        for (Fish fish: this.fishInPool){
            if (fish.getName().equals(name)){
                return fish;
            }
        }
        return null;
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Aquarium: ").append(this.name).append(" ^ Size: ").append(this.size).append(System.lineSeparator());
        for (Fish fish: this.fishInPool){
            sb.append(fish).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
