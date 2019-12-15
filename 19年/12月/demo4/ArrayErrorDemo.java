package demo4;

public class ArrayErrorDemo {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i < a.length + 1; i++) {
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println("catch");
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }

    }
}
