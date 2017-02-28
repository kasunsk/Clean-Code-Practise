package common;

import procedural.Circle;
import procedural.Geometry;

/**
 * Created by kasun on 2/25/17.
 */
public class RunProcedural {

    public static void main(String args []) {

        Circle circle = new Circle();
        circle.setRadius(7D);

        Geometry geometry = new Geometry();
        double area = geometry.area(circle);

        System.out.println(area);

    }
}
