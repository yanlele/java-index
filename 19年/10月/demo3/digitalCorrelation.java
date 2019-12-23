package demo3;

import java.util.ArrayList;

/**
 * 第三个题
 * 参考 https://blog.csdn.net/gyysmall/article/details/8481306
 */
public class digitalCorrelation {
    public static void main(String[] args) {
        getResult();
    }

    private static int getResult() {
        int one, tow, index = 0;
        System.out.println("满足条件的结果如下");
        for (one = 123; one <= 987; one++) { /*试探可能的第一个三位数*/
            for (tow = one + 1; tow <= 987; tow++) { /*试探可能的第二个三位数，要想不重复n=m+1，若重复考虑顺序n=123*/
                if (one + tow > 999) {
                    break;
                } else if (one != tow) { /*若满足题意*/
                    index++;
                    System.out.printf("输出结果 %d + %d = %d", one, tow, one + tow);
                    System.out.println();
                }
            }
        }
        return 0;
    }

    private static void isConform(int one, int two) {
        int result = one + two;

        String oneString = String.valueOf(one),
                twoString = String.valueOf(two),
                resultString = String.valueOf(result);

        ArrayList<Integer> oneArray = new ArrayList<>();
        ArrayList<Integer> twoArray = new ArrayList<>();
        ArrayList<Integer> resultArray = new ArrayList<>();

        oneArray = getIntegerArray(oneString);
        twoArray = getIntegerArray(twoString);
        resultArray = getIntegerArray(resultString);
    }

    private static ArrayList<Integer> getIntegerArray(String str) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        return arrayList;
    }
}
