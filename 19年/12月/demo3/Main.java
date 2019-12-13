package demo3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(-2.0);

        try {
            circle.setRadius(-2.0);
            circle.show();
        } catch (CircleException e) {
            System.out.println(e.toString());
            circle.show();
        }
    }
}
