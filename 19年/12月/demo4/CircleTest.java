package demo4;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Circle circle = new Circle();

        try {
            circle.setRadius(num);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
    }
}
