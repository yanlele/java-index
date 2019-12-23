package demo3;

/**
 * 第五题
 * 程序功能：求1＋2＋…+100 之和，并将求和表达式与所求的和显示出来。
 */
public class Demo2_10 {
    public static void main(String[] args) {
        int n = 1, sum = 0;
        do {
            sum += n;
            n++;
        } while (n <=100);
        System.out.println("1+2＋...+100 ="+sum);
    }
}
