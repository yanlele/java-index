package demo;

public class Circle {
    // 半径， 默认为1
    private Double radius = 1.0;

    public Circle(Double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     * @return 面积
     */
    public Double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
