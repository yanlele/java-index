package demo10;

import java.util.ArrayList;

public class Index4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("王振", 1401011001, 20, "计算机"));
        students.add(new Student("刘莉莉", 1403020115, 19, "机械"));
        students.add(new Student("王红", 1601040316, 17, "化工"));

        for (Student student : students) {
            System.out.println(student.toString());
        }

        students.add(1, new Student("张芳", 1604010101, 17, "材料"));

        System.out.println("---------");
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
