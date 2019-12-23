package demo3;

/**
 * 第二个题
 */
public class Calculate {
    public static void main(String[] args) {
        System.out.println( getGCD(15, 23));
        System.out.println( getLCM(15, 23));
    }

    /**
     * 最大公约数(Greatest Common Divisor(GCD))
     * <p>
     * 概念： 最大公因数，也称最大公约数、最大公因子，指两个或多个整数共有约数中最大的一个。
     *
     * @param a 第一个数字
     * @param b 第二个数字
     * @return 返回最大公约数
     */
    private static int getGCD(int a, int b) {
        int max, min;
        max = (a > b) ? a : b;
        min = (a < b) ? a : b;

        if (max % min != 0) {
            return getGCD(min, max % min);
        } else
            return min;
    }

    /**
     * 最小公倍数(Least Common Multiple(LCM))
     * <p>
     * 概念：两个或多个整数公有的倍数叫做它们的公倍数，其中除0以外最小的一个公倍数就叫做这几个整数的最小公倍数。
     * 两个数的最小公倍数，就可以先求出它们的最大公约数， 然后在用他们的乘积除以最大公约数获得
     *
     * @param a 第一个数
     * @param b 第二个数
     * @return 返回最小公倍数
     */
    private static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }
}
