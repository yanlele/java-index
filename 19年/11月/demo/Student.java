package demo;

public class Student extends Person {
    protected String school = "cque";

    @Override
    public String getInfo() {
        return "Name: " + name + ", age: " + age + ", school: " + school;
    }
}
