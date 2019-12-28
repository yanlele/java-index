package demo6;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("宝批龙");
        list.add("有点儿笨");
        list.add("但是！");
        list.add("会写程序");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
