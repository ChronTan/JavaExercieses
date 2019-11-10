package Task2;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] mas=new float[3];
            mas[0]=getX();
            mas[1]=getY();
            mas[2]=getZ();
        return mas;
    }

    @Override
    public String toString() {
        return "Point3D[" +
                " x= " + getX() +
                ", y= " + getY() +
                ", z= " + z +
                ']';
    }
}
