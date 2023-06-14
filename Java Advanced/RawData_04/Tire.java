package RawData_04;

public class Tire {
    private int tireAge;
    private double tirePressure;

    public Tire(int tireAge, double tirePressure) {
        this.tireAge = tireAge;
        this.tirePressure = tirePressure;
    }

    public int getTireAge() {
        return tireAge;
    }

    public double getTirePressure() {
        return tirePressure;
    }

    public void setTireAge(int tireAge) {
        this.tireAge = tireAge;
    }

    public void setTirePressure(double tirePressure) {
        this.tirePressure = tirePressure;
    }
}
