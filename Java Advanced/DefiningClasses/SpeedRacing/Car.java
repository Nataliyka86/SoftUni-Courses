package Advanced.Classes.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double consumption;
    private int distance;

    public Car(String model, double fuelAmount, double consumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
        this.distance = 0;
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getConsumption() {
        return consumption;
    }

    public int getDistance() {
        return distance;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public boolean drive(int distance){
        double currentFuel = distance * this.consumption;
        if (currentFuel <= this.fuelAmount){
            this.distance+=distance;
            this.fuelAmount -= currentFuel;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distance);
    }
}
