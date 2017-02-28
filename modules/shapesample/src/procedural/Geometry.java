package procedural;

/**
 * Created by kasun on 2/25/17.
 */
public class Geometry {

    public final double PI = 3.141592653589793;

    public double area(Object shape) {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return s.getSide() * s.getSide();
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.getHeight() * r.getWidth();
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return PI * c.getRadius() * c.getRadius();
        }
        return 0D;
    }
}
