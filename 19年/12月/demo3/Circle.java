package demo3;

public class Circle {
    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double r) throws CircleException {
        if (r < 0) {
            this.radius = 0;
            throw new CircleException(r);
        }
        this.radius = r;
    }

    public void show() {
        System.out.println("area=" + Math.PI * Math.pow(this.radius, 2));
    }
}
