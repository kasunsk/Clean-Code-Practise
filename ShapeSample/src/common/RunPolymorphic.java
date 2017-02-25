package common;


import polymorphic.Circle;
import polymorphic.Square;

/**
 * Created by kasun on 2/25/17.
 */
public class RunPolymorphic {

    public static void main(String args[]) {
        Circle circle = new Circle();
        circle.setRadius(7D);

        Double area = circle.area();
        System.out.println(area);

        Square square = new Square();
        square.setSide(5D);

        Double squareArea = square.area();

        System.out.println(squareArea);
    }
}
