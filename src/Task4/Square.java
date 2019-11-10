package Task4;

public class Square extends Rectangle {  // add constructor...

    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side=side;
    }
//    public Square(double side, String color, boolean filled) {
//        super(color, filled);
//        this.side=side;
//    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        setWidth(side);
    }

    public void setLength(double side) {
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

