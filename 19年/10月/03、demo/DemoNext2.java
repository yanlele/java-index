import java.util.Scanner;

/**
 * 完成实验项目2
 * 2、编成程序，接收一个键盘输入的整数，并判断其是否是素数。
 */
public class DemoNext2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " 是一个素数");
        } else {
            System.out.println(num + " 不是一个素数");
        }
    }

    /**
     * 盘算是不是素数
     * @param src sum
     * @return result
     */
    private static boolean isPrime(int src) {
        double sqrt = Math.sqrt(src);
        if (src < 2) {
            return false;
        }
        if (src == 2 || src == 3) {
            return true;
        }
        if (src % 2 == 0) {// 先判断是否为偶数，若偶数就直接结束程序
            return false;
        }
        for (int i = 3; i <= sqrt; i += 2) {
            if (src % i == 0) {
                return false;
            }
        }
        return true;
    }
}
