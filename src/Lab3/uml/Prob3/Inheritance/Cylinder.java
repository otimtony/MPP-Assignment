package Lab3.uml.Prob3.Inheritance;

import Lab3.uml.Prob3.Composition.Circle;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume() {
        return computeArea() * height;
    }
}
