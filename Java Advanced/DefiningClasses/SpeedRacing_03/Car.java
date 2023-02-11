package SpeedRacing_03;

public class Car {
    private String model;
    private double fuelAmount;
    private double consumptionFuelPerKm;
    private int distanceTraveled;

    // конструктор -> метод, чрез който ние създаваме обекти от класа
    public Car(String model, double fuelAmount, double priceFuelPerKm){
        //нов празен обект
        this.model =model;
        this.fuelAmount = fuelAmount;
        this.consumptionFuelPerKm = priceFuelPerKm;
        this.distanceTraveled = 0;
    }
    public boolean drive(int kmDrive){
        double needFuel = kmDrive * this.consumptionFuelPerKm;
        if (needFuel<=this.fuelAmount){
            this.fuelAmount -= needFuel;
            this.distanceTraveled +=kmDrive;
            return true;
        }
        return false;
    }
    public String toString(){
        return String.format("%s %.2f %d",this.model, this.fuelAmount, this.distanceTraveled);
    }
}
