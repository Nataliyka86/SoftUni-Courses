package RawData_04;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tireList = new ArrayList<>();

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tireList) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tireList = tireList;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tire> getTireList() {
        return tireList;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setTireList(List<Tire> tireList) {
        this.tireList = tireList;
    }

}
