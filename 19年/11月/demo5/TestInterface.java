package demo5;

public class TestInterface {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(5.0);
        ComparableCircle comparableCircle2 = new ComparableCircle(5.6);
        System.out.println(comparableCircle1.compareTo(comparableCircle2));

        ComparableRectangle comparableRectangle1 = new ComparableRectangle(5, 6);
        ComparableRectangle comparableRectangle2 = new ComparableRectangle(4,5);
        System.out.println(comparableRectangle1.compareTo(comparableRectangle2));
    }
}
