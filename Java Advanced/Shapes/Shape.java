package Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    public abstract Double calculateArea();
    public abstract Double calculatePerimeter();

}
