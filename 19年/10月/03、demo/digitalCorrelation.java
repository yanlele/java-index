/**
 * 第三个题
 * 参考 https://blog.csdn.net/gyysmall/article/details/8481306
 */
public class digitalCorrelation {
    private static int a = 0;

    public static void main(String[] args) {
        getResult();
    }

    private static int getResult() {
        int m, n, count = 0, flag = 0;
        System.out.println("将1到9 这九个数字分成三个3位数");
        System.out.println("要求");
        System.out.println("3个数符合算式 ○○○+○○○=○○○");
        System.out.println("正好用尽1到9这九个数字,数中数字不能有重复。");
        System.out.println("\n满足条件的结果如下");
        for (m = 123; m <= 987; m++) { /*试探可能的第一个三位数*/
            for (n = m + 1; n <= 987; n++) { /*试探可能的第二个三位数，要想不重复n=m+1，若重复考虑顺序n=123*/
                if (m + n > 999) {
                    break;
                } else if (ok(m, a, 3) && ok(n, a + 3, 3) && ok(m + n, a + 6, 3)) { /*若满足题意*/
                    System.out.printf("输出结果 %d + %d = %d", m, n, n + m);
                    System.out.println();
                }
            }
        }
        return 0;
    }

    private static boolean ok(int t, int z, int bit) {
        int p1;
        int p2;
        for (p1 = z; p1 < z + bit; p1++) {
            p1 = t % 10;
            if (p1 == 0) {
                return false;
            }
            t /= 10;
            for (p2 = a; p2 < p1; p2++) {/*查询分解出的数字是否已经出现过*/
                if (p2 == p1) return false; /*如果出现重复数字则返回0*/
            }
        }
        return true;
    }
}
