package Task8;

public class Circle implements GeometricObject {

    protected double radius=1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter=2*Math.PI*radius;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area=Math.PI*Math.pow(radius,2);
        return area;
    }
}
