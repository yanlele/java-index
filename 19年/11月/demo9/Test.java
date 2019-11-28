package demo9;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("length:" + rectangle.getLength() + " width:" + rectangle.getWidth() + " area:" + rectangle.findArea());

        Cuboid cuboid = new Cuboid(5, 4, 6);
        System.out.println("length:" + cuboid.getLength() + " width:" + cuboid.getWidth() + " height:" + cuboid.getHeight() + " area:" + cuboid.findArea() + " volume:" + cuboid.findVolume());

    }
}
