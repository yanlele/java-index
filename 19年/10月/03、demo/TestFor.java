/**
 * 第三题
 * for 循环语句练习
 * 程序功能：将1至100之间所有的整数求和。
 */
public class TestFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
