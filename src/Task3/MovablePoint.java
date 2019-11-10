package Task3;

public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] mas=new float[2];
        mas[0]=xSpeed;
        mas[1]=ySpeed;
        return mas;
    }

    @Override
    public String toString() {
        return "("+getX()+","
                +getY()+"), speed= "
                +"("+xSpeed+","
                + ySpeed+")";
    }

    public MovablePoint move(){
        float x=getX()+xSpeed;
        float y=getY()+ySpeed;
        MovablePoint movablePoint=new MovablePoint(x,y,xSpeed,ySpeed);
        return movablePoint;
    }
}
