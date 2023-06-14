package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int capacity;
    private List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person){
        if (this.roster.size() < capacity){
            this.roster.add(person);
        }
    }

    public boolean remove(String name){
        return this.roster.removeIf(person -> person.getName().equals(name));
    }
    public Person getPerson(String name, String hometown){
        return this.roster.stream().filter(person -> person.getName().equals(name) && person.getHometown().equals(hometown)).findFirst().orElse(null);
    }
    public int getCount(){
        return this.roster.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The people in the hotel " + this.name + " are:").append(System.lineSeparator());
        this.roster.forEach(person -> sb.append(person).append(System.lineSeparator()));
        return sb.toString();
    }
}
