package demo9;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double findArea() {
        return 2 * (this.getWidth()* this.getLength() + this.getLength() * this.height + this.height * this.getWidth());
    }

    public double findVolume() {
        return this.getWidth() * this.getLength() * this.height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                "} " + super.toString();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
