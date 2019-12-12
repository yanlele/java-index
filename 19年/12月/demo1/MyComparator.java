package demo1;

import java.util.Comparator;

public class MyComparator implements Comparable<Student>, Comparator<Student> {
    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
