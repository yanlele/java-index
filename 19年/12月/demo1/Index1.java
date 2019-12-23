package demo1;

import java.util.*;

public class Index1 {
    public static void main(String[] args) {
        Student s1 = new Student("王振", 1401011001, 20, "计算机");
        Student s2 = new Student("刘莉莉", 1403020115, 19, "机械");
        Student s3 = new Student("王红", 1601040316, 17, "化工");
        Student s4 = new Student("张芳", 1604010101, 17, "材料");

        List<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        // 自然排序
        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);

        // 自定义排序
        Collections.sort(studentArrayList, new MyComparator());
        System.out.println(studentArrayList);

        // 插入到 hashSet
        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println("-------------------");
        System.out.println(students);
        System.out.println("-------------------");

        // 插入到TreeSet
        TreeSet<Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.add(s1);
        studentTreeSet.add(s2);
        studentTreeSet.add(s3);
        studentTreeSet.add(s4);
        System.out.println(studentTreeSet);

        // 自然排序
        Iterator i = studentTreeSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // 定制排序
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // hashMap
        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(s1.getId(), s1);
        studentHashMap.put(s2.getId(), s2);
        studentHashMap.put(s3.getId(), s3);
        studentHashMap.put(s4.getId(), s4);

        // 遍历
        for (Map.Entry<Integer, Student> entry: studentHashMap.entrySet()) {
            System.out.println("key = " + entry.getKey() + " and value  = " + entry.getValue());
        }
    }
}
