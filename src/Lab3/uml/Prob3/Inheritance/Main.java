package Lab3.uml.Prob3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Cylinder circle1 = new Circle(16.0);
        Cylinder cylinder2 = new Cylinder(3.1, 34.0);
        Circle circle2 = new Circle(4.0);

        System.out.println("Volume of cylinder: " + cylinder2.computeVolume());
        System.out.println("Area of circle: " + circle2.computeArea());

        //Inheritance does not work
        System.out.println("Volume" + circle1.computeVolume());

    }
}
