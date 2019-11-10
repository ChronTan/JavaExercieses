package Task4;

public class Circle extends Shape {

    private double radius=1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area=Math.PI*Math.pow(radius,2);
        return area;
    }

    public double getPerimetr() {
        double perimetr=2*Math.PI*radius;
        return perimetr;
    }

    @Override
    public String toString() {
        return "Circle[" +
                " radius= " + radius +
                ']';
    }
}
