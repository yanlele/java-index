package demo;

public class Graduate extends Student {
    private String major = "IT";

    @Override
    public String getInfo() {
        return "Name: " + this.getName() + ", age: " + this.getAge() + ", school: " + this.getSchool() + ", major: " + this.major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
