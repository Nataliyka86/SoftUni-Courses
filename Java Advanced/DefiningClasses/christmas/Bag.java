package christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int count() {
        return this.data.size();
    }

    public void add(Present present) {
        if (this.data.size() < this.capacity) {
            this.data.add(present);
        }
    }

    public boolean remove(String name) {
        return this.data.removeIf(present -> present.getName().equals(name));
    }

    public Present heaviestPresent() {
        return this.data.stream().max(Comparator.comparing(present -> present.getWeight())).get();
    }


    public Present getPresent(String name) {
        for (Present present: this.data){
            if (present.getName().equals(name)){
                return present;
            }
        }
        return null;

    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(getColor()).append(" bag contains:").append(System.lineSeparator());
        for (Present present : this.data) {
            sb.append(present).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
