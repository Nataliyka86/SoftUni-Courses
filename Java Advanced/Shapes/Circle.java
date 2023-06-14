package Shapes;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        super.setArea(this.calculateArea());
        super.setPerimeter(this.calculatePerimeter());
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
