package kindergarten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child) {
        if (this.registry.size() < this.capacity) {
            this.registry.add(child);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeChild(String firstName) {
        return this.registry.removeIf(child -> child.getFirstName().equals(firstName));
    }

    public int getChildrenCount() {
        return this.registry.size();
    }

    public Child getChild(String firstName) {
        return this.registry.stream().filter(child -> child.getFirstName().equals(firstName)).findFirst().orElse(null);
    }

    public String registryReport() {
        List<Child> sortedList = this.registry.stream().sorted((n1, n2) -> {
            if (n1.getAge() > n2.getAge()) {
                return 1;
            } else if (n1.getAge() < n2.getAge()) {
                return -1;
            } else {
                int result = n1.getFirstName().compareTo(n2.getFirstName());
                if (result == 0) {
                    return n1.getLastName().compareTo(n2.getLastName());
                }
                return result;
            }

        }).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        sb.append("Registered children in " + this.name + ":").append(System.lineSeparator());
        for (Child child : sortedList) {
            sb.append("--").append(System.lineSeparator());
            sb.append(child).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
