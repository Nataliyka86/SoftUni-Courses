package Car_01;

import java.util.Objects;

public class CarInfo {
    private   String brand;
    private   String model;
    private int horsePower;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public String carInfo(){
        return this.toString();
    }

    public String toString(){
        return String.format("The car is: %s %s - %d HP.", this.brand, this.getModel(), this.getHorsePower());
    }
    public CarInfo(String brand){
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }
    public CarInfo(String brand, String model, int horsePower){
        this(brand);
        this.model = model;
        this.horsePower = horsePower;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarInfo carInfo = (CarInfo) o;
        return horsePower == carInfo.horsePower && Objects.equals(brand, carInfo.brand) && Objects.equals(model, carInfo.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, horsePower);
    }
}
