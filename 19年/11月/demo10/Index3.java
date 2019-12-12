package demo10;

import java.util.ArrayList;
import java.util.Iterator;

public class Index3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");

        // for 循环遍历
        for (String name : arrayList) {
            System.out.println(name);
        }

        // iterator 循环遍历
        Iterator<String> itr = arrayList.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        arrayList.remove("王五");
        arrayList.add("王六");

        ArrayList<String> setSequenceList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            setSequenceList.add(i + ": " + arrayList.get(i));
        }

        for (String name: setSequenceList) {
            System.out.println(name);
        }
    }
}
