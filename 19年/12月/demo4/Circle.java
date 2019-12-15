package demo4;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception {
        if (radius < 0) {
            throw new Exception("不能为0");
        }
        this.radius = radius;
    }
}
