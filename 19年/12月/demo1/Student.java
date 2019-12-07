package demo1;

import java.util.Objects;

class Student implements Comparable<Student>{
    private String name;
    private Integer id;
    private int age;
    private String major;

    public Student(String name, int id, int age, String major) {
        super();
        this.name = name;
        this.id = id;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.age, this.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() &&
                getAge() == student.getAge() &&
                getName().equals(student.getName()) &&
                getMajor().equals(student.getMajor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getAge(), getMajor());
    }
}