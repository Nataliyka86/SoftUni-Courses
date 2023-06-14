package Shapes;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(2.2,4.2);
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.calculateArea());
        shape = new Circle(10.2);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

    }
}
