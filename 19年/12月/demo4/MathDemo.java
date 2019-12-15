package demo4;

public class MathDemo {
    public static double div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(div(10, 0));
        } catch (Exception e) {
            System.out.println("catch");
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
    }
}
