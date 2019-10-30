public class Rectangle {
    private Double width;
    private Double height;
    private String color;
    private static int timer = 0;

    private Double getArea() {
        return this.height * this.width;
    }

    Rectangle(Double width, Double height, String color) {
        Rectangle.timer++;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    static int getTimer() {
        return Rectangle.timer;
    }
}
