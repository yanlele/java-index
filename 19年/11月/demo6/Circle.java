package demo6;

class Circle implements GeometricObject{
    private String color;
    private double radius;
    private double width;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius, double width) {
        this.color = color;
        this.radius = radius;
        this.width = width;
    }

    public double findArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public boolean equals(Circle o) {
        return this.radius == o.getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", width=" + width +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}