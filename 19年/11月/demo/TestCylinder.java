package demo;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 3.0);
        System.out.println("半径： " + cylinder.getRadius());
        System.out.println("高：   " + cylinder.getLength());

        System.out.println("表面积： " + cylinder.findArea());
        System.out.println("体积：   " + cylinder.findVolume());
    }
}
