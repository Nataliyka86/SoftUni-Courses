package ShoppingSpree_03;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money>= 0){
        this.money = money;
        } else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
    public void buyProduct (Product product){
    if (this.money>= product.getCost()){
        this.products.add(product);
        this.money-= product.getCost();
    } else {
        String message = this.getName() + " can't afford " + product.getName();
        throw new IllegalArgumentException(message);
    }
    }

    public String getName() {
        return name;
    }
}
