package polymorphic;

import common.Point;

/**
 * Created by kasun on 2/25/17.
 */
public class Circle implements Shape{

    public final double PI = 3.141592653589793;

    private Point center;
    private Double radius;


    @Override
    public double area() {
        return PI * radius * radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
