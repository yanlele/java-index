/**
 * 第一题
 * 使用if...else 语句
 */
public class TestIfElse {
    public static void main(String[] args) {
        boolean leap;
        int year = 2005;
        leap = year % 4 == 4;
        if (leap)
            System.out.println(year + " 年是闰年");
        else
            System.out.println(year + " 年不是闰年");
    }
}
