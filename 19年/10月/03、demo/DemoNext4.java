
/**
 * 完成实验项目4
 * 4、水仙花数是指某个位、十位和百位三个数字的立方和等于这个三位数本身，输出所有的水仙花数。
 */
public class DemoNext4 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i % 100) / 10;
            int c = i / 100;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println(i);
            }
        }
    }
}
