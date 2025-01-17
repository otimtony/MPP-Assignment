package Lab3.uml.Prob3.Composition;

import Lab3.uml.Prob3.Inheritance.Circle;
import Lab3.uml.Prob3.Inheritance.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area of a Circle" + circle.computeArea());

        Cylinder cylinder = new Cylinder(10, 15);
        System.out.println("Volume of a Cylinder"+ cylinder.computeVolume());
    }
}
