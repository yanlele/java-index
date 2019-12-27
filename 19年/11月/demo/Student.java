package demo;

public class Student extends Person {
    private String school = "cque";

    @Override
    public String getInfo() {
        return "Name: " + this.getName() + ", age: " + this.getAge() + ", school: " + this.school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
