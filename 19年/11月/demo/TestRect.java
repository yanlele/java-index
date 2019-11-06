public class TestRect {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10.0, 20.0, "red");
        Double area = rectangle1.getArea();
        System.out.println("面积为: " + area);

        System.out.println("重新设定宽高");

        rectangle1.setHeight(30.0);
        rectangle1.setWidth(15.0);
        System.out.println("修改宽高之后的面积为： " + area);
    }
}
