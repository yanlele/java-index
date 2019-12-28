package demo6;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            if (5 == 0) {
                System.out.println("正确的");
            } else {
                throw new Exception("5 不等于 0");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
