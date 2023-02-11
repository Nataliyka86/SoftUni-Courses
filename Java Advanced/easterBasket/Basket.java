package easterBasket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        if (this.data.size() < this.capacity) {
            this.data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        return this.data.removeIf(egg -> egg.getColor().equals(color));
    }

    public Egg getStrongestEgg() {
        if (this.data.size() == 0) {
            return null;
        }
        return Collections.max(this.data, Comparator.comparing(egg -> egg.getStrength()));
    }

    public Egg getEgg(String color) {
        for (Egg egg: this.data){
            if (egg.getColor().equals(color)){
                return egg;
            }
        } return null;
//        return this.data.stream().filter(e -> e.getColor().equals(color)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.material).append(" basket contains:").append(System.lineSeparator());
        for (Egg egg : this.data) {
            sb.append(egg).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
