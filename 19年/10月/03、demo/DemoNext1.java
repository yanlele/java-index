/**
 * 完成实验项目1
 * 1、输出以下图形
 */
public class DemoNext1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int m = 0; m < 5 - i; m++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
