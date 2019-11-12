package demo;

public class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getInfo() {
        return "Name: " + name + ", age: " + age + ", school: " + school + ", major: " + major;
    }
}
