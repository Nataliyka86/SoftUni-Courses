package CarSalesman_05;

public class Engine {
    private String model;
    private int power; //мощност
    private int displacement; //работен обем
    private String efficiency; //ефективност

    //конструктор alt + insert

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getModel() {
        return model;
    }
}
