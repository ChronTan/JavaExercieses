package Task3;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(3.0f,4.0f,2.0f,4.0f);
        System.out.println(movablePoint.toString());
        movablePoint=movablePoint.move();
        System.out.println(movablePoint.toString());

    }
}
