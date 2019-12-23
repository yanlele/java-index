package demo3;

import java.util.Scanner;

/**
 * 完成实验项目3
 * 3、接收一个键盘输入的整数，计算1-1/2!+1/3!-1/4!.....1/n!
 */
public class DemoNext3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int n = scanner.nextInt();
        int x = -1;
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            x = x * (-1);
            float fac = 1;
            for (int j = 1; j <= i; j++) {
                fac = fac * j;
            }
            float k = 1 / fac;
            sum = sum + x * k;
        }
        System.out.println("sum=" + sum);
    }
}
