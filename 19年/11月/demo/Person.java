package demo;

public class Person {
    private String name = "person";
    private int age = 50;

    public String getInfo() {
        return "Name: " + name + ", age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
