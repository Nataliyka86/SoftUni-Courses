package OOP.Abstractions.PointInRectangle;

public class Rectangle {
    private Point bottomLeftRectangle;
    private Point topRightRectangle;

    public Rectangle(Point bottomLeftRectangle, Point topRightRectangle) {
        this.bottomLeftRectangle = bottomLeftRectangle;
        this.topRightRectangle = topRightRectangle;
    }
    public boolean contains(Point point){
        return point.getCoordinateX() >= this.bottomLeftRectangle.getCoordinateX() && point.getCoordinateX() <= this.topRightRectangle.getCoordinateX()
                && point.getCoordinateY() >= this.bottomLeftRectangle.getCoordinateY() && point.getCoordinateY() <= this.topRightRectangle.getCoordinateY();

    }
}
