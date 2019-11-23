package demo6;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle("red", 10, 10);
        Circle circle2 = new Circle("blue", 12, 8);

        if (circle1.getColor().equals(circle2.getColor())) {
            System.out.println("颜色相同");
        } else {
            System.out.println("颜色不同");
        }

        System.out.println("半径是否相同： " + circle1.equals(circle2));

        System.out.println("circle1 的信息" + circle1.toString());
        System.out.println("circle2 的信息" + circle2.toString());
    }
}
