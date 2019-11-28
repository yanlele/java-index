package demo8;

public class Run {
    public static void main(String[] args) {
        int x, y;
        for (x = 1; x < 49; x++) {
            y = 49 - x;
            if (2 * x + 4 * y == 120) {
                System.out.println("chicken:" + x + " rabbit:" + y);
            }
        }
    }
}
