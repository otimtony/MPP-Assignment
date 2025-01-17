package Lab3.uml.Prob3.Inheritance;

import Lab3.uml.Prob3.Composition.Circle;

public class Cylinder {
    private double height;
    private double radius;

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume() {
        return Math.PI * radius * radius * height;
    }
}