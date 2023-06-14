package OOP.Abstractions.TrafficLights_044;

public class Signal {

    enum Light {
        RED,
        GREEN,
        YELLOW;

    }

    Light light;

    public Signal(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void showNextLight() {
        switch (this.light) {
            case GREEN:
                this.light = Light.YELLOW;
                break;
            case YELLOW:
                this.light = Light.RED;
                break;
            case RED:
                this.light = Light.GREEN;
                break;
        }

    }
}
