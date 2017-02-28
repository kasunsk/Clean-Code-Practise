package polymorphic;

import common.Point;

/**
 * Created by kasun on 2/25/17.
 */
public class Square implements Shape {

    private Point topLeft;
    private Double side;

    @Override
    public double area() {
        return side * side;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }
}
