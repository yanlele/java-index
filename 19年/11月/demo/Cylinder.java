package demo;

public class Cylinder extends Circle {
    private Double length = 1.0; // 关注的高度， 默认为1

    public Cylinder(Double radius, Double length) {
        super(radius);
        this.length = length;
    }

    public Double findVolume() {
        return Math.PI * Math.pow(this.getRadius(), 2)  * this.length;
    }

    /**
     *  计算圆柱的表面积
     * @return
     */
    @Override
    public Double findArea() {
        // 侧面积
        Double lateralArea = 2 * Math.PI * Math.pow(this.getRadius(), 2);

        // 2个底面积
        Double basalArea = 2 * Math.PI * Math.pow(this.getRadius(), 2);
        return lateralArea + basalArea;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}
