package Task2;

public class Main {
    public static void main(String[] args) {
        Point3D point3D=new Point3D(2.0f,3.0f,6.0f);
        Point2D point2D=new Point2D(9.0f,7.0f);
        float[] massiv=point3D.getXYZ();
        for(float f:massiv){
            System.out.println(f);
        }
        System.out.println("-----------");
        float[] massiv1=point2D.getXY();
        for(float f:massiv1){
            System.out.println(f);
        }
    }
}
